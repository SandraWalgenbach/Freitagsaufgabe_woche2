package com.example.freitagsaufgabe_woche2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.freitagsaufgabe_woche2.Adapter.ItemAdapter
import com.example.freitagsaufgabe_woche2.Data.Datasource
import com.example.freitagsaufgabe_woche2.Data.Ware

class MainActivity : AppCompatActivity() {

    var dataset = Datasource().loadData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}