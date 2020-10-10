package com.dev.simplemvvm.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.dev.simplemvvm.R
import com.dev.simplemvvm.databinding.ItemHouseBinding
import com.dev.simplemvvm.ui.HouseType

class MainAdapter(val action: (ImageView, HouseType) -> Unit) :
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    inner class MainViewHolder(private val binding: ItemHouseBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: HouseType) {
            binding.apply {
                house = item
                executePendingBindings()
                root.setOnClickListener { action(binding.imageviewItemHouseLogo,item) }
            }
        }
    }

    private val items =  mutableListOf(
        HouseType.Gryffindor,
        HouseType.Slytherin,
        HouseType.Ravenclaw,
        HouseType.Hufflepuff
    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder =
        DataBindingUtil.inflate<ItemHouseBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_house,
            parent,
            false
        ).let { MainViewHolder(it) }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(item = items[position])
    }
}