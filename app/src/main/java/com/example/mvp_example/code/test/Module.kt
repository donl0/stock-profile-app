package com.example.mvp_example.code.test

import com.example.mvp_example.code.Utils.ViewConvertor.Companion.takeWinLoseColor
import org.junit.Test
import org.koin.test.AutoCloseKoinTest

class Module: AutoCloseKoinTest() {

    @Test
    fun testNegativeTakeColor() {
        val loseColor = "#EE3870";

        val result = takeWinLoseColor(-100f);
        assert(result == loseColor)
    }

    @Test
    fun testPositiveTakeColor() {
        val winColor = "#8ED957";

        val result = takeWinLoseColor(100f);
        assert(result == winColor)
    }
}