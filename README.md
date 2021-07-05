# Test-Driven Development: By Example

- 사용언어 : Kotlin
- Test framework : [Kotest](https://kotest.io/docs/quickstart/)

### 목표

- 책과 예제 실습을 통해 TDD 를 체득
- 실무에 적용해서 보다 나은 프로그래밍을 할 것
- 공부한 날은 TIL 작성할 것
- 개념적인 부분은 기록해서 남길 것

### Kotest

- 사용이유
    - 최근 사내 밋업에서 코틀린 테스트를 위해 다른팀에서 사용하는 프레임워크임을 공유 받음
    - 이름부터 이미 코틀린을 위한 테스트임이 드러나 사용해보고 싶음
    - 신기술 😄
- 걱정되는 점
    - 공식적으로는 Android 의 테스트 프레임워크인 Robolectric 서포트 하지 않음 → Mockk 이용


---

## TodoList

1. 다중 통화를 지원하는 Money 객체
  - 다중 통화를 지원하는 주식들의 보고서 만들기
    - 주와 가격 정보가 있을 경우 합계 정보 구하기
    - 주와 가격 정보, 화폐가 있을 경우 원하는 화폐로 합계 정보 구하기
  
---


### TIL

- 20210704
    - 서문이 너무 길어서, 지루했음
    - Kotest 프레임워크 사용
    
    
- 20210705
    - Kotest 설정 시, version 맞추기
    - kotlinDsl 설정 중