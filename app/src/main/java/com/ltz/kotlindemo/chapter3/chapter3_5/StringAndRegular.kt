package com.ltz.kotlindemo.chapter3.chapter3_5

/**
 * Created by xiaowei on 2018/7/31
 */


fun print3_5() {
    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split(".", "-"))//可指定多个分隔符
    parasePath("/users/xiaowei/kotlin/chapter1.txt")
}

fun parasePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("directory:$directory, fullName:$fullName, fileName:$fileName, extension:$extension")
}