package com.example.signup

import android.content.Intent
import android.widget.TextView
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.form)

        val textViewlogin: TextView = findViewById(R.id.textView5)
        textViewlogin.setOnClickListener{
            val intent = Intent(this,login::class.java)
            startActivity(intent)
        }

        val submitbutton : Button = findViewById(R.id.button)
        submitbutton.setOnClickListener{
            val bundle=Bundle()
            val name:EditText=findViewById(R.id.textView3)
            val email:EditText=findViewById(R.id.editTextTextEmailAddress)
            val password:EditText=findViewById(R.id.editTextTextPassword3)
            bundle.putString("u_name",name.text.toString())
            bundle.putString("u_email",email.text.toString())
            bundle.putString("u_password",password.text.toString())
            val intent = Intent(this,Data::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}