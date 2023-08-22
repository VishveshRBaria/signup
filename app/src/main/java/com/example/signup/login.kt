package com.example.signup

import android.content.Intent
import android.widget.TextView
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val textViewlogin: TextView = findViewById(R.id.textView4)
        textViewlogin.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val submitbutton1 : Button = findViewById(R.id.button1)
        submitbutton1.setOnClickListener{
            val bundle=Bundle()
//            val name:EditText=findViewById(R.id.textView3)
            val email: EditText =findViewById(R.id.textView)
            val password: EditText =findViewById(R.id.editTextTextPassword)
//            bundle.putString("u_name",name.text.toString())
            bundle.putString("u_email",email.text.toString())
            bundle.putString("u_password",password.text.toString())
            val intent = Intent(this,Data::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}