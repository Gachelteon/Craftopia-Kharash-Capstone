package com.capstone.craftopiafinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class Orderlist : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var drawerToggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orderlist)
        drawerLayout = findViewById(R.id.drawer_layout2)
        navigationView = findViewById(R.id.nav_view2)
        drawerToggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navigationView.setNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.Ebooks -> {
                    Toast.makeText(this@Orderlist, "Ebooks Selected", Toast.LENGTH_SHORT).show()
                }
                R.id.About -> {
                    Toast.makeText(this@Orderlist, "About Selected", Toast.LENGTH_SHORT).show()
                }
                R.id.item2 -> {
                    Toast.makeText(this@Orderlist, "Item 2 Selected", Toast.LENGTH_SHORT).show()
                }
                R.id.tools -> {
                    Toast.makeText(this@Orderlist, "Tools Selected", Toast.LENGTH_SHORT).show()
                }
                R.id.handcraftes -> {
                    Toast.makeText(this@Orderlist, "Handcrafted Creations Selected", Toast.LENGTH_SHORT).show()
                }
                R.id.raw -> {
                    Toast.makeText(this@Orderlist, "Raw Materials Selected", Toast.LENGTH_SHORT).show()
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