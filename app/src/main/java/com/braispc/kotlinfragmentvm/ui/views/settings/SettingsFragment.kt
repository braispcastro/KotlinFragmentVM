package com.braispc.kotlinfragmentvm.ui.views.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.navigation.navGraphViewModels
import com.braispc.kotlinfragmentvm.R
import com.braispc.kotlinfragmentvm.databinding.SettingsFragmentBinding
import com.braispc.kotlinfragmentvm.ui.views.BaseFragment
import kotlinx.android.synthetic.main.main_activity.*

class SettingsFragment: BaseFragment() {

    companion object {
        fun newInstance() = SettingsFragment()
    }

    private lateinit var binding: SettingsFragmentBinding
    private val viewModel: SettingsViewModel by navGraphViewModels(R.id.settingsFragment)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.settings_fragment, container, false)

        // Properties
        viewModel.mainText.observe(viewLifecycleOwner, Observer { x ->
            binding.message.text = x
        })

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        (activity as AppCompatActivity).toolbar.title = "Settings"
        (activity as AppCompatActivity).toolbar.subtitle = null

        (activity as AppCompatActivity).toolbar.navigationIcon = resources.getDrawable(R.drawable.ic_arrow_back)
        (activity as AppCompatActivity).toolbar.setNavigationOnClickListener() { findNavController().popBackStack() }
    }

}