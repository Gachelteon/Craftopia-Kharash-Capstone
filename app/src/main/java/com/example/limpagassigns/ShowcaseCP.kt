package com.example.limpagassigns

import android.os.Bundle
import android.widget.ImageView
import android.widget.SearchView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class ShowcaseCP : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var drawerToggle: ActionBarDrawerToggle

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (drawerToggle.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_showcase_cp)
        supportActionBar!!.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar!!.setCustomView(R.layout.action_layout)
        val searchView: SearchView = findViewById(R.id.searchView)
        searchView.clearFocus()

        // Set custom left icon
        val leftIconId = resources.getIdentifier("android:id/search_mag_icon", null, null)
        val leftIcon = findViewById<ImageView>(leftIconId)
        leftIcon.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.leftsearch))

        // Set custom right icon
        val rightIconId = resources.getIdentifier("android:id/search_close_btn", null, null)
        val rightIcon = findViewById<ImageView>(rightIconId)
        rightIcon.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.rightsearch))
        drawerLayout = findViewById(R.id.drawer_layout)
        navigationView = findViewById(R.id.nav_views)
        drawerToggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navigationView.setNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.About -> {
                    Toast.makeText(this@ShowcaseCP, "Home Selected", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}
