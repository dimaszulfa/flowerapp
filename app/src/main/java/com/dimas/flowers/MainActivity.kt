package com.dimas.flowers

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dimas.flowers.model.AboutActivity
import com.dimas.flowers.model.Flowers
import com.dimas.flowers.model.FlowersData
import com.dimas.flowers.model.ListFlowerAdapter
import java.lang.reflect.Type


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var rvFlowers: RecyclerView
    private var list : ArrayList<Flowers> = arrayListOf()
    private lateinit var txTitle : TextView
    private lateinit var btnAbout : Button
/*    private lateinit var ctIndoor : TextView
    private lateinit var ctOutdoor : TextView
    private  var indoor : Int = 0
    private  var outdoor : Int = 0*/
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        actionBar?.hide()
        txTitle = findViewById(R.id.title)
        btnAbout = findViewById(R.id.btn_about)
     /*   ctIndoor = findViewById(R.id.indoor_count)
        ctOutdoor = findViewById(R.id.outdoor_count)*/
        var customFont : Typeface = Typeface.createFromAsset(assets, "font/sarina.ttf")
        txTitle.setTypeface(customFont)

        rvFlowers = findViewById(R.id.rv_item)
        rvFlowers.setHasFixedSize(true)
        list.addAll(FlowersData.listData)

    btnAbout.setOnClickListener(this)
/*        indoor = FlowersData.listData.size
        ctIndoor.text = indoor.toString() + " Flowers"
        ctOutdoor.text = outdoor.toString() + " Flowers"*/

        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvFlowers.layoutManager = LinearLayoutManager(this)
        val listFlowerAdapter = ListFlowerAdapter(list)
        rvFlowers.adapter = listFlowerAdapter

    }

    override fun onClick(v: View?) {
        var about : Intent = Intent(this,AboutActivity::class.java)
        startActivity(about)
    }
}