package com.dev.simplemvvm.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.dev.simplemvvm.data.repository.Repository
import com.dev.simplemvvm.model.CharacterModel
import com.dev.simplemvvm.ui.HouseType
import kotlinx.coroutines.Dispatchers

class DetailViewModel(house:HouseType,private val repository: Repository):ViewModel(){

    val characterList : LiveData<List<CharacterModel>> = liveData(Dispatchers.IO){
        isLoading.postValue(true)
        emit(repository.getCharacters(house.name))
        isLoading.postValue(false)
    }
    val isLoading = MutableLiveData<Boolean>()
}