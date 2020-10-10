package com.dev.simplemvvm.data.service

import com.dev.simplemvvm.model.CharacterModel
import retrofit2.http.GET
import retrofit2.http.Path

interface HarryPotterService {

    @GET("api/characters/house/{house}")
    suspend fun getCharacters(@Path("house") type:String) : List<CharacterModel>

}
