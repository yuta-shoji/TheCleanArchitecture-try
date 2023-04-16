package com.sjyt.cleanarchitecturetry.Presenter

import com.sjyt.cleanarchitecturetry.UseCases.UserAddOutputData

// OutputBoundary: 出力データを渡すためのinterface
// Presenterに出力処理を委譲する

interface UserAddPresenter {
    fun output(outputData: UserAddOutputData)
}