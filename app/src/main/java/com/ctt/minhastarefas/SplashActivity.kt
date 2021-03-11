package com.ctt.minhastarefas

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long = 4000 // ~2 seg
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}

//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        supportActionBar?.hide()
//        nextActivity()
//    }
//
//    fun nextActivity() {
//        Handler(
//            Looper.getMainLooper()).postDelayed({
//            val telaTarefas =
//                Intent(this, TelaFragments::class.java)
//            startActivity(telaTarefas)
//            finish()
//        }, 4000)}
//
//}