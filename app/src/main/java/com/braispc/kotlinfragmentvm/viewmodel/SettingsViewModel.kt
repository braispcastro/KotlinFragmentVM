package com.braispc.kotlinfragmentvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SettingsViewModel: ViewModel() {

    var mainText: MutableLiveData<String> = MutableLiveData()

    init {
        mainText.value = "S E T T I N G S"
    }

}