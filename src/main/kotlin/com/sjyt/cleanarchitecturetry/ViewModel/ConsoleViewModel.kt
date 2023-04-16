package com.sjyt.cleanarchitecturetry.ViewModel

// 出力データを適切な形に変換する
// DataStructureを変換してViewに引き渡す

class ConsoleViewModel(
    private val uuid: String,
) {
    fun getUuid(): String {
        return this.uuid
    }
}