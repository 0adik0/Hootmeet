package com.decadescript.hotmeet.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.decadescript.hotmeet.R
import kotlinx.android.synthetic.main.activity_end.*

class EndActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)
        var percent = (60..100).random()
        testAnswer.text = String.format(
            getString(R.string.score),
            "$percent%"
        )
        tryBt.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
            finish()
        }
    }
}