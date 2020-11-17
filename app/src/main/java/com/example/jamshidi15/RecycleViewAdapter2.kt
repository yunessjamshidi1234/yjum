package com.example.jamshidi15

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecycleViewAdapter2(val mylist:List<NewList>) :RecyclerView.Adapter<RecycleViewAdapter2.RecycleViewHolder>(){
    class RecycleViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val img =itemView.findViewById<ImageView>(R.id.imgRecycler)
        val txtTitle=itemView.findViewById<TextView>(R.id.txtTitle)
        val txt2=itemView.findViewById<TextView>(R.id.txtDecs)
        val layout1=itemView.findViewById<LinearLayout>(R.id.layout)
        init {
            layout1.setOnClickListener{
                val position=adapterPosition
                Toast.makeText(itemView.context,"item: "+position, Toast.LENGTH_LONG).show()
                val i=Intent(itemView.context,DiccriptActivity::class.java)
                itemView.context.startActivity(i)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.recycle2_items,parent,false)
        val holder=RecycleViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: RecycleViewHolder, position: Int) {
        val currentItem =mylist[position]
        holder.img.setImageResource(currentItem.img)
        holder.txtTitle.text=currentItem.title
        holder.txt2.text=currentItem.desc
    }
    override fun getItemCount(): Int {
        return mylist.size
    }
}