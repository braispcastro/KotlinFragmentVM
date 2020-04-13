package com.braispc.kotlinfragmentvm.ui.menu

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MenuViewModel: ViewModel() {

    var counter: Int = 0
    var updateText: MutableLiveData<String> = MutableLiveData()

    init {
        updateText.value = "UPDATE"
    }

    fun onUpdateTap() {
        updateText.value = "UPDATE (${++counter})"
    }

}