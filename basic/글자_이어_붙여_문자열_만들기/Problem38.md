# 글자 이어 붙여 문자열 만들기

### 문제 설명
문자열 `my_string`과 정수 배열 `index_list`가 매개변수로 주어집니다. `my_string`의 `index_list`의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 return 하는 `solution` 함수를 작성해 주세요.

### 제한사항
- 1 ≤ `my_string`의 길이 ≤ 1,000
- `my_string`의 원소는 영소문자로 이루어져 있습니다.
- 1 ≤ `index_list`의 길이 ≤ 1,000
- 0 ≤ `index_list`의 원소 < `my_string`의 길이

### 입출력 예

| my_string            | index_list                               | result        |
|----------------------|------------------------------------------|---------------|
| "cvsgiorszzzmrpaqpe" | [16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7] | "programmers" |
| "zpiaz"              | [1, 2, 0, 0, 3]                          | "pizza"       |

### 입출력 예 설명

#### 입출력 예 #1
- 예제 1번의 `my_string`에서 인덱스 `3`, `5`, `6`, `11`, `12`, `14`, `16`, `17`에 해당하는 글자는 각각 `g`, `o`, `r`, `m`, `r`, `a`, `p`, `e`입니다.
- `my_string`에서 `index_list`에 들어있는 원소에 해당하는 인덱스의 글자들을 순서대로 모으면 `p`, `r`, `o`, `g`, `r`, `a`, `m`, `m`, `e`, `r`, `s`가 되어 "programmers"를 반환합니다.

#### 입출력 예 #2
- 예제 2번의 `my_string`에서 인덱스 `0`, `1`, `2`, `3`에 해당하는 글자는 각각 `z`, `p`, `i`, `a`입니다.
- `my_string`에서 `index_list`에 들어있는 원소에 해당하는 인덱스의 글자들을 순서대로 모으면 `p`, `i`, `z`, `z`, `a`가 되어 "pizza"를 반환합니다.
# 회고
처음 생각한 방식은 my_string 의 각 문자를 배열에 담은 후, index_list 의 값에 해당하는 인덱스를 참조하여 StringBuilder 로 이어 붙이는 방식이다.  
개선한 방식은 my_string 을 별도의 문자 배열로 만들 필요 없이 바로 인덱스를 참조하도록 수정하였다.
### Reference
[java 21 docs: StringBuilder](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/StringBuilder.html)  