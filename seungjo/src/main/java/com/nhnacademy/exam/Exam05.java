package com.nhnacademy.exam;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Exam05 {
    public static void main(String[] args) {
        Options options = new Options();

        options.addOption("A", null, true, null);
        options.addOption("r", "remove", true, null);

        CommandLineParser parser = new DefaultParser();

        try {
            CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("A")) {
                System.out.println(cmd.getOptionValue("A") + "을 추가합니다.");
            }

            if (cmd.hasOption("r")) {
                System.out.println(cmd.getOptionValue("r") + "을 삭제합니다.");
            }

        } catch (ParseException ignore) {
            System.err.println("인수가 잘못되었습니다.");
        }
    }
}
