package com.vicksoson.activitytutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vicksoson.activitytutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // View Binding
    // https://developer.android.com/topic/libraries/view-binding
    private lateinit var binding: ActivityMainBinding

    // onCreate() is the first method that is called when the activity is created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // View Binding
        //assign the binding variable to the binding object
        binding = ActivityMainBinding.inflate(layoutInflater)
        //set the content view to the root of the binding object
        setContentView(binding.root)

        // get the text from the edit text
        val text = binding.inputField.text

        // set click listener on button
        binding.button.setOnClickListener {
            // create an intent
            // Intent is an abstract description of an operation to be performed
            // https://developer.android.com/reference/android/content/Intent
            val intent =
                Intent(this, SecondActivity::class.java)
            // put the text from the edit text to the intent
            intent.putExtra("text", text)
            // start activity
            // https://developer.android.com/reference/android/content/Context#startActivity(android.content.Intent)
            startActivity(intent)
        }
    }


    override fun onStart() {
        super.onStart()
        // The activity is about to become visible.
    }

    override fun onResume() {
        super.onResume()
        // The activity has become visible (it is now "resumed").
    }

    override fun onPause() {
        super.onPause()
        // Another activity is taking focus (this activity is about to be "paused").
    }

    override fun onStop() {
        super.onStop()
        // The activity is no longer visible (it is now "stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        // The activity is about to be destroyed.
    }

    override fun onRestart() {
        super.onRestart()
        // The activity is about to be restarted.
    }
}