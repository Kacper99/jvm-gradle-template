package com.martela.sandboxservice.utils

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class HelloUtilsTest {

        @Test
        fun hello() {
            val helloUtils = HelloUtils()
            assertEquals("Hello World!", helloUtils.hello())
        }
}