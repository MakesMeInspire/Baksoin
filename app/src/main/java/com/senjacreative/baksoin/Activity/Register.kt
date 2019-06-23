package com.senjacreative.baksoin.Activity

import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.Window
import android.view.WindowManager
import com.senjacreative.baksoin.R
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = ContextCompat.getColor(this,R.color.colorWhite)
        }
        setContentView(R.layout.activity_register)

        tv_login.setOnClickListener {
            intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }
    }
}
