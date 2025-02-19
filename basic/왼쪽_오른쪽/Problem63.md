## 왼쪽 오른쪽

### 문제 설명
문자열 리스트 `str_list`에는 `"u"`, `"d"`, `"l"`, `"r"` 네 개의 문자열이 여러 개 저장되어 있습니다.  
`str_list`에서 `"l"`과 `"r"` 중 먼저 나오는 문자열이 `"l"`이라면 해당 문자열을 기준으로 **왼쪽에 있는 문자열들을 순서대로 담은 리스트를**,  
먼저 나오는 문자열이 `"r"`이라면 해당 문자열을 기준으로 **오른쪽에 있는 문자열들을 순서대로 담은 리스트를** `return`하도록 `solution` 함수를 완성해주세요.  
`"l"`이나 `"r"`이 없다면 **빈 리스트**를 `return`합니다.

---

### 제한사항
- $1 \leq \text{str_list의 길이} \leq 20$
- `str_list`는 `"u"`, `"d"`, `"l"`, `"r"` 네 개의 문자열로 이루어져 있습니다.

---

### 입출력 예

| str_list               | result       |
|------------------------|--------------|
| `["u", "u", "l", "r"]` | `["u", "u"]` |
| `["l"]`                | `[]`         |

---

### 입출력 예 설명

#### 예제 #1
- `"r"`보다 `"l"`이 먼저 나왔기 때문에 `"l"`의 왼쪽에 있는 문자열들을 담은 리스트인 `["u", "u"]`를 `return`합니다.

#### 예제 #2
- `"l"`의 왼쪽에 문자열이 없기 때문에 빈 리스트를 `return`합니다.
# 회고
### copyOfRange
- Arrays.copyOfRange(original, from, to)
  - original: 복사 대상이 되는 원본 배열.
  - from: 복사 시작 인덱스(포함).
  - to: 복사 끝 인덱스(포함되지 않음).
### Reference
[java 21 docs: Arrays.copyOfRange(int[],int,int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Arrays.html#copyOfRange(int[],int,int))