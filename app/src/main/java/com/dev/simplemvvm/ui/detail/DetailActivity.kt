package com.dev.simplemvvm.ui.detail

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.core.app.ActivityOptionsCompat
import com.dev.simplemvvm.R
import com.dev.simplemvvm.base.BaseActivity
import com.dev.simplemvvm.databinding.ActivityDetailBinding
import com.dev.simplemvvm.ui.HouseType
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class DetailActivity : BaseActivity() {

    companion object{
        private const val KEY_HOUSE = "house"
        fun startActivityWithTransition(
            activity: Activity,
            imageView: ImageView,
            type: HouseType
        ){
            val intent = Intent(activity,DetailActivity::class.java)
            intent.putExtra(KEY_HOUSE,type)

            activity.startActivity(intent)
        }
    }

    private val binding by binding<ActivityDetailBinding>(R.layout.activity_detail)
    private val house by lazy { intent.getSerializableExtra(KEY_HOUSE) as HouseType }
    private val viewModel :DetailViewModel by viewModel{ parametersOf(house)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.apply {
            house = this@DetailActivity.house
            lifecycleOwner = this@DetailActivity
            viewModel = this@DetailActivity.viewModel
        }
    }
}