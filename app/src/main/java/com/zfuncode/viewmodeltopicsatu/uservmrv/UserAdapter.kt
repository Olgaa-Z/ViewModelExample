package com.zfuncode.viewmodeltopicsatu.uservmrv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zfuncode.viewmodeltopicsatu.R

class UserAdapter(var userList : ArrayList<User>):RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        var name = itemView.findViewById<TextView>(R.id.userName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserAdapter.ViewHolder, position: Int) {
        holder.name.text = userList[position].name
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    fun setUserData(userList: ArrayList<User>)
    {
        this.userList=userList
        notifyDataSetChanged()
    }
}