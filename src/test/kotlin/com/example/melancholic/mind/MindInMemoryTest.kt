package com.example.melancholic.mind

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldNotBe

/**
 * <p>테스트 리스트</p>
 * <ul>
 *  <li> 첫 번째 목표 - InMemory 환경이기 때문에 Auto Increment 구성을 할 수 없어 최대한 비슷하게 구현. </li>
 *  <li> 두 번째 목표 - 사용자에게 받은 title, content를 스키마 제약 조건에 맞는지 유효성 검사 (title: not null, 20글자 이하 content: not null, 200글자 이하) </li>
 *  <li> 세 번째 목표 - </li>
 * </ul>
 */
class MindInMemoryTest: FunSpec ({

    test("새로운 id 생성") {
        val id = 1

        id shouldNotBe null
    }

})