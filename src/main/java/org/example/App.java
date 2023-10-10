package org.example;

import java.util.*;

public class App {
    private final Scanner sc1;

    public App(Scanner sc1) {
        this.sc1 = sc1;
    }

    public void run() {
        System.out.println(" == 명언 앱 == ");
        int 명언갯수 = 0;
        List<명언목록> 명언목록1 = new ArrayList<>();

        while (true) {

            System.out.println(">>명령어 : 종료 , 등록 , 목록");
            System.out.print("명령) ");
            Object 명령어 = sc1.next().trim(); // trim은 공백 삭제

            if (명령어.equals("종료")) {
                System.out.println("앱을 종료합니다..");
                break;
            }

            if (명령어.equals("등록")) {

                System.out.print("명언 : ");
                String 등록명언명령어 = sc1.next();
                System.out.print("작가 : ");
                String 등록작가명령어 = sc1.next();
                명언갯수++;
                System.out.println(명언갯수 + "번 명언이 등록되었습니다.");
                명언목록 명언목록입력 = new 명언목록(명언갯수, 등록작가명령어, 등록명언명령어);
                명언목록1.add(명언목록입력);
            }
            if (명령어.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("------------------------------");
                for (int i = 명언갯수 - 1; i >= 0; i--) {
                    명언목록 명언사용 = 명언목록1.get(i);
                    System.out.printf("%d / %s / %s \n", 명언사용.get번호(), 명언사용.get작가(), 명언사용.get명언());
                }
            }
        }
    }
}
