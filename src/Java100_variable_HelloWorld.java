import java.util.Scanner;
class Java100_variable_HelloWorld {
    public static void sum(Integer a){
        a+=400;
    }
    public static void main(String[] args) {
        Integer a = new Integer(200);

        System.out.println(a);
        sum(a);
        System.out.println(a);

    }
}
/*
// 배열의 복사
import java.util.Array;
배열 복사는 System.arraycopy(원본 배열, 범위, 복사배열 , 범위, 길이);
int[] arr = {1,2,3,4,5};
int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
System.arraycopy(arr, 2, arr2 , 4 ,3);
==> arr2 = [1,2,3,4,3,4,5,8,9,10};
System.out.println(Arrays.toString(arr2));


// 문자열 쪼개기 charAt();
String arr = "name";
System.out.println(arr.charAt(1));
==> a

length는 배열의 길이
length()는 문자열의 길이

자바는 입력 받는것을
import java.util.Scanner;를 하고
Scanner sc = new Scanner(System.in);으로 작성
nextInt 는 정수 입력
next는 문자

함수를 생성할 때
메인 함수가 static으로 선언 되어있으므로 함수들도 앞에 static을 붙여 줘야 함

메서드란?
메서드는 다른 언어에서의 함수와 마찬가지로 어떤 특정한 동작이나 처리를 하도록 만들어진 코드 단위이다
반복적인 작업을 처리해야 하는 경우 메서드로 만들어 놓으면 이후에 필요할 때 다시 재사용할 수 있어서 아주 유용하다.
메서드는 호출시 어떤 결과를 반환하기도 하지만, 결과를 반환하지 않는 메서드도 있다
메서드는 호출시 어떤 인자값들을 넘겨서 호출하는 경우도 있지만, 인자 값 없이 호출하는 경우도 있다

static이 선언 안된 메소드를 사용하는 법
Java100_variavle_HellowWorld adj = new Java100_variavle_HellowWorld();
adj.sum();
이런 식으로 객체로 만들어서 사용해야함 ㅇㅇㅇ

reference로 값을 참조 할려면
Integer a = new Integer(100);
이것은 Integer형 객체 생성 후 100으로 초기화 한 것
이를 Wrapper클래스로 구현한 Integer 클래스 타입 변수라고 함
이렇게 하면 함수에서 가져다 썼을 때 int a로 선언한것과 달리 메모리 하나로 처리 가능
즉
int a는 main에서의 변수 함수에서 가져다 쓴다 해도 함수에서 새롭게 생성한 변수의 메모리 사용하고
Integer a = new Integer() 와 같이 선언하면 한개의 메모리로 사용 하지만 *(포인터)와 같이 
외부 함수에서 값을 변경 하더라도 적용되지 않음

 */
