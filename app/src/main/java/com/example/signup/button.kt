package com.example.signup

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class button : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonPassData = findViewById<Button>(R.id.button6)
        val buttonDialogBox = findViewById<Button>(R.id.button7)
        val buttonRecyclerView = findViewById<Button>(R.id.button8)
        val buttonFragments = findViewById<Button>(R.id.button9)

        buttonPassData.setOnClickListener {
            // Handle Pass Data button click
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        buttonDialogBox.setOnClickListener {
            // Handle Dialog Box button click
//            val customDialog = dialog(this)
//            customDialog.show()
        }

        buttonRecyclerView.setOnClickListener {
            // Handle Recycler View button click
//            val intent = Intent(this, RecyclerViewActivity::class.java)
            startActivity(intent)
        }

        buttonFragments.setOnClickListener {
            // Handle Fragments button click
//            val intent = Intent(this, FragmentsActivity::class.java)
//            startActivity(intent)
        }
    }
}
