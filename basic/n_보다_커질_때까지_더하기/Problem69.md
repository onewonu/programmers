# n보다 커질 때까지 더하기

## 문제 설명
정수 배열 `numbers`와 정수 `n`이 매개변수로 주어집니다.  
`numbers`의 원소를 앞에서부터 하나씩 더하다가 그 합이 `n`보다 커지는 순간 이때까지 더했던 원소들의 합을 `return`하는 `solution` 함수를 작성해 주세요.

## 제한사항
- `1 ≤ numbers의 길이 ≤ 100`
- `1 ≤ numbers의 원소 ≤ 100`
- `0 ≤ n < numbers의 모든 원소의 합`

## 입출력 예

| numbers                  | n   | result |
|--------------------------|-----|--------|
| [34, 5, 71, 29, 100, 34] | 123 | 139    |
| [58, 44, 27, 10, 100]    | 139 | 239    |

## 입출력 예 설명

### 예제 1번
`numbers`를 문제 설명대로 더해가는 과정을 나타내면 다음의 표와 같습니다.

| i | numbers[i] | sum |
|---|------------|-----|
|   |            | 0   |
| 0 | 34         | 34  |
| 1 | 5          | 39  |
| 2 | 71         | 110 |
| 3 | 29         | 139 |

29를 더한 뒤 `sum` 값은 139이고 `n` 값인 123보다 크므로 139를 `return` 합니다.

### 예제 2번
`numbers`의 마지막 원소 전까지의 원소를 `sum`에 더하면 139입니다.  
139는 `n` 값인 139보다 크지 않고 마지막 원소인 100을 더하면 139보다 커지므로 239를 `return` 합니다.
# 회고
### 다른 풀이 방법: Stream API
```java
public int solution(int[] numbers, int n) {
    final int[] sum = {0};
    return Arrays.stream(numbers)
                 .takeWhile(num -> (sum[0] += num) <= n)
                 .sum();
}
```
**takeWhile**
1. 스트림의 요소를 순차적으로 평가.
2. 주어진 조건을 만족하는 동안 요소를 유지.
3. 조건이 만족되지 않는 첫 번째 요소를 만나면 평가를 중단하고 그 이후의 요소는 처리하지 않는다.
### Reference
[java 21 docs: takeWhile](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/stream/IntStream.html#takeWhile(java.util.function.IntPredicate))