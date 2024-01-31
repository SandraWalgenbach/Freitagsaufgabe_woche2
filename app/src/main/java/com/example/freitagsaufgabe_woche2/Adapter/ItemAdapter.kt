package com.example.freitagsaufgabe_woche2.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.freitagsaufgabe_woche2.Data.Ware
import com.example.freitagsaufgabe_woche2.databinding.ListItemBinding

class ItemAdapter(val dataset: MutableList<Ware>): RecyclerView.Adapter<ItemAdapter.WareViewHolder>(){

    inner class WareViewHolder(val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):WareViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WareViewHolder(binding)
    }

    override fun getItemCount(): Int{
        return dataset.size
    }

    override fun onBindViewHolder(holder: WareViewHolder, position: Int){
        val eintrag = dataset[position]

        holder.binding.TVelement.setText(eintrag.gegenstand)

        holder.binding.IBloeschen.setOnClickListener {
            dataset.removeAt(holder.adapterPosition)
            notifyItemRemoved(holder.adapterPosition)
        }
    }
}