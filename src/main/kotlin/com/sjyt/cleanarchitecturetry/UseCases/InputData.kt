package com.sjyt.cleanarchitecturetry.UseCases

import com.sjyt.cleanarchitecturetry.Entity.UserRole

interface InputData {
    fun getUserName(): String
    fun getRole(): UserRole
}