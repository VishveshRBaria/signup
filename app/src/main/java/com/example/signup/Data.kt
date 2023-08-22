package com.example.signup

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseApp
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase


class Data : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    private val database: DatabaseReference = FirebaseDatabase.getInstance().reference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.data)
        FirebaseApp.initializeApp(this)

        // Write a message to the database
//        val database = Firebase.database
//        val myRef = database.getReference("message")

//        myRef.setValue("Hello, World!")

        // Push the User object to the database
//        val userId = database.child("Signup").push().key
//        if (userId != null) {
//            database.child("Signup").child(userId).setValue(user)


            // Retrieve data from the previous activity (LoginActivity)
        val intent = intent
        val name = intent.getStringExtra("u_name")
//        val lastName = intent.getStringExtra("LAST_NAME")
        val email = intent.getStringExtra("u_email")
        val password = intent.getStringExtra("u_password")

        val textViewDisplay = findViewById<TextView>(R.id.textViewDisplay)
        textViewDisplay.text =
            "Name : $name\n\nEmail : $email\n\nPassword : $password\n"


        //val name = name.text.toString()
        //val email = email.text.toString()
        //val password = password.text.toString()

        // Create a User object
        //val user = Signup(name, email, password)


    }
}
