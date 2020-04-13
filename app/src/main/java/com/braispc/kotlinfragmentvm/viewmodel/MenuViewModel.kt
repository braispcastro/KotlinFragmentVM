package com.braispc.kotlinfragmentvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MenuViewModel: ViewModel() {

    var updateText: MutableLiveData<String> = MutableLiveData()

    init {
        updateText.value = "U P D A T E"
    }

}