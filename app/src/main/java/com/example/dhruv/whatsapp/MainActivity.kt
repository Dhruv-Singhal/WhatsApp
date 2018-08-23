package com.example.dhruv.whatsapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.dhruv.whatsapp.R.id.tablayout
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.view.View
import android.view.Window
import android.R.menu
import android.support.v7.widget.Toolbar
import android.view.Menu
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_blank.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var toolbar =  findViewById(R.id.htab_toolbar) as Toolbar
        setSupportActionBar(toolbar)
        getSupportActionBar()!!.setTitle("")
        toolbar.inflateMenu(R.menu.main_menu)

        val mcontext=this.baseContext






        val viewPager = findViewById<View>(R.id.pager) as ViewPager
        val myPagerAdapter = MyPagerAdapter(supportFragmentManager)
        pager.offscreenPageLimit=0
        viewPager.adapter = myPagerAdapter
        val tabLayout = findViewById<View>(R.id.tablayout) as TabLayout
        tabLayout.setupWithViewPager(viewPager)




    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }







}
