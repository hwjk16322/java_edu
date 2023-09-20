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
