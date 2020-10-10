package com.dev.simplemvvm.ui.detail

import android.database.DatabaseUtils
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.customview.customView
import com.dev.simplemvvm.R
import com.dev.simplemvvm.databinding.DialogDetailBinding
import com.dev.simplemvvm.databinding.ItmeCharacterBinding
import com.dev.simplemvvm.model.CharacterModel

class DetailAdapter : RecyclerView.Adapter<DetailAdapter.DetailViewHolder>() {

    var itemList = listOf<CharacterModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailViewHolder =
        DataBindingUtil.inflate<ItmeCharacterBinding>(
            LayoutInflater.from(parent.context),
            R.layout.itme_character,
            parent,
            false
        ).let {
            it.constraintLayoutItemArea.layoutParams.height = (parent.width / 3) * 2
            DetailViewHolder(it)
        }

    override fun getItemCount(): Int = itemList.size

    override fun onBindViewHolder(holder: DetailViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    inner class DetailViewHolder(private val binding: ItmeCharacterBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: CharacterModel) {
            binding.apply {
                character = item
                executePendingBindings()
                root.setOnClickListener {
                    MaterialDialog(root.context).show {
                        customView(
                            view = DataBindingUtil.inflate<DialogDetailBinding>(
                                LayoutInflater.from(root.context),
                                R.layout.dialog_detail,
                                null,
                                false
                            ).also {
                                it.character = binding.character
                                it.imageViewDialogDetailPhoto.clipToOutline = true
                            }.root
                        )
                    }
                }
            }
        }
    }

}