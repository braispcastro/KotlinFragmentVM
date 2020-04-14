package com.braispc.kotlinfragmentvm.ui.menu

import android.net.Uri
import android.os.Bundle
import android.view.*
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.navGraphViewModels
import com.braispc.kotlinfragmentvm.R
import com.braispc.kotlinfragmentvm.common.Constants
import com.braispc.kotlinfragmentvm.databinding.MenuFragmentBinding
import com.braispc.kotlinfragmentvm.ui.BaseFragment
import kotlinx.android.synthetic.main.main_activity.*
import kotlinx.android.synthetic.main.menu_fragment.*

class MenuFragment : BaseFragment() {

    companion object {
        fun newInstance() = MenuFragment()
    }

    private lateinit var binding: MenuFragmentBinding
    private val viewModel: MenuViewModel by navGraphViewModels(R.id.menuFragment)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.menu_fragment, container, false)

        // Properties
        //viewModel.updateText.observe(viewLifecycleOwner, Observer { x ->
        //    binding.btnUpdate.text = x
        //})

        viewModel.codeText.observe(viewLifecycleOwner, Observer { x ->
            binding.txtCode.text = x
        })

        viewModel.versionText.observe(viewLifecycleOwner, Observer { x ->
            binding.txtVersion.text = x
        })

        viewModel.backgroundImage.observe(viewLifecycleOwner, Observer { x ->
            binding.imgBackground.setDrawableName(x)
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
