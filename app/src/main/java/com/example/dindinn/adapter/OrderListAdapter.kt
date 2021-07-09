package com.example.dindinn.adapter

import android.content.Context
import android.media.MediaPlayer
import android.media.RingtoneManager
import android.net.Uri
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dindinn.R
import com.example.dindinn.databinding.ItemOrderBinding
import com.example.dindinn.model.Order
import com.example.dindinn.utils.AppConstants
import com.example.dindinn.utils.AppUtils
import java.util.concurrent.TimeUnit


class OrderListAdapter(private val context: Context, private val items: ArrayList<Order>?) : RecyclerView.Adapter<OrderListAdapter.MyViewHolder>() {

    private var layoutInflater: LayoutInflater? = null
    lateinit var myClickListener: MyClickListener
    var sound: Uri

    init {
        sound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
    }

    inner class MyViewHolder(val binding: ItemOrderBinding): RecyclerView.ViewHolder(binding.root){
        var timer: CountDownTimer? = null
        var player: MediaPlayer = MediaPlayer.create(context, sound)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        if(layoutInflater == null){
            layoutInflater = LayoutInflater.from(parent.context)
        }

        val binding = DataBindingUtil.inflate<ItemOrderBinding>(layoutInflater!!, R.layout.item_order,
        parent, false)

        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = items?.get(position)
        holder.binding.txtOrderNo.text = "#"+item?.orderNo
        holder.binding.txtOrderTime.text = AppUtils.getFormattedDate(item?.createdAt, AppConstants.DATE_YYYY_MM_DD_T_HH_MM_SS,
        AppConstants.DATE_HH_MM_AA)

        if(item?.items.isNullOrEmpty()){
            holder.binding.recyclerView.visibility = View.GONE
        }else{
            holder.binding.recyclerView.visibility = View.VISIBLE
            holder.binding.recyclerView.setHasFixedSize(true)
            holder.binding.recyclerView.layoutManager = LinearLayoutManager(context)
            val adapter = ItemsListAdapter(context, item?.items)
            holder.binding.recyclerView.adapter = adapter
        }

        if (holder.timer != null) {
            holder.timer?.cancel()
        }

        holder.binding.txtCount.text = item?.items?.size.toString()+" Items"
        holder.binding.txtStatus.text = context.getString(R.string.accept)
        holder.binding.txtStatus.background = ContextCompat.getDrawable(context, R.drawable.blue_button)

        val timeLeft: Int = AppUtils.getElapsedMinutes(item?.expiredAt, AppConstants.DATE_YYYY_MM_DD_T_HH_MM_SS)

        holder.binding.progressbar.progress = 5 - timeLeft

        if(timeLeft == 2){
            holder.player.isLooping = false
            holder.player.start()
        }

        if(timeLeft > 1){
            holder.binding.txtTime.text = timeLeft.toString()+" mins"
        }else if(timeLeft < 0){
            holder.binding.txtTime.text = context.getString(R.string.expired)
            holder.binding.txtStatus.text = context.getString(R.string.expired)
            holder.binding.txtStatus.background = ContextCompat.getDrawable(context, R.drawable.grey_button)
        }else{
            val differenceInSeconds = AppUtils.getTimeDifferenceInMilli(item?.expiredAt,
                AppConstants.DATE_YYYY_MM_DD_T_HH_MM_SS)
            if (differenceInSeconds > 0) {
                if (differenceInSeconds > 0 && differenceInSeconds < 60000) {
                    holder.timer = object : CountDownTimer(
                        AppUtils.getTimeDifferenceInMilli(
                            item?.expiredAt,
                            AppConstants.DATE_YYYY_MM_DD_T_HH_MM_SS
                        ), 1000
                    ) {
                        override fun onTick(l: Long) {
                            var time = String.format(
                                "%02d:%02d",
                                TimeUnit.MILLISECONDS.toMinutes(l) % 60,
                                TimeUnit.MILLISECONDS.toSeconds(l) % 60
                            )
                            if (time.startsWith("00:")) {
                                time = time.replaceFirst("00:".toRegex(), "")
                            }
                            holder.binding.txtTime.setText("$time s")
                        }

                        override fun onFinish() {
                            item?.expired = true
                            notifyDataSetChanged()
                        }
                    }.start()
                } else {
                    holder.binding.txtTime.setText(timeLeft.toString()+" mins")
                }
            }else{
                holder.binding.txtTime.setText(timeLeft.toString()+" mins")
            }
        }


        holder.binding.txtStatus.setOnClickListener {
            items?.removeAt(position)
            notifyDataSetChanged()
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
