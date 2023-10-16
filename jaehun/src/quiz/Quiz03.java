package quiz;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Quiz03 {
    CommandLineParser parser;
    Options options;

    public Quiz03() {
        parser = new DefaultParser();
        options = new Options();

        options.addOption("a", "all", false, "do not hide entries starting with");
        options.addOption("A", "almost-all", false, "do not list implied . and ..");
        options.addOption("b", "escape", false, "print octal escapes for non-graphic characters");
        options.addOption(Option.builder("SIZE").longOpt("block-size").desc("use SIZE-byte blocks").hasArg().build());
//        options.addOption(null, "block-size=SIZE", false, "use SIZE-byte blocks");
        options.addOption("B", "ignore-backups", false, "do not list implied entries ending with ~");
        options.addOption("c", null, false, "with -lt: sort by, and show, ctime (time of last\n" +
                "modification of file status information)\n" +
                "with -l: show ctime and sort by name\n" +
                "otherwise: sort by ctime");
        options.addOption("C", null, false, "list entries by columns");
    }

    public void parse(String[] args) {
        try {
            CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("a")) {
                System.out.println("-a");
            }

            if (cmd.hasOption("A")) {
                System.out.println("-A");
            }

            if (cmd.hasOption("b")) {
                System.out.println("-b");
            }

            if (cmd.hasOption("B")) {
                System.out.println("-B");
            }

            if (cmd.hasOption("c")) {
                System.out.println("-c");
            }

            if (cmd.hasOption("C")) {
                System.out.println("-C");
            }

            if (cmd.hasOption("block-size")) {
                System.out.println("-SIZE : " + cmd.getOptionValue("block-size"));
            }

        } catch (ParseException ignore) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("ls", options);
        }
    }

    public static void main(String[] args) {
        Quiz03 test = new Quiz03();

        test.parse(args);
    }
}
