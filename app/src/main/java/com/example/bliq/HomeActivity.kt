package com.example.bliq

import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.view.WindowManager.LayoutParams
import android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.get
import com.example.bliq.databinding.ActivityHomeBinding
import com.example.bliq.databinding.ActivityHomeBinding.*
import com.example.bliq.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        window.setFlags(LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home)

        binding = ActivityHomeBinding.inflate(layoutInflater)


        //enableEdgeToEdge()
        //setContentView(binding.root)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/

        binding.frameHome.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"This is Home",Toast.LENGTH_LONG).show()
        })

        binding.frameDownload.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"This is Download",Toast.LENGTH_LONG).show()
        })












    }
}