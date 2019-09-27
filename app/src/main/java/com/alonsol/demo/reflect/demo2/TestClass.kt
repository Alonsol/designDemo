package com.alonsol.demo.reflect.demo2

class TestClass {

    val msg: Boolean? = false

    //会被优惠为FINAL
    val finalValue: String

    val booleanValue: Boolean? = true

    init {
        this.finalValue = "final value"
    }

    private fun privateMethod(head: String, tail: Int) {
        println(head + tail)
    }
}
