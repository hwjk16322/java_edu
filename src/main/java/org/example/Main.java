package org.example;

/* class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        StringBuilder str1_1 = new StringBuilder(str1);
        StringBuilder str2_1 = new StringBuilder(str2);

        StringBuilder answer_1 = str1_1.replace(str2, "*");
        int count = 0;
        for (int i = 0; i < answer_1.length(); i++) {
            if (answer_1[i] == "*") {
                count++;


            }
        }
        if (count >= 1) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}
*/








/*
class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();

        c1.carNumber = 1234;
        c2.carNumber = 2345;
        c3.carNumber = 3456;

        c1.speed = 200;
        c2.speed = 300;
        c3.speed = 150;

        c1.run();
        c2.run();
        c3.run();

    }
}
*/










/*
class Main {
    public static void main(String[] args) {
        // 수정가능지역 시작
        자동차 car1 = new 페라리();
        자동차 car2 = new 자동차();
        페라리 car3 = (페라리)car2;

        // 수정가능지역 끝
    }
}

class 자동차 {
    void 달리다() {
    }

    void 서다() {

    }

}

class 페라리 extends 자동차 {
    void 뚜껑이_열리다() {
    }
}

*/









/*
class Main {
    public static void main(String[] args) {
        int i = 로봇.get정수();
        boolean b = 로봇.get논리();
        사람 a사람 = 로봇.get사람();
        사람 a사람2 = 로봇.get사람2();
        사람 a사람3 = 로봇.get사람3();
        사람 a사람4 = 로봇.get사람4();
        사람 a사람5 = 로봇.get사람5(123, false);
        로봇.get사람6(123, false);
    }
}

class  로봇 {
     static int get정수() {
         return 0;
     }

    static boolean get논리() {

        return true;
    }

    static 사람 get사람() {
        return null;
    }
    static 사람 get사람2() {
        return null;
    }
    static 사람 get사람3() {
        return null;
    }
    static 사람 get사람4() {
        return null;
    }
    static 사람 get사람5(int i, boolean b) {
        return null;
    }
    static 사람 get사람6(int i, boolean b) {
        return null;
    }

}

class 사람 {

    void  a사람(){}
    void  a사람2(){}
    void  a사람3(){}
    void  a사람4(){}
    void  a사람5(){}

}
*/









/*
class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.달리기_속력 = 20;
        a사람.달리다();
        // 사람이 20km/h로 달립니다.
        a사람.달리다();
        // 사람이 20km/h로 달립니다.

        a사람.달리기_속력 = 50;
        a사람.달리다();
        // 사람이 50km/h로 달립니다.
    }
}

class 사람 {


    public int 달리기_속력;


    public void 달리다() {
        System.out.println("사람이 "+ this.달리기_속력 + "km/h 로 달립니다.");
    }
}
*/







/*
class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();

        a사람.나이 = 20;
        a사람.a왼팔 = new 팔();
    }
}

class 사람 {
    // 클래스안에 변수를 정의 할 수 있다.
    int 나이;
    팔 a왼팔;
}

class 팔 {

}

*/

/*
class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.나이 = 20;
        a전사.a무기 = new 활();
        a전사.a무기 = new 칼();
    }
}

class 전사{
    int 나이;
    무기 a무기;
}
class 무기{

}

class 활 extends 무기{

}
class 칼 extends 무기{

}


*/





/*
class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "카니";
        a전사.자기소개();

        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 카니가 활로 공격합니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 카니가 칼로 공격합니다.
    }
}

class 전사 {
    // 인스턴스 변수
    String 이름;
    // 인스턴스 변수
    int 나이;
    // 인스턴스 변수
    무기 a무기;

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }


    void 공격() {
        a무기.공격(this.이름);
    }
}

class 무기 {
    void 공격(String a) {

    }
}

class 칼 extends 무기 {
    void 공격(String a) {
        System.out.println(a + "가 칼 로 공격합니다");
    }
}

class 활 extends 무기 {
    void 공격(String a) {
        System.out.println(a + "가 활 로 공격합니다");
    }
}



*/




/*
// 힌트 : if ( a무기 == null ) { ... }

class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();
        a전사.공격();
        // 출력 => 아직 무기가 없습니다.
        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 => 칼로 공격합니다.
    }
}

class 전사{
    무기 a무기;

    void 공격(){
        if (a무기 == null){
            System.out.println(" 아직 무기가 없습니다. ");

        }else {
            System.out.println("칼로 공격합니다.");
        }
    }
}

class 무기{

}
class 칼 extends 무기{

}

*/
/*
class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.a무기1 = new 칼();
        a전사.공격();
        // 출력 => 전사가 칼로 공격합니다.

        a전사.a무기1 = new 활();
        a전사.공격();
        // 출력 => 전사가 활로 공격합니다.

        a전사.a무기2 = new 칼();
        a전사.공격();
        // 출력 => 전사가 활로 공격합니다.
        // 출력 => 전사가 칼로 공격합니다.
    }
}

class 전사 {
    무기 a무기1;
    무기 a무기2;

    void 공격() {
        if (a무기1 == null) {
        } else {
            a무기1.공격();
        }
        if (a무기2 == null) {
        } else {
            a무기2.공격();
        }
    }

}

class 무기 {

    void 공격() {

    }
}

class 활 extends 무기 {
    void 공격() {
        System.out.println(" 전사가 활로 공격합니다.");
    }
}

class 칼 extends 무기 {
    void 공격() {
        System.out.println(" 전사가 칼로 공격합니다.");
    }
}


*/
// 문제 : 아래와 같이 출력 되도록 해주세요.

/*

class Main {
    public static void main(String[] args) {
        캐릭터 a플레이어_캐릭터;

        a플레이어_캐릭터 = new 전사();
        a플레이어_캐릭터.공격();
        // 출력 : 전사가 대검으로 공격합니다.

        a플레이어_캐릭터 = new 마법사();
        a플레이어_캐릭터.공격();
        // 출력 : 마법사가 파이어볼로 공격합니다.
    }
}

class 캐릭터{

     void 공격() {
    }
}

class 전사 extends 캐릭터{
     void 공격(){
        System.out.println("전사가 대검으로 공격합니다.");
    }
}

class 마법사 extends 캐릭터{
    void 공격(){
        System.out.println("마법사가 파이어볼로 공격합니다.");

    }
}

*/



/*
// 문제 : 아래와 같이 출력되게 해주세요.

class Main {
    public static void main(String[] args) {
        전사 a전사0 = new 전사();
        a전사0.나이 = 20;
        a전사0.이름 = "칸";
        a전사0.성격 = "차가움";
        a전사0.a무기 = new 활();

        전사 a전사1 = new 전사();
        전사 a전사2 = new 전사();
        전사 a전사3 = new 전사();
        전사 a전사4 = new 전사();
        전사 a전사5 = new 전사();

        System.out.println(a전사0.이름);
        // 출력 : 칸
        System.out.println(a전사1.이름);
        // 출력 : No Name
        System.out.println(a전사2.이름);
        // 출력 : No Name
        System.out.println(a전사3.이름);
        // 출력 : No Name
        System.out.println(a전사4.이름);
        // 출력 : No Name
        System.out.println(a전사5.이름);
        // 출력 : No Name
    }
}

class 전사 {
    int 나이;
    String 이름;
    String 성격;
    무기 a무기;

    // `전사()` 는 생성자 메서드 이다.
    // 클래스 명과 같은 이름의 메서드를 생성자 메서드 라고 한다.
    // 생성자 메서드는 자동으로 호출됩니다.
    // 생성자 메서드는 new 할때(객체 생성할 때) 자동으로 호출됩니다.
    // 생성자 메서드는 다른 모든 메서드 보다 가장 먼저 딱 1번 실행됩니다.
    // 생성자 메서드는 리턴타입이 없습니다.
    // 당연하지만 생성자 메서드는 리턴값도 없습니다.
    전사() {
        // 수정가능지역 시작
        this.나이 = 20;
        this.이름 = "noname";
        this.성격 = "온순함";
        this.a무기 = new 칼();
        // 수정가능지역 끝
    }
}

abstract class 무기 {

}

class 칼 extends 무기 {

}

class 활 extends 무기 {

}

*/

/*
class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.나이 = 10;
        a사람.a왼팔 = new 팔();

        System.out.println(a사람.a왼팔.길이 + "cm");
        // 출력 : 100cm
    }
}

class 사람{
    int 나이;
    팔 a왼팔;

}

class 팔{
    int 길이;

    팔 (){
        길이 = 100;
    }
}


*/


/*
class Main {
    public static void main(String[] args) {
        new 사람().걷다();

        System.out.println(new 사람().a왼팔.길이 + "cm");
        // 출력 : 100cm
    }
}
class 사람 {

    팔 a왼팔;
    void 걷다() {
        System.out.println("사람 걷는다.");
    }
    사람(){
        a왼팔 = new 팔();
    }

}

class 팔 {
    int 길이;
    팔(){
        길이 = 100;
    }
}
*/

/*
class Main {
    // 함수, 메서드
    // 단순히 프로그램의 시작점!
    public static void main(String[] args) {
        // 지역변수 => 하루살이 변수
        int k = 10; // main 함수 안에서만 산다.

        사람 a사람 = new 사람();
        a사람.나이 = 20;

        int dan = 8;  // main 함수 안에서만 산다.
        for ( int i = 1; i < 9; i++ ) {
            // i => for block 안에서만 산다.
            System.out.println(dan + " * " + i + " = " + dan * i);
        }

        System.out.println(a사람.나이);
        a사람.걷다();
    }
}

class 사람 {
    // 인스턴스 변수
    int 나이;

    void 걷다() {
        int 나이 = 22;

        System.out.println(this.나이 + "살인 홍길동씨가 걷습니다.");
    }
}
*/


// 문제 : 아래와 같이 출력 되도록 해주세요.
/*
class Main {
    public static void main(String[] args) {
        int 엄지손가락_길이 = new 사람().a왼팔.a손.a엄지손가락.길이;

        System.out.println(엄지손가락_길이 + "cm");
        // 출력 : 5cm
    }
}

class 사람{
    팔 a왼팔;
    사람(){
        this.a왼팔 = new 팔();
    }
}

class 팔{
    손 a손;
    팔(){
        this.a손 = new 손();
    }
}

class 손{
    엄지손가락 a엄지손가락;
    손(){
        this.a엄지손가락 = new 엄지손가락();
    }
}

class 엄지손가락{
    int 길이 = 5;

}


*/

/*
class Main {
    public static void main(String[] args) {
        병사 a병사 = new 병사();
        a병사.이름 = "홍길동";

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 이병 입니다.

        a병사.진급();

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 일병 입니다.

        a병사.진급();

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 상병 입니다.
    }
}

class 병사 {
    String 이름;
    final String[] 계급표 = {"이병", "일병", "상병", "병장", "하사", "중사", "상사", "소위", "중위", "대위", "소령", "중령", "대령", "준장", "소장", "중장", "대장"};
    int 계급번호 = 0;
    String 계급 = 계급표[계급번호];

    void 자기소개() {
        System.out.println("안녕하세요. 저는" + this.이름 +" "+ this.계급 + " 입니다.");

    }

    void 진급() {
        if (this.계급.equals("대장")) {
            System.out.println("더이상 진급 할 수 없습니다.");
        } else {
            this.계급번호++;
            this.계급 = 계급표[계급번호];
        }
    }

}

*/

/*
class Main {
    public static void main(String[] args) {
        병사 a병사 = new 병사();
        a병사.이름 = "홍길동";

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 이병 입니다.
        a병사.공격();
        // 홍길동 이병이 공격합니다.(공격력 : 7)

        a병사.진급();

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 일병 입니다.
        a병사.공격();
        // 홍길동 일병이 공격합니다.(공격력 : 9)

        a병사.진급();

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 상병 입니다.
        a병사.공격();
        // 홍길동 상병이 공격합니다.(공격력 : 11)
    }
}

class 병사 {
    String 이름;

    final String[] 계급표 = {"이병", "일병", "상병", "병장", "하사", "중사", "상사", "소위", "중위", "대위", "소령", "중령", "대령", "준장", "소장", "중장", "대장"};
    int 계급번호 = 0;
    String 계급 = 계급표[계급번호];

    int 공격력 = 7;

    void 자기소개() {
        System.out.println(String.format("안녕하세요. 저는 %s %s 입니다.", this.이름, this.계급));
    }


    void 공격() {
        System.out.println(String.format("%s %s이(가) 공격합니다.(공격력 : %d)", this.이름, this.계급, this.공격력));
    }

    void 진급() {
        if (this.계급.equals("대장")) {
            System.out.println("더이상 진급 할 수 없습니다.");
        } else {
            this.계급번호++;
            this.계급 = 계급표[계급번호];
            this.공격력 = this.공격력+2;
        }
    }
}



*/



/*
class Main {
    public static void main(String[] args) {
        전사 a전사 = new 홍길동();
        a전사.a무기 = new 활();

        a전사.공격();
        // 출력 => 홍길동이(가) 활(으)로 공격합니다.

        a전사 = new 홍길순();

        a전사.공격();
        // 출력 => 홍길순이(가) 칼(으)로 공격합니다.

        a전사.a무기 = new 창();
        a전사.공격();
        // 출력 => 홍길순이(가) 창(으)로 공격합니다.
    }
}

class 전사 {

    무기 a무기 = new 칼();
    String 직업이름;

    void 공격() {
        a무기.공격(직업이름);
    }
}

class 홍길동 extends 전사 {
    홍길동(){
        this.직업이름 = "홍길동";
    }


}

class 홍길순 extends 전사 {
    홍길순(){
        this.직업이름 = "홍길순";
    }


}


class 무기 {

    String 무기이름 = "";

    void 공격(String 직업이름) {
        System.out.println(직업이름 + " 이(가) " + this.무기이름 + "으(로) 공격합니다.");
    }
}

class 활 extends 무기 {
    활() {
        무기이름 = "활";
    }


}

class 창 extends 무기 {
    창() {
        무기이름 = "창";
    }


}

class 칼 extends 무기 {
    칼() {
        무기이름 = "칼";
    }

}

*/


//class Main {
//    public static void main(String[] args) {
//        // 구현 시작
//        전사 a전사 = new 전사();
//        a전사.a무기 = new 칼();
//        a전사.공격();
//        a전사.a무기 = new 창();
//        a전사.공격();
//        a전사.a무기 = new 지팡이();
//        a전사.공격();
//        a전사.a무기 = new 전설의_지팡이();
//        a전사.공격();
//        // 구현 끝
//
//        // 출력
//    /*
//    칼(으)로 공격합니다.
//    데미지 : 78
//    창(으)로 공격합니다.
//    데미지 : 80
//    지팡이(으)로 공격합니다.
//    데미지 : 12
//    전설의_지팡이(으)로 공격합니다.
//    데미지 : 120
//    */
//    }
//}
//
///* 구현 시작 */
//class 전사 {
//    무기 a무기;
//
//    void 공격() {
//        a무기.공격();
//    }
//}
//
//class 무기 {
//    String 무기이름;
//    int 데미지;
//
//    void 공격() {
//        System.out.println(this.무기이름 + "(으)로 공격합니다.\n데미지 : " + this.데미지);
//    }
//}
//
//class 칼 extends 무기 {
//    칼() {
//        this.데미지 = 78;
//        this.무기이름 = "칼";
//    }
//}
//
//class 창 extends 무기 {
//    창() {
//        this.데미지 = 80;
//        this.무기이름 = "창";
//    }
//}
//
//class 지팡이 extends 무기 {
//    지팡이() {
//        this.데미지 = 12;
//        this.무기이름 = "지팡이";
//    }
//}
//
//class 전설의_지팡이 extends 무기 {
//    전설의_지팡이() {
//        this.데미지 = 120;
//        this.무기이름 = "전설의_지팡이";
//    }
//}
//
///* 구현 끝 */



/*
// 문제 : 구성(전사는 무기로 구성된다.)을 사용하여 중복을 제거해주세요.
// Main 클래스는 수정불가능

class Main {
    public static void main(String[] args) {
        전사타입A a전사타입A = new 전사타입A();
        a전사타입A.공격();

        전사타입B a전사타입B = new 전사타입B();
        a전사타입B.공격();

        전사타입C a전사타입C = new 전사타입C();
        a전사타입C.공격();

        전사타입D a전사타입D = new 전사타입D();
        a전사타입D.공격();
    }
}


class 전사 {
    무기 a무기;

    void 공격() {
        a무기.공격();
    }
}

class 전사타입A extends 전사 {
    전사타입A() {
        this.a무기 = new 칼();
    }
}

class 전사타입B extends 전사 {
    전사타입B() {
        this.a무기 = new 칼();
    }

}

class 전사타입C extends 전사 {
    전사타입C() {
        this.a무기 = new 활();
    }

}

class 전사타입D extends 전사 {
    전사타입D() {
        this.a무기 = new 활();
    }

}

class 무기 {
    String 무기이름;
    void 공격(){
        System.out.println(this.무기이름 + "로 공격.");
    }

}

class 활 extends 무기 {
    활() {
        this.무기이름 = "활";
    }
}

class 칼 extends 무기 {
    칼() {
        this.무기이름 = "칼";
    }
}

*/

/*
class Main {
    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ

        고무2오리 a고무2오리 = new 고무2오리();
        a고무2오리.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ
    }
}

class 오리 {
    스킬 날기스킬;
    void 날다() {
        날기스킬.발동();
    }
}

// 오리 => 부모 클래스
// 흰오리 => 자식 클래스
// 흰오리 extends 오리 => 흰오리가 오리의 능력을 물려 받는다.
// "`흰오리`는 `오리`이다." 라고 자바에게 알려준다.
// `A 는 B 이다.` 테스트에 통과하는 것만 상속이 가능하다.
// 클래스와 객체는 명사이다.
// 메서드는 동사이다.
class 흰오리 extends 오리 {
    흰오리(){
        this.날기스킬 = new 날기가능();
    }
}

class 청둥오리 extends 오리 {
    청둥오리(){
        this.날기스킬 = new 날기가능();
    }
}

class 고무오리 extends 오리 {
    // 메서드 재정의 라고 합니다.
    // 메서드 오버라이드 라고도 합니다.
    // 메서드 재정의 => 부모가 물려준 능력을 다시 구현한다.
     고무오리(){
            this.날기스킬 = new 날기불가();
        }

}

class 고무2오리 extends 오리 {
    고무2오리(){
        this.날기스킬 = new 날기불가();
    }

}

class 스킬{
    void 발동(){}
}
class 날기가능 extends 스킬{
    void 발동(){
        System.out.println("오리가 난다");
    }
}
class 날기불가 extends 스킬{
    void 발동(){
        System.out.println("오리가 못난다");
    }
}
*/

/*
class Main {
    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ

        고무2오리 a고무2오리 = new 고무2오리();
        a고무2오리.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ

        a고무2오리.a비행아이템 = new 로켓비행아이템();
        a고무2오리.날다();
        // 출력 : 로켓파워로 날아갑니다.
    }
}

abstract class 오리 {
    비행아이템 a비행아이템;

    오리() {
        a비행아이템 = new 날개비행아이템();
    }

    void 날다() {
        a비행아이템.작동();
    }
}

class 흰오리 extends 오리 {

}

class 청둥오리 extends 오리 {

}

class 고무오리 extends 오리 {
    고무오리() {
        a비행아이템 = new 못나는비행아이템();
    }
}

class 고무2오리 extends 오리 {
    고무2오리() {
        a비행아이템 = new 못나는비행아이템();
    }
}

abstract class 비행아이템 {
    abstract void 작동();
}

class 날개비행아이템 extends 비행아이템 {
    void 작동() {
        System.out.println("날개로 날아갑니다.");
    }
}

class 못나는비행아이템 extends 비행아이템 {
    void 작동() {
        System.out.println("저는 못 날아요 ㅠㅠ");
    }
}

class 로켓비행아이템 extends 비행아이템{
    void 작동(){
        System.out.println("로켓파워로 날아갑니다.");
    }
}
*/

/*
class Main {
    public static void main(String[] args) {
        new 사람();
        // 출력 : 사람이 태어났습니다.

        new 사람(10);
        // 출력 : 태어나서부터 10살인 사람이 태어났습니다.

        new 사람(20);
        // 출력 : 태어나서부터 20살인 사람이 태어났습니다.
    }
}

class 사람{
    사람(){
        System.out.println("사람이 태어났습니다.");
    }
    사람(int 나이){
        System.out.println("태어나서부터 "+ 나이+"살인 사람이 태어났습니다.");
    }
}

*/
/*
class Main {
    public static void main(String[] args) {
        계산기 a계산기 = new 계산기();

        System.out.println(a계산기.더하기(10, 20));
        // 출력 : 30

        System.out.println(a계산기.더하기(10, 20, 30));
        // 출력 : 60

        System.out.println(a계산기.더하기(10.5, 20, 30));
        // 출력 : 60.5
    }
}

class 계산기 {
    int 더하기(int a, int b) {
        return a+b;
    }
    int 더하기(int a, int b, int c) {
        return a+b+c;
    }
    double 더하기(double a, int b, int c) {
        return a+b+c;
    }



}

*/
/*

class Main {
    public static void main(String[] args) {
        new 사과();
        new 포도();
        new 사람("홍길동");
        new 사람();
    }
}

class 사과 {
    // 이렇게 생성자를 만들지 않은 클래스는 자바에서 자동으로 생성자를 하나 만들어준다.
    // 참고로 자동으로 만들어 질 때 `매개변수 없는 생성자`가 만들어집니다.
}

class 포도 {
    포도() {
        // 이렇게 생성자를 직접 만들면 자바는 더 이상 자동으로 생성자를 만들어주지 않습니다.
    }
}

class 사람{
    사람(){}
    사람(String 이름){}
}
*/
/*
class Main {
    public static void main(String[] args) {

        System.out.println("== 청둥오리객체 생성시작 ==");
        new 청둥오리();
        System.out.println("== 청둥오리객체 생성끝 ==");
//		 출력
//		== 청둥오리객체 생성시작 ==
//		생물이 생성되었습니다.
//		동물이 생성되었습니다.
//		오리가 생성되었습니다.
//		청둥오리 생성되었습니다.
//		== 청둥오리객체 생성끝 ==

    }
}

class 생물 {
    생물() {
        // 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.
        System.out.println("생물이 생성되었습니다.");
    }
}
class 동물 extends 생물 {
    동물() {
        // super(); // 부모 클래스의 생성자를 호출합니다. 생략가능합니다.
        // 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.

        System.out.println("동물이 생성되었습니다.");
    }

}
class 사람 extends 동물 {

    사람() {
        super(); // 부모 클래스의 생성자를 호출합니다.
        // 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.

        System.out.println("사람이 생성되었습니다.");
    }
}
class 오리 extends 동물{
    오리(){
        System.out.println("오리가 생성되었습니다.");
    }
}

class 청둥오리 extends 오리{
    청둥오리(){
        System.out.println("청둥오리가 생성되었습니다.");
    }
}*/
/*
class Main {
    public static void main(String[] args) {
        new 사람();
    }
}

class 동물 {
    동물(String 이름) {
        System.out.println("동물(String 이름) 실행됨!");
        System.out.println("이름 : " + 이름);
    }
    동물(String 이름, int 나이) {
        System.out.println("동물(String 이름, int 나이) 실행됨!");
        System.out.println("이름 : " + 이름);
        System.out.println("나이 : " + 나이);
    }
}

class 사람 extends 동물 {
    사람(){
        super("김호랑");

    }
}*/
/*
class Main {
    public static void main(String[] args) {
        new 사람();
        // 출력 : 사람이 초기화 됩니다.
    }
}

class 동물 {
    // 수정가능지역 시작
   void init(){}
    동물(){
        init();
    }
    // 수정가능지역 끝
}

class 사람 extends 동물 {
    void init() {
        System.out.println("사람이 초기화 됩니다.");
    }
}*/
/*
class Main {
    public static void main(String[] args) {
        사람 a사람 = new 홍길동();
        변호사 a변호사 = (변호사)a사람;
        치과의사 a치과의사 = (치과의사)a사람;
        성화봉송자 a성화봉송자 = (성화봉송자)a사람;
    }
}

class 사람 {

}
class 홍길동 extends 사람 implements 변호사,치과의사,성화봉송자{

}
interface 변호사{

}
interface 치과의사{


}
interface 성화봉송자{

}*/
/*
class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.id = 20;

        System.out.println("제 번호는 " + a사람.id + " 입니다.");
        // 출력 : 제 번호는 20 입니다.
    }
}

class 사람 {
    // private => 외부로 공개되지 않는다., 리모콘에 노출되지 않는다.
    private int id;

    void setId(int id) {
        this.id = id;
    }

}

*/

/*
class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];

        try{
           for (var i = 0; i<=10;i++){
               arr[i]=i;
               System.out.println(i);
           }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("에러발생");
        }
    }
}
*/
/*
class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];

        try {
            채우다(arr);


        //}
        //catch (ArrayIndexOutOfBoundsException e) {
        //    System.out.println("에러발생");
        } catch (Exception e) {
            System.out.println("에러2발생");
        }
    }


    static void 채우다(int[] arr) throws Exception{
        for (var i = 0; i <= 10; i++) {
            arr[i] = i;
            System.out.println(i);
        }
    }

}

*/
/*
class Main {
    public static void main(String[] args) {
        int rs = 0;


    }
}
class 계산기 {
    static int 나누다(int a, int b) {
        int rs = 0;

        try {
            rs = a / b;
        }
        catch ( ArithmeticException e ) {
            rs = 0;
        }

        return rs;
    }
}
*/


import java.util.*;
/*
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("이름을 입력하세요");
        String name = scan.next();
        System.out.println("나이를 입력하세요");
        int age = scan.nextInt();
        System.out.println("키를 입력하세요");
        int height = scan.nextInt();


        System.out.println("이름은 "+name+" 입니다.");
        System.out.println(age+"살 입니다.");
        System.out.println("키는 "+ height+ "cm 입니다.");
    }
}
*/
/*
class Main {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'a';

        System.out.println(c1 == c2); // true

        // String 은 char의 순서있는 조합이다.
        String s1 = new String("하하");
        String s2 = "하하";
        String s3 = new String("하하");

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}


*/

/*
class Main {
    public static void main(String[] args) {
        System.out.println("별 100개 짜리 문장을 만드는 끔찍한 방법");
        String s = "";

        for ( int i = 0; i < 100; i++ ) {
            s += "*";
        }

        System.out.println(s); // 이 문장을 만들기 위해 중간에 사용하지도 않을 문장 100개가 만들어집니다.

        System.out.println("별 100개 짜리 문장을 만드는 좋은 방법");
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < 100; i++ ) {
            sb.append("*");
        }

        s = sb.toString();
        System.out.println(s);

        System.out.println("문장은 공공재 입니다. 즉 공유자원이기 때문에, 새로 만들 순 있어도, 기존의 것을 변경하면 안됩니다.");

        String s1 = "안녕";
        String s2 = "안녕";
        String s3 = "안녕";
        // 현재 s1, s2, s3는 같은 녀석을 가리킵니다.

        // 아래 코드는 s3가 자신이 가리키고 있는 객체를 변경한게 아니라. 새 문장을 만들고 그것을 바라봅니다.(다시 말해 새 객체의 리모콘을 가지게 됩니다.)
        s3 += "하세요.";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        int aaaa = 6;
        int bbbb = 3;

        System.out.println(aaaa*bbbb);
    }
}


*/

/*
// Object 클래스와 toString
class Main {
    public static void main(String[] args) {
        사람 a사람1 = new 사람("홍길동", 22,187);
        사람 a사람2 = new 사람("홍길순", 23,168);
        System.out.println(a사람1);
        System.out.println(a사람2);
    }
}
class 사람 extends Object {
    String 이름;
    int 나이;

    int 키;
    사람(String 이름, int 나이,int 키) {
        this.이름 = 이름;
        this.나이 = 나이;
        this.키 = 키;
    }

    @Override
    public String toString() {
        return "사람[이름=" + 이름 + ",나이=" + 나이 + ",키=" +키 +"]";
    }
}
*/

/*
class Main {
    public static void main(String[] args) {
        저장소.저장(10);
        저장소.저장("안녕");
        저장소.저장(new 사람());
        저장소.저장(new 사과());
        저장소.저장(5.5);
        저장소.저장(false);
        저장소.저장('a');

        // 정수 계열
        byte b = 0; // 1바이트
        char c = 1; // 2바이트
        short s = 2; // 2바이트
        int i = 3; // 4바이트
        long l = 4; // 8바이트

        // 실수 계열
        // 4.1f => float 형 실수를 의미
        float f = 3.14f; // 4바이트
        // 3.141592 => double 형 실수를 의미
        double d = 3.141592; // 8 바이트

        // 논리 계열
        boolean bl = false; // 1/8 바이트, 1비트

        저장소.저장(b);
        저장소.저장(s);
        저장소.저장(c);
        저장소.저장(i);
        저장소.저장(l);
        저장소.저장(f);
        저장소.저장(d);
        저장소.저장(bl);
    }
}

class 저장소{


    public static void 저장(Object a) {
    }

}

class 사람{

}
class 사과{

}

*/
/*
class Main {
    public static void main(String[] args) {
        String str = "axslekjxxlkzjxkljxxXXXssjxxXXxxX";

        int xCount = 0;


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
                xCount++;
            }
        }


        System.out.println("xCount : " + xCount);
    }
}

*/
/*
class Main {
    public static void main(String[] args) {
        자동차 a자동차 = new 자동차();


        a자동차.달리다();
    }
}

class 자동차 {
     void 달리다() {
        System.out.println("자동차가 달립니다.");
    }
}

*/
/*
class Main {
    public static void main(String[] args) {
        수학 수학 = new 수학();

        System.out.println(수학.PI);
        // 출력 : 3.141592
    }
}


class 수학{
    double PI = 3.141592;
}

*/
/*
class Main {
    public static void main(String[] args) {

        수학 수학 = new 수학();

        System.out.println(수학.더하기(10, 20));
        // 출력 : 30

        System.out.println(수학.더하기(20, 20, 50));
        // 출력 : 90
    }
}

class 수학 {
    int 더하기(int a, int b) {
        return a + b;
    }

    int 더하기(int a, int b, int c) {
        return a + b + c;
    }
}
*/

/*
class Main {
    public static void main(String[] args) {
        // 오직 객체만으로 해결하면 번거롭다.
        System.out.println(수학.PI);

        System.out.println(수학.더하기(10, 20));
        // 출력 : 30
    }
}

class 수학 {
    // static 을 붙이면 해당 변수는 설계도에만 존재하게 됩니다.
    static double PI = 3.141592;

    static int 더하기(int a, int b) {
        return a + b;
    }
}
*/
/*
class Main {
    public static void main(String[] args) {
        사람 a사람1 = new 사람();
        a사람1.이름 = "홍길동";
        a사람1.나이 = 22;

        a사람1.자기소개();
        // 출력 : 저는 22살 홍길동 입니다.

        사람 a사람2 = new 사람();
        a사람2.이름 = "홍길순";
        a사람2.나이 = 25;

        a사람2.자기소개();
        // 출력 : 저는 25살 홍길순 입니다.

        a사람1.자기소개();
        // 출력 : 저는 22살 홍길동 입니다.
    }
}

class 사람 {
    int 나이;
    String 이름;

     void 자기소개() {
        System.out.println("저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }
}

*/
/*
class Main {
    public static void main(String[] args) {
        저장소<Integer> a저장소1 = new 저장소<>();

        a저장소1.setData(30);
        int a = a저장소1.getData();

        System.out.println(a);

        저장소<Double> a저장소2 = new 저장소<>();

        a저장소2.setData(5.5);
        double b = a저장소2.getData();

        System.out.println(b);


        저장소<사과> a저장소3 = new 저장소<>();

        a저장소3.setData(new 사과());
        사과 c = a저장소3.getData();

        System.out.println(c);
    }
}

class 저장소<T> {
    T data;

    T getData() {
        return (T)data;
    }

    void setData(T inputedData) {
        this.data = inputedData;
    }
}

class 사과{

}
*/
/*
class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("숫자 입력 : ");
//        int 숫자 = sc.nextInt();
//        System.out.println(숫자);
//
//        sc.close();
        int a = 0;
        while (a == 0) {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.print("숫자 입력 : ");
                int 숫자 = sc.nextInt();
                if (숫자 >= 0) {

                    System.out.println(숫자);
                    a++;
                } else {
                    System.out.println("양수만 입력해주세요");
                }
            } catch (Exception e) {
                System.out.println("숫자만 입력해주세요");
            }


        }


    }
}

*/
import java.util.Scanner;
/*
class Main {
    public static void main(String[] args) {
        List<Integer> arrlist = new ArrayList<>();
        for (int i = 10; i <= 100; i++) {
            if (i % 10 == 0) {
                arrlist.add(i);

            }
        }
        int answer = 0;
        for (int i = 0; i < arrlist.size(); i++) {
            answer = answer + arrlist.get(i);
        }

        System.out.println(answer);
    }
}

*/

/*
class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        List<Integer> arrlist = new ArrayList<>();

        while (true) {
            System.out.printf("숫자를 입력해주세요(-1 : 종료) : ");
            int num = sc.nextInt();

            if (num == -1) {
                System.out.println("입력을 종료합니다.");
                break;
            }
            int i = 0;
            arrlist.add(num);
        }
        Collections.sort(arrlist);
        StringBuilder sb = new StringBuilder();

        for (int number : arrlist) {
            if (sb.isEmpty() == false) {
                sb.append(", ");
            }

            sb.append(number);
        }

        System.out.printf("입력한 숫자(오름차순) : %s\n", sb);
        System.out.println("프로그램을 종료합니다.");

        sc.close();

    }
}

*/
/*
class Main{
    public static void main(String[] args) {
        Map<String, Object> p1 = new HashMap<>();

        p1.put("이름","홍길동");
        p1.put("나이","28");
        p1.put("키","183");

        Map<String, Object> p2 = new HashMap<>();

        p1.put("이름","홍길순");
        p1.put("나이","27");
        p1.put("키","153");

    }
}

*/


class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        new App(sc1).run();
    }

}
