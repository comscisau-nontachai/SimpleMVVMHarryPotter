package com.dev.simplemvvm.data.repository

import com.dev.simplemvvm.data.remote.RemoteDataSource
import com.dev.simplemvvm.model.CharacterModel

class RepositoryImpl (private val dataSource: RemoteDataSource) : Repository{
    override suspend fun getCharacters(type: String): List<CharacterModel> {
        return dataSource.getCharacters(type)
    }
}