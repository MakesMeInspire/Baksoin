package com.senjacreative.baksoin.Activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import com.senjacreative.baksoin.R

class Splash : AppCompatActivity() {

    private lateinit var mHandler: Handler
    private lateinit var mRunnable: Runnable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)

        mHandler = Handler()
        mRunnable = Runnable {
            intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }

        mHandler.postDelayed(
                mRunnable,2555
        )
    }
}
