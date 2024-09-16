package com.jashwant.dagger_example

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun saveUser(email:String,password:String){
        Log.d("jashwant", "saveUser: email-")
    }
}