package com.sjyt.cleanarchitecturetry.Interactor

import com.sjyt.cleanarchitecturetry.UseCases.UserAddInputData

// InputBoundary: 入力データを渡すためのinterface
// useCaseを満たすためにどういった処理が必要か定義する
// UserCaseInteractorに入力処理を委譲する

interface UserAddUseCase {
    fun handle(inputData: UserAddInputData)
}