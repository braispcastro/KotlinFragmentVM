package com.braispc.kotlinfragmentvm.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.braispc.kotlinfragmentvm.R
import com.braispc.kotlinfragmentvm.ui.main.MainViewModel
import kotlinx.android.synthetic.main.main_activity.*

class SettingsFragment: BaseFragment() {

    companion object {
        fun newInstance() = SettingsFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.settings_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = MainViewModel()

        (activity as AppCompatActivity).toolbar.title = "Settings"
        (activity as AppCompatActivity).toolbar.subtitle = null

        (activity as AppCompatActivity).toolbar.navigationIcon = resources.getDrawable(R.drawable.ic_arrow_back)
        (activity as AppCompatActivity).toolbar.setNavigationOnClickListener() { findNavController().navigateUp() }
    }

}