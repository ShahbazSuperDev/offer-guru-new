package com.example.offerguru

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.View
import android.widget.ImageView
import android.widget.Toast

import androidx.annotation.RequiresApi
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.example.offerguru.fragment.*
import com.google.android.material.navigation.NavigationView

class MainActivity2 : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var actionBarToggle: ActionBarDrawerToggle
    private lateinit var navView: NavigationView

    @RequiresApi(Build.VERSION_CODES.N)
    @SuppressLint("WrongConstant", "NewApi")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawerlayout)

        toolbar = findViewById(R.id.toolbar)
        drawerLayout = findViewById(R.id.drawer_layout)
        val Threeline: ImageView = findViewById<View>(R.id.Threeline) as ImageView
        val Threedot: ImageView = findViewById<View>(R.id.Threedot) as ImageView
toolbar.inflateMenu(R.menu.menu)

        Threedot.setOnClickListener {
    Toast.makeText(this,"open", Toast.LENGTH_SHORT).show()
}
        // Pass the ActionBarToggle action into the drawerListener
        actionBarToggle = ActionBarDrawerToggle(this, drawerLayout, 0, 0)
        drawerLayout.addDrawerListener(actionBarToggle)

        // Display the hamburger icon to launch the drawer
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        drawerLayout.closeDrawer(Gravity.START)
        // Call syncState() on the action bar so it'll automatically change to the back button when the drawer layout is open
        actionBarToggle.syncState()
        Threeline.setOnClickListener {
            drawerLayout.openDrawer(Gravity.START)
        }

        // Call findViewById on the NavigationView
        navView = findViewById(R.id.nav_view)
        val fragment = supportFragmentManager.beginTransaction()
        toolbar?.title = "Dashboard"
        fragment.replace(R.id.framelayout, DashboardFragment()).commit()
        // Call setNavigationItemSelectedListener on the NavigationView to detect when items are clicked
        navView.setNavigationItemSelectedListener { menuItem ->


            drawerLayout.closeDrawers()
            when (menuItem.itemId) {
                R.id.db -> {
                    supportActionBar?.title = "Dashboard"
                    toolbar?.title = "Dashboard"
                    val fragment = supportFragmentManager.beginTransaction()

                    fragment.replace(R.id.framelayout, DashboardFragment()).commit()
                    Toast.makeText(this, "Order", Toast.LENGTH_SHORT).show()
                    true


                }
                   R.id.nav_order -> {
                       supportActionBar?.title = "Order"
                       toolbar?.title = "Order"
                       val fragment = supportFragmentManager.beginTransaction()

                       fragment.replace(R.id.framelayout, OrderFragment()).commit()
                       Toast.makeText(this, "Order", Toast.LENGTH_SHORT).show()
                       true
                   }
                   R.id.nav_offers -> {
                       supportActionBar?.title = "Offers"
                       toolbar?.title = "Offers"
                       val fragment = supportFragmentManager.beginTransaction()

                       fragment.replace(R.id.framelayout, OffersFragment()).commit()
                       Toast.makeText(this, "Offers", Toast.LENGTH_SHORT).show()
                       true
                   }
                R.id.nav_commision -> {
                    supportActionBar?.title = "Commision"
                    toolbar?.title = "Commision"
                    val fragment = supportFragmentManager.beginTransaction()

                    fragment.replace(R.id.framelayout, CommisionFragment()).commit()
                       Toast.makeText(this, "Commision", Toast.LENGTH_SHORT).show()
                       true
                   }
                R.id.nav_payout -> {
                    supportActionBar?.title = "Payout"
                    toolbar?.title = "Payout"
                    val fragment = supportFragmentManager.beginTransaction()

                    fragment.replace(R.id.framelayout, PayoutFragment()).commit()
                       Toast.makeText(this, "Payout", Toast.LENGTH_SHORT).show()
                       true
                   }
                R.id.nav_profile -> {
                    supportActionBar?.title = "Profile"
                    toolbar?.title = "Profile"
                    val fragment = supportFragmentManager.beginTransaction()

                    fragment.replace(R.id.framelayout, ProfileFragment()).commit()
                       Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show()
                       true
                   }
                R.id.nav_setting -> {
                    supportActionBar?.title = "Setting"
                    toolbar?.title = "Setting"
                    val fragment = supportFragmentManager.beginTransaction()

                    fragment.replace(R.id.framelayout, SettingFragment()).commit()
                       Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
                       true
                   }
                else -> {
                    false
                }

            }
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }
    override fun onResume() {
        super.onResume()

        navView.getMenu().getItem(0).setChecked(true)

    }
    // override the onSupportNavigateUp() function to launch the Drawer when the hamburger icon is clicked
    @SuppressLint("WrongConstant")
    override fun onSupportNavigateUp(): Boolean {
        drawerLayout.openDrawer(navView)

        return true

}
    }
