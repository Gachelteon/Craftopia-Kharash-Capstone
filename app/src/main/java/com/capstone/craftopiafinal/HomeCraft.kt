package com.capstone.craftopiafinal

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class HomeCraft : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var drawerToggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_craft)

        drawerLayout = findViewById(R.id.drawer_layout)
        navigationView = findViewById(R.id.nav_views)
        drawerToggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navigationView.setNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.Ebooks -> {
                    Toast.makeText(this@HomeCraft, "Ebooks Selected", Toast.LENGTH_SHORT).show()
                }
                R.id.About -> {
                    Toast.makeText(this@HomeCraft, "About Selected", Toast.LENGTH_SHORT).show()
                }
                R.id.item2 -> {
                    Toast.makeText(this@HomeCraft, "Item 2 Selected", Toast.LENGTH_SHORT).show()
                }
                R.id.tools -> {
                    Toast.makeText(this@HomeCraft, "Tools Selected", Toast.LENGTH_SHORT).show()
                }
                R.id.handcraftes -> {
                    Toast.makeText(this@HomeCraft, "Handcrafted Creations Selected", Toast.LENGTH_SHORT).show()
                }
                R.id.raw -> {
                    Toast.makeText(this@HomeCraft, "Raw Materials Selected", Toast.LENGTH_SHORT).show()
                }
                // Handle other menu items if needed
            }
            true
        }
    }

    override fun onOptionsItemSelected(menuItem: MenuItem): Boolean {
        if (drawerToggle.onOptionsItemSelected(menuItem)) {
            return true
        }
        return super.onOptionsItemSelected(menuItem)
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}
