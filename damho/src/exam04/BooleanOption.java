package exam04;

import java.util.Arrays;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class BooleanOption {
    public static void main(String[] args) {
        Options options = new Options();
        options.addOption("a", false, "-a : a 옵션이 추가되어 있습니다.");
        options.addOption("b", false, "-b : b 옵션이 추가되어 있습니다.");
        options.addOption("v", "version", false, "print the version");

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);
            if (cmd.hasOption("a")) {
                System.out.println("-a : a 옵션이 추가되어 있습니다.");
            }
            if (cmd.hasOption("b")) {
                System.out.println("-b : b 옵션이 추가되어 있습니다.");
            }
            if (cmd.hasOption("v")) {
                System.out.println("-v : print the version");
            }
        } catch (ParseException ignore) {
            System.err.println("인수가 잘못되었습니다.");
        }
    }
}
