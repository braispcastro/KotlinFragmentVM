package com.braispc.kotlinfragmentvm.ui.settings

import androidx.lifecycle.MutableLiveData
import com.braispc.kotlinfragmentvm.ui.MainViewModel

class SettingsViewModel: MainViewModel() {

    var mainText: MutableLiveData<String> = MutableLiveData()

    init {
        mainText.value = "S E T T I N G S"
    }

}