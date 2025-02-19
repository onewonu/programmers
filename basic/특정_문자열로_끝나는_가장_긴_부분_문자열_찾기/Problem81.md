## 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기

### 문제 설명
문자열 `myString`과 `pat`가 주어집니다.  
`myString`의 부분 문자열 중 `pat`로 끝나는 **가장 긴 부분 문자열**을 찾아서 반환하는 `solution` 함수를 작성하세요.

---

### 제한사항
- $5 \leq \text{myString의 길이} \leq 20$
- $1 \leq \text{pat의 길이} \leq 5$
- `pat`은 반드시 `myString`의 부분 문자열로 주어집니다.
- `myString`과 `pat`에 등장하는 알파벳은 대문자와 소문자를 구분합니다.

---

### 입출력 예

| `myString`  | `pat`  | `result`    |
|-------------|--------|-------------|
| "AbCdEFG"   | "dE"   | "AbCdE"     |
| "AAAAaaaa"  | "a"    | "AAAAaaaa"  |

---

### 입출력 예 설명

#### 예제 #1
- `"AbCdEFG"`에서 `"dE"`는 한 번 등장합니다.
- 해당 위치까지 잘라내면 `"AbCdE"`가 됩니다.
- 이 문자열이 `"dE"`로 끝나는 가장 긴 부분 문자열입니다.  
  따라서 `"AbCdE"`를 반환합니다.

#### 예제 #2
- `"AAAAaaaa"`에서 `"a"`는 총 네 번 등장합니다.
- 가장 마지막에 있는 `"a"`의 위치까지 잘라내면 `"AAAAaaaa"`가 됩니다.
- 이 문자열이 `"a"`로 끝나는 가장 긴 부분 문자열입니다.  
  따라서 `"AAAAaaaa"`를 반환합니다.
# 회고
### 요구사항 정리
- 가장 긴 부분 문자열: 주어진 문자열(myString)의 끝에서부터 비교 대상(pat)을 찾아가는 과정.
- ### 다른 풀이 방법: 루프
```java
public String solution(String myString, String pat) {
    for (int i = myString.length(); i >= 0; i--) {
        if (myString.substring(0, i).endsWith(pat)) {
            return myString.substring(0, i);
        }
    }
    return "";
}
```
### 다른 풀이 방법: 정규식
```java
public String solution(String myString, String pat) {
    return myString.replaceAll(".*(?=" + pat + "$)", "") + pat;
}
```