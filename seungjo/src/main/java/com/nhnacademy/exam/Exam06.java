package com.nhnacademy.exam;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Exam06 {
    CommandLineParser parser;
    Options options;

    public Exam06() {
        parser = new DefaultParser();
        options = new Options();

        options.addOption("a", "all", false, "do not hide entries starting with .");
        options.addOption("A", "almost-all", false, "do not list implied . and ..");
        options.addOption("b", "escape", false, "print octal escapes for non-graphic characters");

        Option blockSize = Option.builder()
                .argName(null)
                .longOpt("block-size")
                .hasArg()
                .valueSeparator('=')
                .desc("use SIZE-byte blocks")
                .build();
        options.addOption(blockSize);

        options.addOption("B", "ignore-backups", false, "do not list implied entries ending with ~");

        options.addOption("c", null, false, "with -lt: sort by, and show, ctime (time of last \n" +
                "modification of file status information)\n" +
                "with -l: show ctime and sort by name\n" +
                "otherwise: sort by ctime\n" +
                "list entries by columns");

        options.addOption("C", null, false, "list entries by columns");
    }

    public void parse(String[] args) {

        /*  출력 결과
            -c
            -a
            -SIZE : 10
         */

        try {
            CommandLine line = parser.parse(options, args);

            for (Option option : line.getOptions()) {
                String opt = option.getOpt();
                String longOpt = option.getLongOpt();

                if (options.hasOption(opt) || options.hasLongOption(longOpt)) {
                    if (opt == null) {
                        opt = longOpt.split("-")[1].toUpperCase();
                        System.out.println("-" + opt + " : " + option.getValue());
                    } else {
                        System.out.println("-" + opt);
                    }
                }
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String[] testArgs = new String[] {"-c", "--all", "--block-size=10"};
        Exam06 exam = new Exam06();

        exam.parse(testArgs);

    }
}
