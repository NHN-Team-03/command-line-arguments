package exam06;

import java.util.List;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class CLITest {
    CommandLineParser parser;
    Options options;

    public CLITest() {
        // create the command line parser
        parser = new DefaultParser();
        options = new Options();

        // create the Options
        options.addOption("a", "all", false, "do not hide entries starting with .");
        options.addOption("A", "almost-all", false, "do not list implied . and ..");
        options.addOption("b", "escape", false, "print octal escapes for non-graphic characters");
        options.addOption(Option.builder("SIZE").longOpt("block-size")
                .desc("use SIZE-byte blocks")
                .hasArg()
                .build());
        options.addOption("B", "ignore-backups", false, "do not list implied entries ending with ~");
        options.addOption("c", false, "with -lt: sort by, and show, ctime (time of last\n" +
                "modification of file status information)\n" +
                "with -l: show ctime and sort by name\n" +
                "otherwise: sort by ctime");
        options.addOption("C", false, "entries by columns");
    }

    public void parse(String[] args) {
        try {
            CommandLine cmd = parser.parse(options, args);
            List<Option> cmdOptionList = List.of(cmd.getOptions());
            for (Option option : cmdOptionList) {
                System.out.print("-" + option.getOpt());
                if (option.hasArg()) {
                    System.out.print(" : " + option.getValue());
                }
                System.out.println();
            }
        } catch (ParseException ignore) {
            System.err.println("잘못된 인수 발견");
        }
    }

    public void help() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("ant", options);
    }

    public static void main(String[] args) {
        String[] testArgs = new String[] {"-c", "--all", "--block-size=10"};
        CLITest cli = new CLITest();
        cli.help();

        cli.parse(testArgs);
    }
}