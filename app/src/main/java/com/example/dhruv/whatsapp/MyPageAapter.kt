package com.example.dhruv.whatsapp

import android.app.Activity
import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.util.Log
import com.example.dhruv.whatsapp.R.id.fab
import fragment.BlankFragment
import fragment.BlankFragment2
import fragment.BlankFragment3
import kotlinx.android.synthetic.main.activity_main.*


public class MyPagerAdapter(fm:FragmentManager): FragmentStatePagerAdapter(fm) {





    override fun getItem(position: Int): Fragment? {


        Log.d("position","$position")
        when (position) {


            0 -> return BlankFragment()

            1 -> return BlankFragment2()
            2 -> return BlankFragment3()
        }
        return BlankFragment()

    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "CHATS"
            1 -> return "STATUS"
            2->return "CALLS"
            else -> return "CHATS"
        }
    }


}