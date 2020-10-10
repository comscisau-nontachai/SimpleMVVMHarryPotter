package com.dev.simplemvvm.ui

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import com.dev.simplemvvm.R

enum class HouseType(@DrawableRes val logo:Int,@ColorRes val color:Int){
    Gryffindor(R.drawable.logo_gryffindor,android.R.color.holo_red_dark),
    Slytherin(R.drawable.logo_slytherin, android.R.color.holo_green_dark),
    Ravenclaw(R.drawable.logo_ravenclaw, android.R.color.holo_blue_bright),
    Hufflepuff(R.drawable.logo_hufflepuff, R.color.yellow)
}