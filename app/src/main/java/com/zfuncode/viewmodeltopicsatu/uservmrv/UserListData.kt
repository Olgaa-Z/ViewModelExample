package com.zfuncode.viewmodeltopicsatu.uservmrv

object UserListData {

    fun setUserList():List<User>
    {
        var userList:ArrayList<User> = ArrayList()
        userList.add(User("Fani"))
        userList.add(User("Faizal"))
        userList.add(User("Farhan"))
        userList.add(User("Faldi"))
        userList.add(User("Akbar"))
        userList.add(User("Qisthi"))
        userList.add(User("Syifa"))
        userList.add(User("Zain"))
        userList.add(User("Zahir"))
        userList.add(User("Danial"))
        return userList
    }
}