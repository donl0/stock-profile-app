package com.example.mvp_example.code.test

import com.example.mvp_example.code.test.backend.model.GeneralPortfolioParamsCorrectTest
import com.example.mvp_example.code.test.backend.model.GeneralPortfolioParamsTest
import com.google.gson.JsonSyntaxException
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.test.AutoCloseKoinTest
import org.koin.test.inject
import testsModel
import kotlin.test.assertFailsWith

class TestDB: AutoCloseKoinTest() {
    private val generalPortfolioIncorrectTest: GeneralPortfolioParamsTest by inject()
    private val generalPortfolioCorrectModelTest: GeneralPortfolioParamsCorrectTest by inject()

    @Before
    fun setUp() {
        startKoin { modules(testsModel) }
    }

    @Test
    fun testModelIncorrectTypeInOneOfMultiple(){
        assertFailsWith<JsonSyntaxException>("Expected JsonSyntaxException") {
            generalPortfolioIncorrectTest.takeCostElement()
        }
    }

    @Test
    fun testModelIncorrectType(){
        assertFailsWith<JsonSyntaxException>("Expected JsonSyntaxException") {
            generalPortfolioIncorrectTest.takeProfitabilityElement()
        }
    }

    @Test
    fun testModelEmptyJson(){
        assertFailsWith<IllegalArgumentException>("Expected IllegalArgumentException") {
            generalPortfolioIncorrectTest.takeTotalProfitElement();
        }
    }

    @Test
    fun testModelCorrectType(){
        val result = generalPortfolioCorrectModelTest.takeCostElement();

        assertDoesNotThrow { result }
    }

    @After
    fun tearDown() {
        stopKoin()
    }
}