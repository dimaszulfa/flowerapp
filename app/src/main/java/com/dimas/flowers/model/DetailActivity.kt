package com.dimas.flowers.model

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.dimas.flowers.R

class DetailActivity : AppCompatActivity() {
    private lateinit var txtNama: TextView
    private lateinit var txtDetail: TextView
    private lateinit var txtLokasi: TextView
    private lateinit var imgGambar: ImageView
    private lateinit var miniImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val dataNama = intent.getStringExtra("nama")
        val dataLokasi = intent.getStringExtra("lokasi")
        val dataDetail = intent.getStringExtra("detail")
        txtNama = findViewById(R.id.textView)
        txtDetail = findViewById(R.id.txDetail)
        txtLokasi = findViewById(R.id.txLokasi)
        imgGambar = findViewById(R.id.iv_image)
        miniImage = findViewById(R.id.mini_image)
        txtNama.text = dataNama
        txtLokasi.text = dataLokasi
        txtDetail.text = dataDetail

        val bundle = this.intent.extras
        val pic = bundle!!.getInt("image")
        imgGambar.setImageResource(pic)
        miniImage.setImageResource(pic)
      /*  Glide.with(this)
            .load(pic)
            .into(dataGambar)*/
    }

}