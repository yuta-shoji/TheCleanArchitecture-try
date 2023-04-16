package com.sjyt.cleanarchitecturetry.Presenter

import com.sjyt.cleanarchitecturetry.UseCases.UserAddOutputData
import com.sjyt.cleanarchitecturetry.View.ConsoleView
import com.sjyt.cleanarchitecturetry.ViewModel.ConsoleViewModel

// 画面への出力を処理する

class ConsoleUserAddPresenter: UserAddPresenter {
    private val consoleView: ConsoleView = ConsoleView()

    override fun output(outputData: UserAddOutputData) {
        val uuid = outputData.getCreatedId()
        val viewModel: ConsoleViewModel = ConsoleViewModel(uuid)
        consoleView.showCreatedUserId(viewModel)
    }
}