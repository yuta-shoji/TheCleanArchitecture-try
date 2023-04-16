package com.sjyt.cleanarchitecturetry.UseCases

import com.sjyt.cleanarchitecturetry.Entity.UserRole

// InputData: インプットするデータをひとまとめにしたインスタンス

class UserAddInputData(
    private val name: String,
    private val role: UserRole,
): InputData {
    override fun getUserName(): String { return name }
    override fun getRole(): UserRole { return role }
}