package com.braispc.kotlinfragmentvm.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.braispc.kotlinfragmentvm.R
import kotlinx.android.synthetic.main.menu_options_item.view.*

class MenuAdapter : RecyclerView.Adapter<MenuAdapter.UserHolder>() {

    fun setData(items: List<Int>) {
        numbers = items
        notifyDataSetChanged()
    }

    var numbers = emptyList<Int>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val inflater = LayoutInflater.from(parent.context)
        return UserHolder(inflater.inflate(R.layout.menu_options_item, parent, false))
    }

    override fun getItemCount() = numbers.size

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        holder.bind(numbers[position])
    }

    class UserHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(number: Int) {
            itemView.textView.text = "$number"
        }
    }
}