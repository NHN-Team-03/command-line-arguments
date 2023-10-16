package com.nhnacademy.exam;

public class Exam02 {
    public static void main(String[] args) {
        int firstArg;

        if (args.length > 0) {
            try {
                firstArg = Integer.parseInt(args[0]);
                System.out.println(firstArg);
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }


    }

}
