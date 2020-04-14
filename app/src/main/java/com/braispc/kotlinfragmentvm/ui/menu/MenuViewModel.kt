package com.braispc.kotlinfragmentvm.ui.menu

import androidx.lifecycle.MutableLiveData
import com.braispc.kotlinfragmentvm.BuildConfig
import com.braispc.kotlinfragmentvm.ui.MainViewModel

class MenuViewModel: MainViewModel() {

    private var counter: Int = 0

    var updateText: MutableLiveData<String> = MutableLiveData()
    var codeText: MutableLiveData<String> = MutableLiveData()
    var versionText: MutableLiveData<String> = MutableLiveData()
    var backgroundImage: MutableLiveData<String> = MutableLiveData()

    init {
        updateText.value = "UPDATE"
        codeText.value = "691"
        versionText.value = BuildConfig.VERSION_NAME
        backgroundImage.value = "space"
    }

    fun onUpdateTap() {
        updateText.value = "UPDATE (${++counter})"
    }

}