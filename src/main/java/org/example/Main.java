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


class Main {
    public static void main(String[] args) {
        전사 a전사1 = new 전사();

        a전사1.a왼손무기 = new 칼();
        a전사1.공격();
        // 출력 => 전사가 왼손으로 칼(을)를 사용합니다.

        전사 a전사2 = new 전사();
        a전사2.a왼손무기 = new 창();
        a전사2.a오른손무기 = new 도끼();
        a전사2.공격();
        // 출력 => 전사가 왼손으로 창(을)를 사용합니다.
        // 출력 => 전사가 오른손으로 도끼(을)를 사용합니다.
    }
}

class 전사
