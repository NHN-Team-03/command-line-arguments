package com.nhnacademy.cli;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public class ArgumentOption {
    public static void main(String[] args) {

        // create options object
        Options options = new Options();

        // add logfile Option
        Option logfile = Option.builder("logfile")
                                .argName("file")
                                .hasArg()
                                .desc("use given file for log")
                                .build();

        options.addOption(logfile);
    }

}
