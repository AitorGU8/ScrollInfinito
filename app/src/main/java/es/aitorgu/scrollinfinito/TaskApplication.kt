package es.aitorgu.scrollinfinito

import android.app.Application

class TaskApplication: Application() {

    companion object{
        lateinit var prefs:Preferences
    }
    
    override fun onCreate() {
        super.onCreate()
        val prefs=Preferences(baseContext)
    }
}