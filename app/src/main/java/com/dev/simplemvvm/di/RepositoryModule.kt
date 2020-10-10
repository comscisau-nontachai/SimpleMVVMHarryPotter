package com.dev.simplemvvm.di

import com.dev.simplemvvm.data.repository.Repository
import com.dev.simplemvvm.data.repository.RepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<Repository> { RepositoryImpl(dataSource = get()) }
}