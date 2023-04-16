package com.sjyt.cleanarchitecturetry.Gateway
import com.sjyt.cleanarchitecturetry.Entity.User
import com.sjyt.cleanarchitecturetry.Entity.UserName
import org.springframework.stereotype.Repository

// DataAccessInterface(Gateways): DBなど外部に対してアクセスするためのinterface。実装classに委譲する

@Repository
interface UserRepository {
    fun save(user: User)
    fun remove(name: UserName)
    fun findAll()
}