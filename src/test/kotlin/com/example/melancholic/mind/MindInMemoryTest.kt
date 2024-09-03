package com.example.melancholic.mind

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldNotBe

class MindInMemoryTest: FunSpec ({

    test("새로운 id 생성") {
        val id = null

        id shouldNotBe null
    }

})