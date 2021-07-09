package com.example.dindinn.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.databinding.DataBindingUtil
import com.example.dindinn.R
import com.example.dindinn.databinding.ActivitySplashBinding

class SplashActivity: BaseActivity() {

    lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)

        makeDelayAndNavigate()
    }

    /**
     * make delay for splash scree
     * After delay, navigate to home screen
     */
    private fun makeDelayAndNavigate() {
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(applicationContext, MainActivity::class.java))
            finish()
        }, 2000)
    }
}