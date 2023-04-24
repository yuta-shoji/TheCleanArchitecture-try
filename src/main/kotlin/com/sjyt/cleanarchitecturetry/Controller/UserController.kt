package com.sjyt.cleanarchitecturetry.Controller

import com.sjyt.cleanarchitecturetry.Entity.UserRole
import com.sjyt.cleanarchitecturetry.UseCases.UserAddInputData
import com.sjyt.cleanarchitecturetry.Interactor.UserAddUseCase

// Controller: ユーザーからの入力信号を受け取り、変換して処理を任せる

class UserController {
    private lateinit var addUseCase: UserAddUseCase

    fun createUser(name: String, roleId: String) {
        // アプリケーションが分かる形にデータを変換する
        val role: UserRole = convertRole(roleId)
        // Userインスタンスを生成する
        val inputData = UserAddInputData(name, role)
        // InputBoundaryを呼び出して渡す
        addUseCase.handle(inputData)
    }

    private fun convertRole(roleId: String): UserRole {
        when (roleId){
            "admin" -> return UserRole.ADMIN
            "member" -> return UserRole.MEMBER
            else -> {
                println("role error")
                return UserRole.OTHER
            }
        }
    }
}
