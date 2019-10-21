package com.example.revisi.model

import com.example.revisi.R

object DataPresiden {
    private val namapresiden = arrayOf(
        "Ir. Soekarno",
        "Soeharto",
        "BJ. Habibie",
        "Abdurrahman Wahid",
        "Megawati",
        "Susilo Bambang Yudhoyono",
        "Joko Widodo"
    )

    private val data = arrayOf(
        "Ir. Soekarno adalah presiden pertama RI, dan wakilnya adalah Moh.Hatta",
        "Soeharto adalah presiden kedua RI yang menjabat selama lebih dari 30 tahun",
        "BJ. Habibie adalah presiden ketiga RI yang menggantikan Soeharto",
        "Abdurrahman Wahid atau biasa dikenal dengan Gusdur adalah presiden keempat RI",
        "Megawati adalah presiden kelima RI dan merupakan presiden wanita pertama di Indonesia",
        "Susilo Bambang Yudhoyono adalah presiden RI keenam",
        "Joko Widodo atau biasa dikenal Jokowi adalah presiden RI ketujuh"
    )

    private val presidenPoster = intArrayOf(
        R.drawable.p1,
        R.drawable.p2,
        R.drawable.p3,
        R.drawable.p4,
        R.drawable.p5,
        R.drawable.p6,
        R.drawable.p7
    )

    val listPresiden: ArrayList<Presiden>
    get() {
        val list = arrayListOf<Presiden>()
        for (position in namapresiden.indices){
            val presiden = Presiden()
            presiden.name = namapresiden[position]
            presiden.data = data[position]
            presiden.poster = presidenPoster[position]
            list.add(presiden)
        }
        return list
    }
}