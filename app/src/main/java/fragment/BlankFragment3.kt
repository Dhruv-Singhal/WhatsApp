package fragment


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dhruv.whatsapp.*

import com.example.dhruv.whatsapp.R.drawable.cal
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.fragment_blank.*
import kotlinx.android.synthetic.main.fragment_blank_fragment3.*

class BlankFragment3() : Fragment() {






    val courses=ArrayList<Course>()





    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {











        courses.add(Course("BITS queries","hello how are you?","4:00p.m." ))
        courses.add(Course("Dualites","go to ykjsdflj","2:00p.m." ))
        courses.add(Course("Budh bhawan","come to common room","1:00p.m." ))
        courses.add(Course("MBA preparation","go away problem","8:00p.m." ))
        courses.add(Course("Coding Club","we will be handling oasis from now on","4:00p.m." ))
        courses.add(Course("RISHABH","where the hell are you","3:00p.m." ))












        return inflater.inflate(R.layout.fragment_blank_fragment3, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)









        rvcoursesb.layoutManager= GridLayoutManager(activity,1, RecyclerView.VERTICAL,false)



        rvcoursesb.adapter = CourseAdapter(courses)

    }



}
