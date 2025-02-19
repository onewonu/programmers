# 문자열 겹쳐쓰기
### 문제 설명
문자열 `my_string`, `overwrite_string`과 정수 `s`가 주어집니다. 문자열 `my_string`의 인덱스 `s`부터 `overwrite_string`의 길이만큼을 문자열 `overwrite_string`으로 바꾼 문자열을 return 하는 `solution` 함수를 작성해 주세요.
### 제한사항
- `my_string`과 `overwrite_string`은 숫자와 알파벳으로 이루어져 있습니다.
- 1 ≤ `overwrite_string`의 길이 ≤ `my_string`의 길이 ≤ 1,000
- 0 ≤ `s` ≤ `my_string`의 길이 - `overwrite_string`의 길이
### 입출력 예

| my_string         | overwrite_string | s  | result           |
|-------------------|------------------|----|------------------|
| "He11oWor1d"      | "lloWorl"        | 2  | "HelloWorld"     |
| "Program29b8UYP"  | "merS123"        | 7  | "ProgrammerS123" |

### 입출력 예 설명
#### 예시 #1
- 예제 1번의 `my_string`에서 인덱스 2부터 `overwrite_string`의 길이만큼에 해당하는 부분은 "11oWor1"이고, 이를 "lloWorl"로 바꾼 "HelloWorld"를 반환합니다.
#### 예시 #2
- 예제 2번의 `my_string`에서 인덱스 7부터 `overwrite_string`의 길이만큼에 해당하는 부분은 "29b8UYP"이고, 이를 "merS123"로 바꾼 "ProgrammerS123"을 반환합니다.ring에서 인덱스 7부터 overwrite_string의 길이만큼에 해당하는 부분은 "29b8UYP"이고 이를 "merS123"로 바꾼 "ProgrammerS123"를 return 합니다.
# 회고
1. 인덱스 전까지의 문자열을 추출하고, 그 부분을 덮어쓴다.
2. 덮어쓴 부분의 끝에서 부터 나머지 부분을 합쳐 최종 문자열을 생성.
3. ex)
   - my_string: "He11oWor1d"
   - overwrite_string: "lloWorl"
   - s: 2
	1. overwrite_string 의 길이는 7, 2번 인덱스부터 8번 인덱스까지 "11oWor1" 부분이 "lloWorl"로 덮어씁니다.
	2. 덮어쓴 부분 이후인 9번 인덱스부터 나머지 문자열 "d"를 추출.
	3. 앞부분 "He", 덮어쓴 부분 "lloWorl", 뒷부분 "d"를 합치면 "HelloWorld"
- subString()
  - 문자열의 특정 부분을 추출하는 데 사용되는 메서드
### Reference
[java 21 docs: String.subString(int, int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#substring(int,int))  
[java 21 docs: String.subString(int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#substring(int))