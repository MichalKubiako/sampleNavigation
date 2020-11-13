package com.michalkubiak.samplenavigationcomponent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import kotlinx.android.synthetic.main.activity_menu.*

class ActivityMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment //TODO 1st line
        setupWithNavController(bottom_menu, navHostFragment.navController) //TODO 2nd line

        /** NAVIGATION MENU ONLY IN 2 LINES OF CODE!! **/
    }
}