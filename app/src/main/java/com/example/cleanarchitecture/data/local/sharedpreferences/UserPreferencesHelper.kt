package com.example.cleanarchitecture.data.local.sharedpreferences

import android.content.Context
import android.content.SharedPreferences

class UserPreferencesHelper(context: Context) {
    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("user-preference", Context.MODE_PRIVATE)

    var username: String?
        get() = sharedPreferences.getString("username", "")
        set(value) = sharedPreferences.edit().putString("username", value).apply()

    var userage: String?
        get() = sharedPreferences.getString("userage", "")
        set(value) = sharedPreferences.edit().putString("userage", value).apply()

    var useremail: String?
        get() = sharedPreferences.getString("useremail", "")
        set(value) = sharedPreferences.edit().putString("useremail", value).apply()

    var password: String?
        get() = sharedPreferences.getString("password", "")
        set(value) = sharedPreferences.edit().putString("password", value).apply()
}