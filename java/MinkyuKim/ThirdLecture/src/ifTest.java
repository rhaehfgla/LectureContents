// public class에 어노는 이름은 파일명에서 .java를 제외한 이름과 동일해야 한다.
// 또한 한 파일 내에서 public class는 오직 하나뿐이다.

// 숙제 케이스. public class number << -- 요런 부분의 지양해야 하니 주의해주세요 ~
// public class Number <<<-- 단어 이니셜마다 대문자가 들어가는 형식으로 표현해줘야 합니다.
// 자바에서 습관처럼 굳어진 관습이니 지켜주세요 ~
public class ifTest {
    public static void main(String[] args) {
        int num1 = 7, num2 = 3;


        //if 문은 어떻게 작성하나요?
        // 1. if를 적고 소괄호를 열고 닫고, 중괄호를 열고 닫는다.
        // 2. 소괄호 내부에 조건을 적는다.
        //    조건에는 다음과 같은 케이스들이 존재한다.
        //    >, <, >=, <=, ==. !=
        //    A > B: A가 B보다 크면 참(1) 아니면 거짓 (0)
        //    A < B: A가 B 보다 작으면 참(1) 아니면 거짓(0)
        //    A >= B: A가 B보다 작거나 같으면 참(1) 아니면 거짓 (0)
        //    A <= B : A가 B보다 작거나 같으면 참(1) 아니면 거짓(0)
        // 3. 조건이 만족하였을 경우 동작시킬 코드를 중괄호 내부에 작성한다.
        if (num1 <num2) {
            // 위 조건이 만족하였으므로 아래 코드가 동작한다.
            // 아래 코드는 단순히 결과를 출력하기 위한 코드다.
            System.out.printf("%d < %d\n", num1, num2);
        } else {
            // else의 경우 위 num1 < num2 조건이 만족하지 않았을 경우에 동작한다.
            System.out.printf("%d > %d\n", num1, num2);
        }
    }
}
