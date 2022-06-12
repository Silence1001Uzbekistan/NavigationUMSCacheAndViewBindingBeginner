package com.example.navigationumscacheandviewbinding.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationumscacheandviewbinding.CLASS.UMS
import com.example.navigationumscacheandviewbinding.R

class UMSAdapter(var umslist:ArrayList<UMS>,var onItemClickListener: OnItemClickListener):RecyclerView.Adapter<UMSAdapter.Vh>() {

    inner class Vh(var itemView:View):RecyclerView.ViewHolder(itemView){

        fun onBind(ums: UMS,position: Int){

            itemView.findViewById<TextView>(R.id.titleId).text = umslist[position].titleData
            itemView.findViewById<TextView>(R.id.codeId).text = umslist[position].code
            itemView.findViewById<TextView>(R.id.shortId).text = umslist[position].shortData

            itemView.setOnClickListener {

                onItemClickListener.onItemClick(ums,position)

            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.ums_item,parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {

        holder.onBind(umslist[position],position)

    }

    override fun getItemCount(): Int {
        return umslist.size
    }

    interface OnItemClickListener{

        fun onItemClick(ums: UMS,position: Int)

    }

}