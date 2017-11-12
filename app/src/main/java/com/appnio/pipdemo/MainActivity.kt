package com.appnio.pipdemo

import android.app.PictureInPictureParams
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Rational
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (isInPictureInPictureMode) {
            setContentView(R.layout.activity_pip)
            actionBar?.hide()
            supportActionBar?.hide()
        } else {
            setContentView(R.layout.activity_main)
            findViewById<Button>(R.id.button).setOnClickListener({ minimize() })
        }
    }

    private fun minimize() {
        val params: PictureInPictureParams = PictureInPictureParams.Builder().setAspectRatio(Rational(16, 9)).build()
        enterPictureInPictureMode(params)
    }
}
