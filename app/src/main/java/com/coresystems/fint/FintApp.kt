package com.coresystems.fint

import android.app.Application
import com.coresystems.fint.dbnew.models.dao.NewDatabase

class FintApp:Application() {

    override fun onCreate() {
        super.onCreate()
        NewDatabase.init(this)
    }

}