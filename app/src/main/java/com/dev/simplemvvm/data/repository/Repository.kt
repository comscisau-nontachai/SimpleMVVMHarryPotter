package com.dev.simplemvvm.data.repository

import com.dev.simplemvvm.model.CharacterModel

interface Repository {
    suspend fun getCharacters(type:String):List<CharacterModel>
}