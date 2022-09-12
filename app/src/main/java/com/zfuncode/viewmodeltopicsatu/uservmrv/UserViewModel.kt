package com.zfuncode.viewmodeltopicsatu.uservmrv

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {

    val userList: MutableLiveData<List<User>> = MutableLiveData()

    fun getUserList()
    {
        val user=UserListData.setUserList()
        userList.value=user
    }
}