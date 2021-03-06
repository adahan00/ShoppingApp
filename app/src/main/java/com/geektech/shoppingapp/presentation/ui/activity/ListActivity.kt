package com.geektech.shoppingapp.presentation.ui.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.geektech.shoppingapp.R
import com.geektech.shoppingapp.databinding.ActivityListBinding
import com.geektech.shoppingapp.domain.entity.ShopItem
import kotlinx.coroutines.launch

class ListActivity : AppCompatActivity(R.layout.activity_list) {

    private val binding: ActivityListBinding by viewBinding()
    private val viewModel: MainViewModel by viewModels()
    private val adapter = ShopAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initAdapter()
        initViewModel()
        initListener()
    }

    private fun initListener() {

    }

    private fun initViewModel() {
        adapter.setList(viewModel.getShopList())
    }

    private fun initAdapter() {
        binding.listRv.adapter = adapter
    }


}