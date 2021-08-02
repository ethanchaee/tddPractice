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
    - 다중 통화를 지원하는 주식들의 보고서 만들기 (by. me)
        - 주와 가격 정보가 있을 경우 합계 정보 구하기
        - 주와 가격 정보, 화폐가 있을 경우 원하는 화폐로 합계 정보 구하기
    - by.Book
      - $5 + 10CHF = $10 (환율이 2:1 인 경우)
      - $5 + $5 = $10
      - ~~Bank.reduce(Money)~~
      - Money에 대한 통화 변환을 수행하는 Reduce
      - Reduce(Bank, String)
      - ~~$5 X 2 = $10~~
      - ~~amount 를 private 으로~~
      - ~~달러 부작용~~ (달러 연산 시, dollar 값이 변경 되는 것)
      - Money 반올림?
      - ~~equals~~
      - hashCode
      - Equal null
      - Equal object
      - ~~5CHF X 2 = 10CHF~~
      - Dollar/Franc 중복
      - ~~공용 equals~~
      - ~~공용 times~~
      - ~~프랑과 달러 비교하기~~
      - ~~통화?~~
      - testFrancMultiplication 제거
    
---

### TIL

- 20210704
    - 서문이 너무 길어서, 지루했음
    - Kotest 프레임워크 사용
    
- 20210705
    - Kotest 설정 시, version 맞추기
    - kotlinDsl 설정 중

- 20210706
    - Todo 작성
    - one and only one → 필요한 것을 하되(one) 단 한 번만(only one) 하라
    - 의존성이 문제 그 자체라면, 중목은 문제의 징후
    - 중복된 로직을 하나로 끄집어낼 때에는 객체를 활용할 것
    - 프로그램에서는 중복을 제거하면 의존성이 제거됨
    - TDD 의 색심은 작은 단계를 밟아야 한다는 것이 아니라, 작은 단계를 밟을 능력을 갖추어야 한다는 것
    - 1장끝
    - 최대한 빨리 초록색을 보기 위해 취할 수 있는 전략 두가지
        - 가짜로 구현하기 : 상수로 반환하게 만들고 진짜 코드를 얻을 때 까지 단계적으로 상수를 변수로 바꾸어감
        - 명백한 구현하기 : 실제 구현을 입력
    - 느낌을 테스트로 변환하는 것이 TDD 의 일반적 주제
    - 일단 올바른 행위에 대해 결정을 내린 후에, 그 행위를 얻어낼 수 있는 최상의 방법에 대해 이야기할 수 있음
    - 2장끝
    - 값 객체 패턴 (value object pattern) : 객체를 값 처럼 쓰는 패턴
        - 제약사항 : 객체의 인스턴스 변수가 생성자를 통해 생성된 이후에너느 결코 변하지 않음
        - 단, 이를 사용하면 `별칭문제`가 사라짐 → 한번 생성된 객체의 값이 영원히 변하지 않음을 보장하므로
        - 별칭문제 : 수표 하나가 있는데 여기에 $5를 설정하고, 또 다른 수표에 아가 설정했던 $5를 설정 한 후, 두번째 수표의 값을 변화시키는 바람에 첫번째 수표의 값이 변화되는 문제
    - Kotlin data 클래스의 경우, 자동적으로 equals, hash 가 구현됨
    
- 20210707
    - 코드 단에서 완벽함을 위해 노력하지 않고, 모든 것을 두 번 말함으로써 (코드, 테스트) 자신감을 가지고 전진할 수 있을 만큼 결함의 정도를 낮추기를 희망할 뿐
    - 4장끝
    - 처음 네 단계는 빠르게 진행
        1. 테스트 작성
        2. 컴파일되게 하기
        3. 실패하는지 확인하기 위해 실행
        4. 실행하게 만듦
        5. 중북제거
    - data class 디컴파일 해서 확인
        - tools → kotlin → show kotlin byte code → decompile
    - 5장끝
    
- 2021.08.02
    - 두 클래스의 공통 상위 클래스를 부모 클래스로 만듦
    - 각 클래스에 종북된 equals 를 부모 클래스로 옮김 (6장 끝)
    - 프랑과 달러가 동치성 확인 (7장끝)
    - 팩토리 메서드를 도입하여 테스트 코드에서 하위 클래스의 존재 사실을 분리
    - 하위 클래스가 사라지면 몇몇 테스트는 불필요한 여분의 것이 됨 (8장 끝)
    - 기존 소스 구조에서는 필요했지만 새로운 구조에서는 필요없게된 테스트 코드 삭제 가능 (11장 끝)
    - 핵심이 되는 객체가 다른 부분에 대해서 될 수 있는 한 모르도록 노력함
        - 핵심 객체를 가능한 오랫 동안 유연하게 할 수 있음
        - 테스트 하기 쉽고, 재활용하거나 이해하기에 쉬운 상태로 남아있을 수 있음
    - Expression 을 interface 로 만듦 (왜?) 