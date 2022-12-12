package com.example.sd_memes

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.JsonRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       loadmeme()
    }

   private fun loadmeme(){
       // Instantiate the RequestQueue.
       val queue = Volley.newRequestQueue(this)
       val url = "https://www.google.com"


       val StringRequest = JsonObjectRequest(Request.Method.GET, url,JsonRequest: null,
           Response.Listener { response ->
            val url = response.getString( url)

               Glide.with(this).load(url).listener(object: RequestListener<Drawable>){

                   override fun onLoad
               }

           },
           Response.ErrorListener {
             Toast.makeText(this,"Somthing went wronng",Toast.LENGTH_LONG).show()
           })

       queue.add(JsonObjectRequest)
   }


    fun sharememe(view: View) {



    }
    fun nextmeme() {


    }
}