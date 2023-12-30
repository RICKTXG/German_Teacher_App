package com.opensource.germanteacherapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //
    fun SayTheColor(view : View){
        val clickedButton:Button = view as Button
        var mediaPlayer:MediaPlayer = MediaPlayer.create(
            /* context = */ this,
            resources.getIdentifier(
                /* resid = */ clickedButton.tag.toString(),
                /* audioAttributes = */ "raw",
                /* audioSessionId = */ packageName
            )
        )
        mediaPlayer.start()
    }
}