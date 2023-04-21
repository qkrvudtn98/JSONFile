package com.flatwater.jsonpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val jsonString = assets.open("surveyData.json").reader().readText()
//        Log.d("JSON Data", jsonString)

        checkAuth()

    }

    // JSON 파일 접근 권한 확인
    fun checkAuth() {
        val file = File("java/com/flatwater/jsonpractice/assets/surveyData.json")
        if(file.exists()){
            Log.d("Check", "file exist!")
        } else {
            Log.d("Check", "file unexist!")
        }
    }
}