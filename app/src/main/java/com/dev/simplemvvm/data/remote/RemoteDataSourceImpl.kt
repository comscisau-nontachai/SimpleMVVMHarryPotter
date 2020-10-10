package com.dev.simplemvvm.data.remote

import com.dev.simplemvvm.data.service.HarryPotterService
import com.dev.simplemvvm.model.CharacterModel

class RemoteDataSourceImpl(private val service : HarryPotterService) : RemoteDataSource {
    override suspend fun getCharacters(type: String) = service.getCharacters(type)
}
