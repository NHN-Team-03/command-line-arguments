package com.nhnacademy.cli;

import org.apache.commons.cli.Options;

public class BooleanOption {
    public static void main(String[] args) {
        // create Options object
        Options options = new Options();

        // add v option
        options.addOption("v", "version", false, "print the version");
    }
}
