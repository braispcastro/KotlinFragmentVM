package com.braispc.kotlinfragmentvm.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.braispc.kotlinfragmentvm.R
import com.braispc.kotlinfragmentvm.data.MenuDTO
import kotlinx.android.synthetic.main.menu_options_item.view.*

class MenuAdapter : RecyclerView.Adapter<MenuAdapter.UserHolder>() {

    fun setData(items: List<MenuDTO>) {
        menuItems = items
        notifyDataSetChanged()
    }

    var menuItems = emptyList<MenuDTO>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val inflater = LayoutInflater.from(parent.context)
        return UserHolder(inflater.inflate(R.layout.menu_options_item, parent, false))
    }

    override fun getItemCount() = menuItems.size

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        holder.bind(menuItems[position])
    }

    class UserHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: MenuDTO) {
            itemView.numberView.text = item.number.toString()
            itemView.textView.text = item.text
        }
    }
}