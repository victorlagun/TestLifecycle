package com.techmeskills.testlifecycle

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private val _liveData = MutableLiveData<String>()
    val liveData: LiveData<String> = _liveData

    private val _transformLiveData = Transformations.map(_liveData) {
        it + "_transformed"
    }
    val transformLiveData: LiveData<String> = _transformLiveData

    fun changeData(data: String) {
        _liveData.postValue(data)
    }


}