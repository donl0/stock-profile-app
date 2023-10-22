package com.example.mvp_example.code.test

import com.example.mvp_example.code.Utils.ViewConvertor.Companion.roundToDecimal
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

    @Test
    fun testRoundToDecimalWithPositiveNumber(){
        val result = roundToDecimal(13.123f, 1);
        assert(result == 13.1f)
    }

    @Test
    fun testRoundToDecimalWithPositiveNegative(){
        val result = roundToDecimal(-13.123f, 1);
        assert(result == -13.1f)
    }
}