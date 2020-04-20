package com.braispc.kotlinfragmentvm.ui.views

import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.braispc.kotlinfragmentvm.R
import com.braispc.kotlinfragmentvm.common.Constants
import com.braispc.kotlinfragmentvm.data.MenuDTO
import com.braispc.kotlinfragmentvm.ui.adapters.MenuAdapter

open class BaseFragment: Fragment() {

    companion object {

        @BindingAdapter("drawableName")
        fun ImageView.setDrawableName(drawableName: String) {
            setImageURI(Uri.parse("${Constants.IMAGE_RESOURCE_PATH}${drawableName}"))
        }

        @BindingAdapter("data")
        fun <T> RecyclerView.setRecyclerViewProperties(items: List<MenuDTO>) {
            if (adapter is MenuAdapter) {
                (adapter as MenuAdapter).setData(items)
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        if (id == R.id.settingsMenu) {
            findNavController().navigate(R.id.action_menuFragment_to_settingsFragment)
        }

        return super.onOptionsItemSelected(item)
    }
}