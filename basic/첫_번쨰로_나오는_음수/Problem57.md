# 첫 번째로 나오는 음수

## 문제 설명
정수 리스트 `num_list`가 주어질 때, **첫 번째로 나오는 음수의 인덱스**를 반환하는 함수 `solution`을 완성하세요.  
만약 음수가 없다면 **-1**을 반환합니다.

---

## 제한사항
- $5 \leq \text{num_list의 길이} \leq 100$
- $-10 \leq \text{num_list의 원소} \leq 100$

---

## 입출력 예

| num_list                    | result |
|-----------------------------|--------|
| [12, 4, 15, 46, 38, -2, 15] | 5      |
| [13, 22, 53, 24, 15, 6]     | -1     |

---

## 입출력 예 설명

### 예제 #1
- `num_list`에서 첫 번째 음수는 **5번 인덱스**의 `-2`입니다. 따라서 `5`를 반환합니다.

### 예제 #2
- `num_list`에 음수가 없으므로 `-1`을 반환합니다.