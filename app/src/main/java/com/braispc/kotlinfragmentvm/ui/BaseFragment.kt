package com.braispc.kotlinfragmentvm.ui

import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.braispc.kotlinfragmentvm.R

open class BaseFragment: Fragment() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        if (id == R.id.settingsMenu) {
            findNavController().navigate(R.id.settingsFragment)
        }

        return super.onOptionsItemSelected(item)
    }
}