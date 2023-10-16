package optionstest;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class OptionTest {
    public static void main(String[] args) throws ParseException {
        Options options = new Options();

        Option logfile = Option.builder("logfile")
                .argName("file")
                .hasArg()
                .desc("use given file for long")
                .build();
        options.addOption(logfile);
        options.addOption("c", true, "국가 코드");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);
        if (cmd.hasOption("t")) {
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("포맷 지정 후: " + dateFormat.format(date));
            System.out.println();
        }
    }
}
