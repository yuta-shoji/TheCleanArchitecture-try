package com.sjyt.cleanarchitecturetry.UseCases

// InputData: アウトプットするデータをひとまとめにしたインスタンス

class UserAddOutputData(
    private val createdId: String
): OutputData {
    override fun getCreatedId(): String {
        return this.createdId
    }
}