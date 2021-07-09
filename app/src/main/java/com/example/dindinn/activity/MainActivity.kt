package com.example.dindinn.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dindinn.R
import com.example.dindinn.adapter.OrderListAdapter
import com.example.dindinn.databinding.ActivityMainBinding
import com.example.dindinn.model.Order
import com.example.dindinn.model.response.OrderResponseModel
import com.example.dindinn.network.Resource
import com.example.dindinn.network.Status
import com.example.dindinn.utils.AppUtils
import com.example.dindinn.viewmodel.OrderViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.util.*

class MainActivity: BaseActivity() {

    lateinit var binding: ActivityMainBinding
    private val viewModel: OrderViewModel by viewModel()
    private var adapter: OrderListAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        getData()
        setupListeners()
    }

    /**
     * to fetch the initial orders
     */
    private fun getData(){
        if(AppUtils.isNetworkAvailable(this)){
            viewModel.getOrderData().observe(this, orderObserver)
        }else{
            //show network error
        }
    }

    /**
     * set listeners
     */
    private fun setupListeners(){
        binding.txtIngredients.setOnClickListener {
            startActivity(Intent(this, IncredientActivity::class.java))
        }
    }

    private val orderObserver = Observer<Resource<OrderResponseModel?>>{
        when(it.status){
            Status.SUCCESS -> handleOrderDataSuccess(it.data?.data)
            Status.FAIL -> showFailure(it.data?.status?.message)
        }
    }

    private fun handleOrderDataSuccess(data: ArrayList<Order>?) {
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        adapter = OrderListAdapter(this, data)
        binding.recyclerView.adapter = adapter
        adapter?.setOnItemClickListener(object: OrderListAdapter.MyClickListener{
            override fun onItemClick(position: Int, view: View) {

            }
        })
        refreshListInEveryHalfMinute()
    }

    /**
     * show failure message
     */
    private fun showFailure(message: String?){

    }


    /**
     * refresh list for every half minute
     * to handle the timer effectively
     */
    private fun refreshListInEveryHalfMinute() {
        val seconds: Int = AppUtils.getCurrentSecond()!!.toInt()
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed(object : Runnable {
            override fun run() {
                if (adapter != null) {
                    adapter?.notifyDataSetChanged()
                    handler.postDelayed(this, 60 * 1000)
                }
            }
        }, seconds * 1000L)
    }

}