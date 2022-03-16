package com.example.applistview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(
    private val fList: List<Model>
) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return fList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fModel = fList[position]
        holder.image.setImageResource(fModel.image)
        holder.title.text = fModel.title
        holder.cost.text = "Đơn giá: " + fModel.cost.toString()
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val image: ImageView = itemView.findViewById(R.id.image)
        val title: TextView = itemView.findViewById(R.id.tv_title)
        val cost: TextView = itemView.findViewById(R.id.tv_cost)
    }
}
