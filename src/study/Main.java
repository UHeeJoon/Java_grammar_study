package study;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        int[] n = new int[3];
        int num = 0;
        int sum = 0;
        int arr[] = new int[10];
        int cnt[] = new int[10];
        int k = 0;

        for (int i = 0; i < n.length; i++) {
            s = br.readLine();
            n[i] = Integer.parseInt(s);
        }

        num = (n[0] * n[1] * n[2]);
        while (num > 0) {
            sum += num % 10;
            arr[k] = num % 10;
            num /= 10;
            k++;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i] == j)
                    cnt[j] += 1;
            }

        }
        for(int i=0;i<10;i++) {
            bw.write(cnt[i] + "");
            bw.newLine();
        }

        bw.flush();
        bw.close();
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

문자열 숫자로 변환시 진수 지정
Integer.parseInt()를 사용
Integer.parseInt("1000",2);하면 1000을 2진수로 변환

class를 생성할 때 public이 붙은 class가 메인이 되어야 하며 파일명과 이름이 일치해야 한다
class Person{
    // 1: 속성(Attribute)
    int age;
    String name;

    // 2: 생성자(Constructor)
    Person(){}

    // 3: 메서드(Method)
    void move(){
        System.out.println("Person is moving");
    }
}

상속(Inheritance)란
말 그대로 부모 클래스가 가지고 있는 속성(변수)들과 동작/ 기능(메서드)들을 그대로 물려받아 새로운 클래스를 만드는 것
상속을 활용하면 물려받은 것들은 그대로 쓰면 되고, 거기에 덧붙여 새로운 것만 만들면 되므로 그만큼 노력과 시간이 세이브 됨
이때, 물려받게 되는 원본 클래스를 부모클래스(Parent class) 또는 슈퍼 클래스(Super class)라고 부른다.
상속받아 새롭게 만들어진 클래슨느 말 그대로 자식 클래스 (Child class) 또는 서브/ 하위 클래스(Sub class)라고 부른다
또 다른 표현으로는 기초/기반 클래스(Base class), 파생 클래스(Derived class)라고도 부른다. --> derived: (a) 유래된, 파생된
상속의 장점
가장큰 장점은 재활용성이다.
완전히 새로운 것을 만드는 것이 아니라 기존 부모로 부터 상속을 받아 필요한 것만 추가로 더해서 만드는 것
부모 클래스에 정의되어져 있는 멤버 필드(변수)나 메서드 들을 귿로 상속 받아 사용하면 된다.
상속받은 메서드라 해도 필요에 따라서 자식 클래스에서 용도를 변경해서 사용하는 것도 가능
상속의 사용
기존 부모클래스를 확장한다는 개념 --> extends 키워드 사용
부모클래스의 멤버 필드, 메서드는 상속이 가능하나 생성자는 상속이 안된다.
부모 클래스의 접근 제한자 private인 경우에는 아무리 자식 클래스가 상속을 받았다 하더라도 접근 불가능
ex)
class Person(){}
class Hero extends Person{
    super();를 하면 부모 클래스 생성자 호출 -== 생략가능, 자동 호출
    super(int a, int b)이런식으로 생성자 호출 가능
}


추상(Abstract) 클래스란 : 추상(부모) 클래스는 다른(자식) 클래스들의 공통적인 특징을 변수나 메서드로 정의만 해놓는 것
구체적인 내용은 작성하지 않고 공통적인 특징을 추상적으로 선언해서 사용하며
추상 클래스를 부모 클래스로 상속 받는 자식 클래스들에게 추상클래스가 갖고 있는 메소드 사용을 강제한다
ex)
    abstract class Animal{
        abstract void cry();
    }
    class Dog extends Animal{
        void cry(){System.out.println("멍멍");}
    }
추가로 객체 생성이 불가능하다


인터페이스란(Interface)?
 */

