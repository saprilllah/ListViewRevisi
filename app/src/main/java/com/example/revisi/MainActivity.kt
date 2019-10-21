package com.example.revisi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.revisi.adapter.ListPresidenAdapter
import com.example.revisi.R.id.rv_presiden
import com.example.revisi.model.DataPresiden
import com.example.revisi.model.Presiden

class   MainActivity : AppCompatActivity() {
    private lateinit var rvPresiden: RecyclerView
    private var list: ArrayList<Presiden> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPresiden = findViewById(rv_presiden)
        rvPresiden.setHasFixedSize(true)
        list.addAll(DataPresiden.listPresiden)
        showPresidenList()
    }

    private fun showPresidenList(){
        rvPresiden.layoutManager = LinearLayoutManager(this)
        rvPresiden.adapter = ListPresidenAdapter(this,list){
            Toast.makeText(this,it.data,Toast.LENGTH_SHORT).show();
        }
    }
}
