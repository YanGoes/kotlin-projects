package br.com.exemplo.catalogodelivros

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        trocarFragment(ExploreFragment())

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigation.setOnItemSelectedListener { item ->

            if (item.itemId == R.id.nav_explore) {
                trocarFragment(ExploreFragment())
                true
            } else if (item.itemId == R.id.nav_library) {
                trocarFragment(LibraryFragment())
                true
            } else {
                false
            }
        }
    }

    private fun trocarFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}