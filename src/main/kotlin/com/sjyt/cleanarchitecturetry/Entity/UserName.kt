package com.sjyt.cleanarchitecturetry.Entity

// Entity：UserNameの仕様が分かる

data class UserName(
    var name: String
) {
    // 名前の文字数を判断するメソッド
    fun nameChecker(name: String) {
        if (name.length < 3 || name.length > 10) throw Exception()
        this.name = name
    }

    @JvmName("getName1")
    fun getName(): String {
        return name
    }
}
