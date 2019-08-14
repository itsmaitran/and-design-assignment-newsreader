package com.lambdaschool.newsreaderapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.newsreaderapp.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    companion object {
        const val REQUEST_NEWS_GET = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_sign_in.setOnClickListener {
            val signInIntent = Intent(this, ListActivity::class.java)
            startActivityForResult(signInIntent,REQUEST_NEWS_GET)
        }
    }
}
