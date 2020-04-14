package com.braispc.kotlinfragmentvm.ui.menu

import androidx.lifecycle.MutableLiveData
import com.braispc.kotlinfragmentvm.ui.MainViewModel

class MenuViewModel: MainViewModel() {

    var counter: Int = 0
    var updateText: MutableLiveData<String> = MutableLiveData()
    var backgroundImage: MutableLiveData<String> = MutableLiveData()

    init {
        updateText.value = "UPDATE"
        backgroundImage.value = "space"
    }

    fun onUpdateTap() {
        updateText.value = "UPDATE (${++counter})"
    }

}