# kotlin-lotto

## 🚀 1단계 - 문자열 덧셈 계산기

### 기능 요구 사항

- 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
- 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과
  같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
- 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.

### 기능 구현 목록

- 숫자(Number)
    - [x] 음수가 될 수 없다.
    - [x] 1억을 넘을 수 없다.
    - [x] 다른 숫자와 덧셈을 할 수 있다.


- 구분자(Separator)
    - 기본 구분자와 커스텀 구분자가 존재한다.
        - [x] 쉼표(,)와 콜론(:)을 기본 구분자로 사용한다.


- 구분자들(Separators)
    - [x] 구분자를 여러 개 가질 수 있다.
    - [x] 구분자를 추가할 수 있다.
    - [x] 구분자는 공백일 수 없다.


- 계산기(Calculator)
    - [x] 계산할 식을 하나의 문자열로 입력 받을 수 있다.
        - [x] 빈 문자열 또는 `null`을 입력받은 경우 0을 반환한다.
    - [x] 입력받은 문자열을 숫자와 구분자로 분리할 수 있다.
        - [x] 문자열 앞부분의 "//"와 "\n" 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
    - [x] 분리된 숫자와 연산자를 통해 계산을 수행할 수 있다.
        - [x] 숫자 하나를 입력받은 경우 해당 숫자를 반환한다.

## 🚀 2단계 - 로또(자동)

### 기능 요구 사항

- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- 로또 1장의 가격은 1000원이다.

### 기능 구현 목록

- 로또 구입 금액(LottoPurchaseAmount)
    - [ ] 구입 금액은 1000원 단위의 자연수로만 가능하다.


- 로또 구입 개수(LottoPurchaseCount)
    - [ ] 구입 금액에 해당하는 로또 개수를 반환한다.


- 로또 볼(LottoBall)
    - [ ] 하나의 번호를 가진다.
    - [ ] 로또 번호는 1부터 45까지의 수로 구성된다.


- 로또 게임(LottoGame)
    - [ ] 6개의 로또 볼로 이루어진다.
    - [ ] 각각의 로또 볼은 중복될 수 없다.


- 로또 게임들(LottoGames)
    - [ ] 한 개 이상의 로또 게임을 가지고 있다.


- 당첨 번호(WinningLottoGame)
    - [ ] 하나의 문자열을 입력받아 하나의 로또 게임으로 변환한다.


- 로또 머신(LottoMachine)
    - [ ] 로또 게임들(LottoGames)을 생성할 수 있다.


- 로또 등수(LottoRank)
    - [ ] 1등부터 5등과 꽝으로 이루어져 있다.
    - [ ] 각 등수에 해당하는 당첨금을 가지고 있다.


- 게임 결과(LottoGameResult)
    - [ ] 당첨 번호와 로또 게임을 비교하여 등수를 반환한다.


- 게임 결과들(LottoGameResults)
    - [ ] 한 개 이상의 게임 결과를 가지고 있다.


- 로또 체크 머신(LottoCheckMachine)
    - [ ] 로또 게임들과 당첨 번호를 비교하여 게임 결과들(LottoGameResults)을 반환한다.


- 당첨 통계(LottoStatistics)
    - [ ] 게임 결과들(LottoGameResults)을 통해 각 등수의 당첨 횟수를 계산한다.
    - [ ] 수익률을 계산할 수 있다.


- 수익률(LottoProfitRate)
    - [ ] 당첨금 / 구입 금액으로 계산한다.
    - [ ] 소수점 셋째 자리에서 반올림한다.


- InputView
    - [ ] 구입 금액을 입력받을 수 있다.
    - [ ] 당첨 번호를 입력받을 수 있다.


- OutputView
    - [ ] 구입한 로또 게임들을 출력할 수 있다.
    - [ ] 당첨 통계를 출력할 수 있다.
    - [ ] 수익률을 출력할 수 있다.
        - [ ] 수익률이 1 미만이면 "(기준이 1이기 때문에 결과적으로 손해라는 의미임)" 문구를 추가한다.
