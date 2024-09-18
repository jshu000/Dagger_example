package com.jashwant.dagger_example

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository{
    fun saveUser(email:String,password:String)
}

@Singleton
class SQLRepository @Inject constructor(val analyticsService: AnalyticsService):UserRepository{
    override fun saveUser(email:String,password:String){
        Log.d("jashwant", "saveUser: email-")
        analyticsService.trackEvent("Saveuser","CREATE")
    }
}

class FirebaseRepository(val analyticsService: AnalyticsService):UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("jashwant", "user saved in firebase")
        analyticsService.trackEvent("Saveuser","CREATE")
    }
}