package com.vicksoson.activitytutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vicksoson.activitytutorial.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // get the text from the intent
        // https://developer.android.com/reference/android/content/Intent
        val text = intent.extras?.get("text").toString()

        // set the text to the text view
        binding.textView.text = text

        binding.button.setOnClickListener {
            //set the result
            setResult(RESULT_OK, Intent().apply {
                putExtra("result", binding.inputField.text.toString())
            })
            // finish() is used to close the current activity
            finish()
        }
    }
}