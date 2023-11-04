package com.example.myapplication.ui

import MainActivityViewModel
import UserModel
import android.content.Intent
import android.location.LocationListener
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.PasswordTransformationMethod
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.R
import com.example.myapplication.ViewModels.HomeActivityViewModel
import com.example.myapplication.adapters.FragmentAdapter
import com.example.myapplication.adapters.UserAdapter
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel
    lateinit var viewPage:FragmentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        createSlider()
        viewPage= FragmentAdapter(this)
        binding.viewPage.orientation=ViewPager2.ORIENTATION_HORIZONTAL
        binding.viewPage.adapter=viewPage
    }








    // create slider
    private fun createSlider(){
        binding.recyclerview.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val userList = mutableListOf<UserModel>()
        userList.add(
            UserModel(
                image = R.drawable.baseline_delete_24,
                name = "Eslam",
                desc = "Hi, How are you"
            )
        )
        userList.add(
            UserModel(
                image = R.drawable.baseline_delete_24,
                name = "Ali",
                desc = "Hi, How are you"
            )
        )
        userList.add(
            UserModel(
                image = R.drawable.baseline_delete_24,
                name = "Saad",
                desc = "Hi, How are you"
            )
        )
        userList.add(
            UserModel(
                image = R.drawable.baseline_delete_24,
                name = "Hegazy",
                desc = "Hi, How are you"
            )
        )
        userList.add(
            UserModel(
                image = R.drawable.baseline_delete_24,
                name = "Eslam",
                desc = "Hi, How are you"
            )
        )
        userList.add(
            UserModel(
                image = R.drawable.baseline_delete_24,
                name = "Eslam",
                desc = "Hi, How are you"
            )
        )
        userList.add(
            UserModel(
                image = R.drawable.baseline_delete_24,
                name = "Eslam",
                desc = "Hi, How are you"
            )
        )
        userList.add(
            UserModel(
                image = R.drawable.baseline_delete_24,
                name = "Eslam",
                desc = "Hi, How are you"
            )
        )
        userList.add(
            UserModel(
                image = R.drawable.baseline_delete_24,
                name = "Eslam",
                desc = "Hi, How are you"
            )
        )
        val adapter = UserAdapter(userList as ArrayList<UserModel>)
        binding.recyclerview.adapter = adapter
    }
}