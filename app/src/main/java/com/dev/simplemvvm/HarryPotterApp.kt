package com.dev.simplemvvm

import android.app.Application
import com.dev.simplemvvm.di.dataSourceModule
import com.dev.simplemvvm.di.networkModule
import com.dev.simplemvvm.di.repositoryModule
import com.dev.simplemvvm.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class HarryPotterApp : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@HarryPotterApp)
            modules(dataSourceModule)
            modules(repositoryModule)
            modules(viewModelModule)
            modules(networkModule)
        }
    }
}