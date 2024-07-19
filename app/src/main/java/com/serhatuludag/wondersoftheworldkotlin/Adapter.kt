package com.serhatuludag.wondersoftheworldkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.serhatuludag.wondersoftheworldkotlin.databinding.RecyclerRowBinding

class Adapter(val wonderList: ArrayList<Wonder>) : RecyclerView.Adapter<Adapter.WonderHolder>() {

    class WonderHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WonderHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return WonderHolder(binding)
    }

    override fun getItemCount(): Int {
        return wonderList.size
    }

    override fun onBindViewHolder(holder: WonderHolder, position: Int) {
        holder.binding.recyclerRowTextView.text = wonderList.get(position).name
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,InfoActivity::class.java)
            intent.putExtra("wonder",wonderList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }


}