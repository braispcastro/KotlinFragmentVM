package com.braispc.kotlinfragmentvm.ui

import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.braispc.kotlinfragmentvm.R
import com.braispc.kotlinfragmentvm.common.Constants

open class BaseFragment: Fragment() {

    companion object {

        @BindingAdapter("drawableName")
        fun ImageView.setDrawableName(drawableName: String) {
            setImageURI(Uri.parse("${Constants.IMAGE_RESOURCE_PATH}${drawableName}"))
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