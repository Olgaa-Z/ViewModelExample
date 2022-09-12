package com.zfuncode.viewmodeltopicsatu.uservmrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zfuncode.viewmodeltopicsatu.R

class UserActivity : AppCompatActivity() {

    lateinit var rvUser : RecyclerView
    lateinit var userVm : UserViewModel
    lateinit var userAdapter : UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        userData()

        userVm = ViewModelProvider(this).get(UserViewModel::class.java)
        userVm.getUserList()
        userVm.userList.observe(this, Observer {
            userAdapter.setUserData(it as  ArrayList<User>)
        })


    }

    fun  userData(){
        rvUser = findViewById(R.id.rvUser)
        userAdapter = UserAdapter(ArrayList())
        rvUser.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvUser.adapter = userAdapter
    }

//    https://github.com/nameisjayant/Android-ViewModel-Example-Kotlin
}