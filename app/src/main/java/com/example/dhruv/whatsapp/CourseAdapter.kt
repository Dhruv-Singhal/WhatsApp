package com.example.dhruv.whatsapp

import android.content.Context
import android.content.Intent
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.itema.view.*


class CourseAdapter (

        val courses: ArrayList<Course>
): RecyclerView.Adapter<CourseAdapter.CourseViewHolder>() {




    override fun getItemViewType(position: Int): Int {
        return when (position) {
            0 -> 0
            else -> 1
        }
    }

    override fun getItemCount(): Int = courses.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =

            CourseViewHolder(
                    (parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
                            .inflate(
                                    R.layout.itema
                                    ,
                                    parent, false
                            )
            )




    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        holder.bindData(courses[position])



    }



    class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

val group=itemView.groupanme
        val tim=itemView.time

        val tex=itemView.rubbish


        fun bindData (course: Course) {
            group.text = course.group
            tim.text = course.time
            tex.text = course.rubbish

        }
    }

}
