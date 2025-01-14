## 배열의 원소만큼 추가하기

### 문제 설명
아무 원소도 들어있지 않은 빈 배열 `X`가 있습니다.  
양의 정수 배열 `arr`가 매개변수로 주어질 때, `arr`의 앞에서부터 차례대로 원소를 보면서 원소가 `a`라면 `X`의 맨 뒤에 `a`를 `a`번 추가하는 일을 반복한 뒤의 배열 `X`를 return 하는 `solution` 함수를 작성해 주세요.

---

### 제한사항
- $1 \leq arr \text{의 길이} \leq 100$
- $1 \leq arr \text{의 원소} \leq 100$

---

### 입출력 예

| arr         | result                                 |
|-------------|----------------------------------------|
| `[5, 1, 4]` | `[5, 5, 5, 5, 5, 1, 4, 4, 4, 4]`       |
| `[6, 6]`    | `[6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]` |
| `[1]`       | `[1]`                                  |

---

### 입출력 예 설명

#### 예제 #1
예제 1번에 대해 `a`와 `X`를 나타내보면 다음 표와 같습니다.

| `a` | `X`                              |
|-----|----------------------------------|
|     | `[]`                             |
| `5` | `[5, 5, 5, 5, 5]`                |
| `1` | `[5, 5, 5, 5, 5, 1]`             |
| `4` | `[5, 5, 5, 5, 5, 1, 4, 4, 4, 4]` |

따라서 `[5, 5, 5, 5, 5, 1, 4, 4, 4, 4]`를 return 합니다.

#### 예제 #2
예제 2번에 대해 `a`와 `X`를 나타내보면 다음 표와 같습니다.

| `a` | `X`                                    |
|-----|----------------------------------------|
|     | `[]`                                   |
| `6` | `[6, 6, 6, 6, 6, 6]`                   |
| `6` | `[6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]` |

따라서 `[6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]`를 return 합니다.

#### 예제 #3
예제 3번에 대해 `a`와 `X`를 나타내보면 다음 표와 같습니다.

| `a` | `X`   |
|-----|-------|
|     | `[]`  |
| `1` | `[1]` |

따라서 `[1]`을 return 합니다.
# 회고
### 고정 배열 size

### 다른 풀이 방법: Array.fill
```java
public int[] solution(int[] arr) {
    int size = 0;
    for (int i : arr) {
        size += i;
    }
    
    int[] answer = new int[size];
    int index = 0;
    for (int i : arr) {
        Arrays.fill(answer, index, index + i, i);
        index += i;
    }

    return answer;
}
```
### 다른 풀이 방법: Stream API
```java
public int[] solution(int[] arr) {
    return Arrays.stream(arr)
                 .flatMap(i -> IntStream.generate(() -> i).limit(i))
                 .toArray();
}
```
### Reference 
[java 21 docs: Arrays.fill(int[],int,int,int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Arrays.html#fill(int[],int,int,int))