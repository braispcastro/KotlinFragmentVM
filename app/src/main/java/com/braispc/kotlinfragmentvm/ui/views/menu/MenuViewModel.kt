package com.braispc.kotlinfragmentvm.ui.views.menu

import android.widget.ListAdapter
import androidx.lifecycle.MutableLiveData
import com.braispc.kotlinfragmentvm.BuildConfig
import com.braispc.kotlinfragmentvm.data.MenuDTO
import com.braispc.kotlinfragmentvm.ui.views.MainViewModel
import java.util.*

class MenuViewModel: MainViewModel() {

    private var counter: Int = 0

    var updateText: MutableLiveData<String> = MutableLiveData()
    var codeText: MutableLiveData<String> = MutableLiveData()
    var versionText: MutableLiveData<String> = MutableLiveData()
    var backgroundImage: MutableLiveData<String> = MutableLiveData()
    var itemSource: MutableLiveData<List<MenuDTO>> = MutableLiveData()

    init {
        updateText.value = "UPDATE"
        codeText.value = "691"
        versionText.value = BuildConfig.VERSION_NAME
        backgroundImage.value = "space"

        itemSource.value = listOf(
            MenuDTO(1, "Uno"),
            MenuDTO(2, "Dos"),
            MenuDTO(3, "Tres"),
            MenuDTO(4, "Cuatro")
        )
    }

    fun onUpdateTap() {
        updateText.value = "UPDATE (${++counter})"
    }

}