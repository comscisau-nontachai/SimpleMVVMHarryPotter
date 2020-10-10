package com.dev.simplemvvm.di

import com.dev.simplemvvm.ui.HouseType
import com.dev.simplemvvm.ui.detail.DetailViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel() { (type: HouseType) -> DetailViewModel(type, repository = get()) }
}