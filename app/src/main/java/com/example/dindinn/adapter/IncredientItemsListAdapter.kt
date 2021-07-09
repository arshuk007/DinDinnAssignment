package com.example.dindinn.adapter

import android.content.Context
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.dindinn.R
import com.example.dindinn.databinding.ItemIncredientBinding
import com.example.dindinn.model.IncredientItem



class IncredientItemsListAdapter(private val context: Context, private val items: ArrayList<IncredientItem>?) : RecyclerView.Adapter<IncredientItemsListAdapter.MyViewHolder>() {

    private var layoutInflater: LayoutInflater? = null
    lateinit var myClickListener: MyClickListener

    init {

    }

    inner class MyViewHolder(val binding: ItemIncredientBinding): RecyclerView.ViewHolder(binding.root){
        var timer: CountDownTimer? = null
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        if(layoutInflater == null){
            layoutInflater = LayoutInflater.from(parent.context)
        }

        val binding = DataBindingUtil.inflate<ItemIncredientBinding>(layoutInflater!!, R.layout.item_incredient,
        parent, false)

        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = items?.get(position)
        holder.binding.txtTitle.text = item?.title
        Glide.with(context)
            .load(item!!.image)
            .placeholder(R.drawable.ic_place_holder)
            .error(R.drawable.ic_place_holder)
            .into(holder.binding.imgItem)
    }

    override fun getItemCount(): Int {
        if(items.isNullOrEmpty()){
            return 0
        }else {
            return items.size
        }
    }

    fun setOnItemClickListener(myClickListener: MyClickListener) {
        this.myClickListener = myClickListener
    }

    interface MyClickListener {
        fun onItemClick(position: Int, view: View)
    }
}
