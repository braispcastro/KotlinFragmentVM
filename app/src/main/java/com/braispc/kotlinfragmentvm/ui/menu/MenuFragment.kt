package com.braispc.kotlinfragmentvm.ui.menu

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.braispc.kotlinfragmentvm.R
import com.braispc.kotlinfragmentvm.databinding.MenuFragmentBinding
import com.braispc.kotlinfragmentvm.ui.BaseFragment
import kotlinx.android.synthetic.main.main_activity.*

class MenuFragment : BaseFragment() {

    companion object {
        fun newInstance() = MenuFragment()
    }

    private lateinit var binding: MenuFragmentBinding
    private lateinit var viewModel: MenuViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.menu_fragment, container, false)
        viewModel = MenuViewModel()

        // Properties
        viewModel.updateText.observe(viewLifecycleOwner, Observer { btnUpdateText ->
            binding.btnUpdate.text = btnUpdateText
        })

        // Buttons
        binding.btnUpdate.setOnClickListener { viewModel.onUpdateTap() }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        (activity as AppCompatActivity).toolbar.title = "KOTLIN"
        (activity as AppCompatActivity).toolbar.subtitle = "Fragment navigation"

        (activity as AppCompatActivity).toolbar.navigationIcon = resources.getDrawable(R.drawable.ic_home)
        (activity as AppCompatActivity).toolbar.setNavigationOnClickListener() {}
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.settings_menu, menu)
    }

}
