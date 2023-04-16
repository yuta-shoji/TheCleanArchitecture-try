package com.sjyt.cleanarchitecturetry.Repository

import com.sjyt.cleanarchitecturetry.Entity.User
import com.sjyt.cleanarchitecturetry.Entity.UserName
import com.sjyt.cleanarchitecturetry.Gateway.UserRepository

// DataAccess(Repository): DBなどと直接データのやり取りをする実装クラス(JPAなどはこれに当たる)
// 接続DBが変わる時などはここをいじるだけでいい。

class EBeanUserRepository: UserRepository {
    override fun save(user: User) {
        TODO("Not yet implemented")
    }

    override fun remove(name: UserName) {
        TODO("Not yet implemented")
    }

    override fun findAll() {
        TODO("Not yet implemented")
    }
}