package com.example.bliq

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.view.WindowManager.LayoutParams
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.bliq.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding


    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        window.setFlags(LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home)

        binding = ActivityHomeBinding.inflate(layoutInflater)

        replaceFragment(HomeFragment(),R.id.fragmentreplace)

        val frame_home = findViewById<FrameLayout>(R.id.frame_home)
        val frame_download = findViewById<FrameLayout>(R.id.frame_download)

        frame_home.setOnClickListener {
            replaceFragment(HomeFragment(), R.id.fragmentreplace)
            Toast.makeText(this,"This is Home",Toast.LENGTH_LONG).show()
        }

        frame_download.setOnClickListener {
            replaceFragment(DownloadFragment(), R.id.fragmentreplace)
            Toast.makeText(this,"This is Download",Toast.LENGTH_LONG).show()
        }


    }

    private fun replaceFragment(fragment: Fragment, containerId: Int) {
        //supportFragmentManager.beginTransaction().add(R.id.fragmentreplace,fragment).commit()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val replace = fragmentTransaction.replace(containerId, fragment)
        fragmentTransaction.addToBackStack(null) // Optional: Adds transaction to backstack
        fragmentTransaction.commit()
    }

}

