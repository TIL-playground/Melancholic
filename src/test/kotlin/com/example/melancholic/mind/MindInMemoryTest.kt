package com.example.melancholic.mind

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.string.shouldHaveMaxLength

/**
 * <p>테스트 리스트</p>
 * <ul>
 *  <li> 첫 번째 목표 - InMemory 환경이기 때문에 Auto Increment 구성을 할 수 없어 최대한 비슷하게 구현. </li>
 *  <li> 두 번째 목표 - 사용자에게 받은 title, content를 스키마 제약 조건에 맞는지 유효성 검사 (title: not null, 30글자 이하 content: not null, 200글자 이하) </li>
 *  <li> 세 번째 목표 - </li>
 * </ul>
 */
data class Mind(
    val title: String,
    val content: String
)

class MindInMemoryTest: FunSpec ({

    val repository = mutableMapOf<Int, Mind>()

    beforeTest {
        repository.clear()
    }

    test("새로운 id 생성") {
        val id = 1

        id shouldNotBe null
    }

    test("새로운 Mind 생성") {
        val content: String = "새로운 Mind를 생성합니다. 해당 Mind의 제목는 30글자가 넘어갈 것입니다. 아마도?"
        val id = 1

        repository[id] = content

        repository[id] shouldBe content
        repository.size shouldBe content
    }
})