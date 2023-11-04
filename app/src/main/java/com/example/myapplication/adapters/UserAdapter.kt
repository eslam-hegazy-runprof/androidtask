package com.example.myapplication.adapters

import UserModel
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class UserAdapter(val userList: ArrayList<UserModel>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    inner class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var title: TextView
        var des: TextView

        init {
            image = itemView.findViewById(R.id.imageView)
            title = itemView.findViewById(R.id.title)
            des = itemView.findViewById(R.id.desc)
            itemView.setOnClickListener {
                Toast.makeText(
                    itemView.context,
                    "Title ${userList[adapterPosition].name} , Description ${userList[adapterPosition].desc}",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.UserViewHolder {
        val x = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return UserViewHolder(x)
    }

    override fun onBindViewHolder(holder: UserAdapter.UserViewHolder, position: Int) {
        holder.image.setImageResource(userList[position].image)
        holder.title.setText(userList[position].name)
        holder.des.setText(userList[position].desc)
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}