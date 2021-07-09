package com.example.dindinn.activity

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.dindinn.R
import com.example.dindinn.adapter.CategoryViewPagerAdapter
import com.example.dindinn.databinding.ActivityIncredientBinding
import com.example.dindinn.model.IncredientCategory
import com.example.dindinn.model.response.IncredientsResponseModel
import com.example.dindinn.network.Resource
import com.example.dindinn.network.Status
import com.example.dindinn.utils.AppUtils
import com.example.dindinn.viewmodel.IncredientViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.util.*

class IncredientActivity: BaseActivity() {

    lateinit var binding: ActivityIncredientBinding
    private val viewModel: IncredientViewModel by viewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_incredient)

        getIncredientData();

    }

    /**
     * to fetch the initial orders
     */
    private fun getIncredientData(){
        if(AppUtils.isNetworkAvailable(this)){
            viewModel.getIncredients().observe(this, observer)
        }else{
            //show network error
        }
    }

    /**
     * observer for the incredient response
     */
    private val observer = Observer<Resource<IncredientsResponseModel?>>{
        when(it.status){
            Status.SUCCESS -> handleOrderDataSuccess(it.data?.data)
            Status.FAIL -> showFailure(it.data?.status?.message)
        }
    }

    /**
     * setup view pager with data
     */
    private fun handleOrderDataSuccess(data: ArrayList<IncredientCategory>?) {
        val viewPagerAdapter = CategoryViewPagerAdapter(supportFragmentManager, data!!)
        binding.viewPager.setAdapter(viewPagerAdapter);
        binding.tabLayout.setupWithViewPager(binding.viewPager);

    }

    /**
     * show failure message
     */
    private fun showFailure(message: String?){
        //toast data
    }

}