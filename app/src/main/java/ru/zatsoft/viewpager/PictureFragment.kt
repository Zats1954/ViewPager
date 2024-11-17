package ru.zatsoft.viewpager

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class PictureFragment : Fragment() {

    private var check = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_picture, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvViewPager = view.findViewById<TextView>(R.id.tvViewPager)
        val ivPicture = view.findViewById<ImageView>(R.id.ivPicture)
        val tvAuthor = view.findViewById<TextView>(R.id.tvAuthor)
        val btnStart = view.findViewById<Button>(R.id.btnStart)
        val viewPagerItem = arguments?.getParcelable<OnViewPagerModel>("picture")
        check = viewPagerItem?.check!!
        tvViewPager.text = viewPagerItem.name
        ivPicture.setImageResource(viewPagerItem.imageView)
        tvAuthor.text = viewPagerItem.author
        if(!check){
            btnStart.visibility = View.VISIBLE
            btnStart.setOnClickListener {
                startActivity(Intent(activity, StartActivity::class.java))
            }
        }

    }
}