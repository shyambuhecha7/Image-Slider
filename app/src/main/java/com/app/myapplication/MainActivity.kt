package com.app.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById<ViewPager2>(R.id.viewPager)
        tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        // Add your drawable resources (images) here
        val images = listOf(
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1
        )

        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter

        // Bind TabLayout and ViewPager2 together
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            // No need to do anything here, we just need to link the two components
        }.attach()

        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

    }

    //bedge
    // Add badge to the Notifications item
//    val badge = bottomNavigationView.getOrCreateBadge(R.id.nav_notifications)
//    badge.isVisible = true
//    badge.number = 10

    //custom

//    val badge = bottomNavigationView.getOrCreateBadge(R.id.nav_notifications)
//    badge.isVisible = true
//    badge.number = 10 // Set the badge count
//    badge.badgeGravity = BadgeDrawable.TOP_END // Adjust position
//    badge.backgroundColor = getColor(R.color.colorAccent) // Set background color
//    badge.badgeTextColor = getColor(R.color.white) // Set text color


    //remove
// bottomNavigationView.removeBadge(R.id.nav_notifications)


}
