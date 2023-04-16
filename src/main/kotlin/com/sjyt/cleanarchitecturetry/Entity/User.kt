package com.sjyt.cleanarchitecturetry.Entity

// Entity: changeNameなどのビジネスも含むデータオブジェクト（ビジネスを表現するモノ）
// ビジネスを表現するオブジェクト

data class User(
    val id: UserId,
    var name: UserName,
    val role: UserRole
) {
    fun changeName(name: UserName) {
        this.name = name
    }
}
