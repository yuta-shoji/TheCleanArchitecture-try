package com.sjyt.cleanarchitecturetry.View

import com.sjyt.cleanarchitecturetry.ViewModel.ConsoleViewModel

// 実際に出力する画面

class ConsoleView {
    fun showCreatedUserId(viewModel: ConsoleViewModel) {
        println("User created")
        println("UserId: " + viewModel.getUuid())
    }
}