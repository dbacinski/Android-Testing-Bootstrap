package com.example.bootstrap

import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoRule
import org.mockito.quality.Strictness

object MockitoRuleFactory {

    fun mockitoStrictRule(): MockitoRule {
        return MockitoJUnit.rule().strictness(Strictness.STRICT_STUBS)
    }
}