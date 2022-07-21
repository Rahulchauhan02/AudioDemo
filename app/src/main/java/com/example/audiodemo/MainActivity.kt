package com.example.audiodemo

import android.annotation.SuppressLint
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.audiodemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.oneBtn.setOnClickListener {
            playMusic(it as Button)
        }
        mainBinding.twoBtn.setOnClickListener {
            playMusic(it as Button)
        }
        mainBinding.threeBtn.setOnClickListener {
            playMusic(it as Button)
        }
    }


    @SuppressLint("ResourceAsColor")
    fun playMusic(button:Button)
    {
        val mediaPlayer = MediaPlayer.create(this@MainActivity,resources.getIdentifier(button.tag as String,"raw",packageName))
        if (!mediaPlayer.isPlaying)
        {
         mediaPlayer.start()
        }

        mainBinding.stopBtn.setOnClickListener {
            mediaPlayer.reset()
        }
    }

}
