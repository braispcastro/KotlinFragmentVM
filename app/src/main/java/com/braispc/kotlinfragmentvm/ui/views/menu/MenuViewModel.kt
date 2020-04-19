package com.braispc.kotlinfragmentvm.ui.views.menu

import android.widget.ListAdapter
import androidx.lifecycle.MutableLiveData
import com.braispc.kotlinfragmentvm.BuildConfig
import com.braispc.kotlinfragmentvm.ui.views.MainViewModel
import java.util.*

class MenuViewModel: MainViewModel() {

    private var counter: Int = 0

    var updateText: MutableLiveData<String> = MutableLiveData()
    var codeText: MutableLiveData<String> = MutableLiveData()
    var versionText: MutableLiveData<String> = MutableLiveData()
    var backgroundImage: MutableLiveData<String> = MutableLiveData()
    var itemSource: MutableLiveData<List<Int>> = MutableLiveData()

    init {
        updateText.value = "UPDATE"
        codeText.value = "691"
        versionText.value = BuildConfig.VERSION_NAME
        backgroundImage.value = "space"

        itemSource.value = listOf(1, 2, 3, 4, 5)
    }

    fun onUpdateTap() {
        updateText.value = "UPDATE (${++counter})"
    }

}