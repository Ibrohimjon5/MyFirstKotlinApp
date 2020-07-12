package com.ibrohimjon.myapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.asosiy_item.view.*

/**
 * Created by Ibrohimjon on 12.07.2020.
 */

class Asosiy_adapter(val context: Context,val hobbies: List<Nomi>) : RecyclerView.Adapter<Asosiy_adapter.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.asosiy_item,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hoby= hobbies[position]
        holder.setData(hoby,position)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var currentHobby: Nomi? = null
        var currentPosition: Int = 0

        init {
            itemView.setOnClickListener{
                Toast.makeText(context,currentHobby!!.title + " Clicked",Toast.LENGTH_SHORT).show()
            }

            itemView.img_share.setOnClickListener{
                val message:String = "My Hobbu is: " + currentHobby!!.title

                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT,message)
                intent.type = "text/plain"

                context.startActivity(Intent.createChooser(intent,"Please select app: "))
            }
        }

        fun setData(hoby: Nomi?, pos: Int){
            itemView.txt_title.text = hoby!!.title

            this.currentHobby = hoby
            this.currentPosition = pos
        }
    }
}