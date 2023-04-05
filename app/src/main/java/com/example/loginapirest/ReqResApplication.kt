package com.example.loginapirest

import android.app.Application

/****
 * Project: Stores
 * From: com.cursosant.android.stores
 * Created by Alain Nicolás Tello on 01/02/23 at 17:52
 * All rights reserved 2023.
 *
 * All my Udemy Courses:
 * https://www.udemy.com/user/alain-nicolas-tello/
 * And Frogames formación:
 * https://cursos.frogamesformacion.com/pages/instructor-alain-nicolas
 *
 * Coupons on my Website:
 * www.alainnicolastello.com
 ***/
class ReqResApplication : Application() {
    companion object{
        lateinit var storeApi: ReqResApi
    }

    override fun onCreate() {
        super.onCreate()

        storeApi = ReqResApi.getInstance(this)
    }
}