package com.braispc.kotlinfragmentvm.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.braispc.kotlinfragmentvm.R

class MainActivity : AppCompatActivity() {

    lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }
}
