package com.example.png_to_cc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.png_to_cc.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    lateinit var username : EditText
    lateinit var password:EditText
    lateinit var loginbutton:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener(View.OnClickListener{
            if(binding.username.text.toString()=="user"&& binding.password.text.toString()=="1234")

        { Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
        }
    })
}
}