package com.clallavena.pixelartdesign

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.clallavena.pixelartdesign.ui.main.MainFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)


        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.nav_host_fragment, MainFragment.newInstance())
                    .commitNow()
        }
    }

    private fun configureBottomNav() {
    }
}