package com.braispc.kotlinfragmentvm.ui.views.menu

import android.content.Context
import android.graphics.Rect
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.*
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.marginStart
import androidx.core.view.setMargins
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.navGraphViewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import com.braispc.kotlinfragmentvm.R
import com.braispc.kotlinfragmentvm.databinding.MenuFragmentBinding
import com.braispc.kotlinfragmentvm.ui.adapters.MenuAdapter
import com.braispc.kotlinfragmentvm.ui.views.BaseFragment
import kotlinx.android.synthetic.main.main_activity.*


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
        viewModel.updateText.observe(viewLifecycleOwner, Observer { x ->
            binding.textView.text = x
        })

        viewModel.codeText.observe(viewLifecycleOwner, Observer { x ->
            binding.txtCode.text = x
        })

        viewModel.versionText.observe(viewLifecycleOwner, Observer { x ->
            binding.txtVersion.text = x
        })

        viewModel.backgroundImage.observe(viewLifecycleOwner, Observer { x ->
            binding.imgBackground.setDrawableName(x)
        })

        viewModel.itemSource.observe(viewLifecycleOwner, Observer { x ->
            binding.rvMenu.adapter = MenuAdapter()
            binding.rvMenu.layoutManager = LinearLayoutManager(requireContext(), VERTICAL, false)
            binding.rvMenu.setRecyclerViewProperties<Int>(x)
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
