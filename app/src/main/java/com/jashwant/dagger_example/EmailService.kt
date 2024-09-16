package com.jashwant.dagger_example

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor(){
    fun send(to:String, body:String?){
        Log.d("jashwant", "Email sent-")
    }
}