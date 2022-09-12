package com.zfuncode.viewmodeltopicsatu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.zfuncode.viewmodeltopicsatu.uservmrv.UserActivity
import com.zfuncode.viewmodeltopicsatu.vmrecyclerview.StudentActivity

class MainActivity : AppCompatActivity() {

    lateinit var btnVM : Button
    lateinit var btnWVM : Button
    lateinit var btnStudent : Button
    lateinit var btnUser : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnWVM = findViewById(R.id.btnWithoutVM)
        btnVM = findViewById(R.id.btnUsingVM)
        btnStudent = findViewById(R.id.btnStudent)
        btnUser = findViewById(R.id.btnUser)

        btnWVM.setOnClickListener{
            startActivity(Intent(this, WithoutViewModel::class.java))
        }

        btnVM.setOnClickListener{
            startActivity(Intent(this, UsingViewModel::class.java))
        }

        btnStudent.setOnClickListener{startActivity(Intent(this, StudentActivity::class.java))}

        btnUser.setOnClickListener{startActivity(Intent(this, UserActivity::class.java))}

    }
}