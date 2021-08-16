package com.kenneth.foodorderingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.kenneth.foodorderingapp.databinding.ActivityCheckOutBinding
import com.kenneth.foodorderingapp.fragmentComponents.CheckOutBottom
import com.kenneth.foodorderingapp.fragmentComponents.CheckoutTop

//class CheckOut : AppCompatActivity(R.layout.activity_check_out) {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        if (savedInstanceState == null) {
//            supportFragmentManager.commit {
//                setReorderingAllowed(true)
//                add<CheckoutTop>(R.id.fragment_container_view)
//            }
//        }
//    }
//}




class CheckOut : AppCompatActivity() {

    private lateinit var binding: ActivityCheckOutBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<CheckoutTop>(R.id.fragment_container_view)
                add<CheckOutBottom>(R.id.fragment_container_view1)
            }
        }
        binding = ActivityCheckOutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
//        setContentView(R.layout.activity_check_out)

        binding.appName.text = "Eliza"

    }
}