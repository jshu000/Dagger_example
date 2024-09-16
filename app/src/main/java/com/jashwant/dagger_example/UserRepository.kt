package com.jashwant.dagger_example

import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email:String,password:String)
}

class SQLRepository @Inject constructor():UserRepository{
    override fun saveUser(email:String,password:String){
        Log.d("jashwant", "saveUser: email-")
    }
}

class FirebaseRepository:UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("jashwant", "user saved in firebase")
    }
}