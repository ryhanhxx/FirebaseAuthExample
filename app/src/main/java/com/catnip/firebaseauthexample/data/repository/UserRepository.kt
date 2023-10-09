package com.catnip.firebaseauthexample.data.repository

import com.catnip.firebaseauthexample.data.model.User
import com.catnip.firebaseauthexample.utils.ResultWrapper
import kotlinx.coroutines.flow.Flow


interface UserRepository{
    fun isLoggedIn(): Boolean
    fun getCurrentUser(): User?
    fun doLogout(): Boolean
    suspend fun doRegister(
        fullName: String,
        email: String,
        password: String
    ): Flow<ResultWrapper<Boolean>>
    suspend fun doLogin(email: String, password: String): Boolean
}