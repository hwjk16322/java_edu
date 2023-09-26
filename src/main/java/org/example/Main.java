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


public class Car {
    String name;
    int number;

    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Car() {
        // 자기 자신의 생성자를 호출
        this("이름없음", 0);
    }

    public Car(String name) {
        this(name, 0);
    }

}