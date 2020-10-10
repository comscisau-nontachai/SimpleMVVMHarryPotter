package com.dev.simplemvvm.di

import com.dev.simplemvvm.data.remote.RemoteDataSource
import com.dev.simplemvvm.data.remote.RemoteDataSourceImpl
import org.koin.dsl.module

val dataSourceModule = module {
    single<RemoteDataSource> { RemoteDataSourceImpl(service = get()) }
}