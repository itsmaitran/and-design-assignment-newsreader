package com.lambdaschool.newsreaderapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.lambdaschool.newsreaderapp.R
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    companion object {
        const val REQUEST_DETAILS_GET = 2
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val views = mutableListOf<ImageView>()
            views.add(0, ImageView(this))
            views[0].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.top_news))
            views.add(1, ImageView(this))
            views[1].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.sports))
            views.add(2, ImageView(this))
            views[2].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.us))
            views.add(3, ImageView(this))
            views[3].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.world))
            views.add(4, ImageView(this))
            views[4].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.science))
            views.add(5, ImageView(this))
            views[5].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.technology))
            views.add(6, ImageView(this))
            views[6].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.entertainment))
            views.add(7, ImageView(this))
            views[7].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.business))

        val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)

        views.forEachIndexed { index, imageView ->
            imageView.layoutParams = layoutParams
            imageView.adjustViewBounds = true
            imageView.setPadding(16, 16, 16, 16)
            if (index % 2 == 0) {
                ll_left_column.addView(imageView)
            } else {
                ll_right_column.addView(imageView)
            }
            imageView.setOnClickListener {
                val imageIntent = Intent(this, DetailsActivity::class.java)
                startActivityForResult(imageIntent, REQUEST_DETAILS_GET)
            }
        }
    }
}
