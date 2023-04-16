package com.sjyt.cleanarchitecturetry.Interactor

import com.sjyt.cleanarchitecturetry.Entity.User
import com.sjyt.cleanarchitecturetry.Entity.UserId
import com.sjyt.cleanarchitecturetry.Entity.UserName
import com.sjyt.cleanarchitecturetry.Presenter.UserAddPresenter
import com.sjyt.cleanarchitecturetry.Gateway.UserRepository
import com.sjyt.cleanarchitecturetry.UseCases.UserAddInputData
import com.sjyt.cleanarchitecturetry.UseCases.UserAddOutputData
import java.util.*

// UseCaseInteractor: 実際のアプリケーションロジック
// InputBoundaryから処理を委譲されて実際にuserCaseを処理する

class UserAddInteractor(
    private val userRepository: UserRepository,
    private val userAddPresenter: UserAddPresenter,
): UserAddUseCase {
    override fun handle(inputData: UserAddInputData) {
        val uuid = UUID.randomUUID().toString()

        // Entity: Userデータを生成
        // Domainオブジェクトに当たるもの
        val user = User(
            UserId(uuid),
            UserName(inputData.getUserName()),
            inputData.getRole()
        )

        // DataAccessInterface(Repository)に保存を依頼する
        // Userを保存するという問題を解決するためのアプリケーション
        userRepository.save(user)

        // 出力データ(Entity)を生成する
        val outputData = UserAddOutputData(uuid)

        // OutputBoundaryを呼び出して渡す
        userAddPresenter.output(outputData)
    }
}