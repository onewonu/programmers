## 커피 심부름

---

### 문제 설명
팀의 막내인 철수는 **아메리카노와 카페 라테만 판매하는 카페**에서 팀원들의 커피를 사려고 합니다.  
각 팀원은 주문을 적어 제출했으며, 철수는 특정 규칙에 따라 **최종 주문을 정리**합니다.

각 메뉴의 가격은 다음과 같습니다.
- **아메리카노** (차가운 것과 뜨거운 것 상관없이): **4,500원**
- **카페 라테** (차가운 것과 뜨거운 것 상관없이): **5,000원**

### **주문 규칙**
1. **메뉴만 적은 경우 (`"americano"`, `"cafelatte"`)**
    - `americano` → **차가운 아메리카노**로 주문
    - `cafelatte` → **차가운 카페 라테**로 주문

2. **"아무거나" (`"anything"`) 를 적은 경우**
    - **차가운 아메리카노**로 주문

3. **이미 차가운/뜨거운 메뉴를 지정한 경우**
    - 기존 주문을 그대로 유지

---

### **제한사항**
- $( 1 \leq \text{order 의 길이} \leq 1,000 )$
- `order`의 원소는 아래의 값 중 하나만 포함됨:
    - `"iceamericano"`, `"americanoice"`
    - `"hotamericano"`, `"americanohot"`
    - `"icecafelatte"`, `"cafelatteice"`
    - `"hotcafelatte"`, `"cafelattehot"`
    - `"americano"`, `"cafelatte"`
    - `"anything"`

---

### **입출력 예**

| order                                                       | result |
|-------------------------------------------------------------|--------|
| `["cafelatte", "americanoice", "hotcafelatte", "anything"]` | 19000  |
| `["americanoice", "americano", "iceamericano"]`             | 13500  |

---

### **입출력 예 설명**

#### **예제 #1**
| `order[i]`       | 팀원이 적은 음료 | 실제 주문 음료  |
|------------------|-----------|-----------|
| `"cafelatte"`    | 카페 라테     | 차가운 카페 라테 |
| `"americanoice"` | 차가운 아메리카노 | 차가운 아메리카노 |
| `"hotcafelatte"` | 따뜻한 카페 라테 | 따뜻한 카페 라테 |
| `"anything"`     | 아무거나      | 차가운 아메리카노 |

- 총 주문:
    - **차가운 아메리카노** × 2 → 4,500 × 2 = 9,000원
    - **차가운 카페 라테** × 1 → 5,000 × 1 = 5,000원
    - **따뜻한 카페 라테** × 1 → 5,000 × 1 = 5,000원
- **총 결제 금액**: **19,000원**

✔ 반환값: **`19000`**

---

#### **예제 #2**
| `order[i]`       | 팀원이 적은 음료 | 실제 주문 음료  |
|------------------|-----------|-----------|
| `"americanoice"` | 차가운 아메리카노 | 차가운 아메리카노 |
| `"americano"`    | 아메리카노     | 차가운 아메리카노 |
| `"iceamericano"` | 차가운 아메리카노 | 차가운 아메리카노 |

- 총 주문:
    - **차가운 아메리카노** × 3 → 4,500 × 3 = 13,500원

✔ 반환값: **`13500`**
# 회고
### 다른 풀이 방법: HashMap
```java
import java.util.HashMap;

public int solution(String[] order) {
    HashMap<String, Integer> menuPrices = new HashMap<>();
    menuPrices.put("americano", 4500);
    menuPrices.put("cafelatte", 5000);
    
    int totalPrice = 0;
    for (String menu : order) {
        if (menu.startsWith("americano") || menu.equals("anything")) {
            totalPrice += menuPrices.get("americano");
        } else {
            totalPrice += menuPrices.get("cafelatte");
        }
    }

    return totalPrice;
}
```