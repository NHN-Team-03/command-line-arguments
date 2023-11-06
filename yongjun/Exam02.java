package com.nhnacademy.yongjun;

public class Exam02 {
    public static void main(String[] args) {
        for (String s : args) {
            try {
                int num = Integer.parseInt(s);
                System.out.println(num);
            } catch (NumberFormatException e) {
                System.out.println(s);
            }

        }
    }
}
