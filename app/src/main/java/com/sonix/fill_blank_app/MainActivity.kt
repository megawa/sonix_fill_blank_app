package com.sonix.fill_blank_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val appBarConfiguration = AppBarConfiguration
            .Builder(
                R.id.topFragment
            )
            .build()
        val navController = NavHostFragment.findNavController(nav_host_fragment)
        toolbar.setupWithNavController(navController, appBarConfiguration)
    }
}