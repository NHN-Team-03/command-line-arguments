package com.nhnacademy.yongjun;

import org.apache.commons.cli.*;

public class Exam03 {
    public static void main(String[] args) {
        Options options = new Options();

        options.addOption("a",null,false,"Option a");
        options.addOption("b", null, false, "Option b");
        options.addOption("v", "version", false, "Version");


        try {
            CommandLineParser parser = new DefaultParser();
            CommandLine cmd = parser.parse(options,args);

            if(cmd.hasOption("a")){
                System.out.println("-a : a 옵션이 추가됨");
            }

            if(cmd.hasOption("b")){
                System.out.println("-b : b 옵션이 추가됨");
            }

            if(cmd.hasOption("v")){
                System.out.println("-b : print the version");
            }




        } catch (ParseException e) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp(Exam03.class.getSimpleName(), options);

//            System.err.println("인수가 잘못됨");f
        }


    }
}
