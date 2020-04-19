package com.braispc.kotlinfragmentvm.ui.views

import android.graphics.PixelFormat
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.braispc.kotlinfragmentvm.R
import com.braispc.kotlinfragmentvm.databinding.MenuFragmentBinding

class MainActivity : AppCompatActivity() {

    lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }
}
