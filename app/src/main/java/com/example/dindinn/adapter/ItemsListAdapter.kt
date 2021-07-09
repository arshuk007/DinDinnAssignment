package com.example.dindinn.adapter

import android.content.Context
import android.graphics.drawable.Drawable
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.Target
import com.example.dindinn.R
import com.example.dindinn.databinding.ItemItemBinding
import com.example.dindinn.model.Addon
import com.example.dindinn.model.Item


class ItemsListAdapter(private val context: Context, private val items: ArrayList<Item>?) : RecyclerView.Adapter<ItemsListAdapter.MyViewHolder>() {

    private var layoutInflater: LayoutInflater? = null
    lateinit var myClickListener: MyClickListener

    init {

    }

    inner class MyViewHolder(val binding: ItemItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        if(layoutInflater == null){
            layoutInflater = LayoutInflater.from(parent.context)
        }

        val binding = DataBindingUtil.inflate<ItemItemBinding>(layoutInflater!!, R.layout.item_item,
        parent, false)

        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = items?.get(position)
        holder.binding.txtQty.text = item?.quantity.toString()
        holder.binding.txtName.text = item?.title

        if(item?.addons.isNullOrEmpty()){
            holder.binding.addOnContainer.visibility = View.GONE
        }else{
            holder.binding.addOnContainer.visibility = View.VISIBLE
            addAddons(holder.binding.addOnContainer, item?.addons!!)
        }
    }

    private fun addAddons(container: LinearLayout, addons: java.util.ArrayList<Addon>) {
        container.removeAllViews()
        for (addon in addons) {
            val commentView: View =
                LayoutInflater.from(context)
                    .inflate(R.layout.item_addon, container, false)
            val txtName = commentView.findViewById<TextView>(R.id.txt_name)
            val txtComment = commentView.findViewById<TextView>(R.id.txt_comment)

            txtName.text = addon.title
            if(addon.comment.isNullOrEmpty()){
                txtComment.visibility = View.GONE
            }else{
                txtComment.text = addon.comment
                txtComment.visibility = View.VISIBLE
            }

            container.addView(commentView)
        }
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
