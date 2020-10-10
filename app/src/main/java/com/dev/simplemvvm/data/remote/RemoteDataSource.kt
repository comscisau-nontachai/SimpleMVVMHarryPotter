package com.dev.simplemvvm.data.remote

import com.dev.simplemvvm.model.CharacterModel

interface RemoteDataSource {
    suspend fun getCharacters(type:String) : List<CharacterModel>
}