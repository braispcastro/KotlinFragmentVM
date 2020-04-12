package com.braispc.kotlinfragmentvm.ui

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import com.braispc.kotlinfragmentvm.R
import com.braispc.kotlinfragmentvm.ui.main.MainViewModel
import kotlinx.android.synthetic.main.main_activity.*
import kotlinx.android.synthetic.main.menu_fragment.*

class MenuFragment : BaseFragment() {

    companion object {
        fun newInstance() = MenuFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.menu_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = MainViewModel()

        (activity as AppCompatActivity).toolbar.title = "KOTLIN"
        (activity as AppCompatActivity).toolbar.subtitle = "Fragment navigation"

        (activity as AppCompatActivity).toolbar.navigationIcon = resources.getDrawable(R.drawable.ic_home)
        (activity as AppCompatActivity).toolbar.setNavigationOnClickListener() {}

        btnUpdate.setOnClickListener() { }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.settings_menu, menu);
    }

}
