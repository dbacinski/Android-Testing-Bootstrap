package com.example.bootstrap

import com.example.bootstrap.MockitoRuleFactory.mockitoStrictRule
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.verify

class MainPresenterTest {

    @get:Rule
    val MockitoRule = mockitoStrictRule()

    @Mock
    lateinit var mainViewStub: MainView

    @Test
    fun `calls do something at view creation`() {
        //given
        val objectUnderTest = MainPresenter()
        //when
        objectUnderTest.createView(mainViewStub)
        //then
        verify(mainViewStub).doSomething()
    }
}