package exam.exam05;

import com.beust.jcommander.JCommander;
//tag::Exam05[]
public class Exam05 {
    public static void main(String[] args) {
        Options options = new Options();

        JCommander commander = JCommander.newBuilder()
                .addObject(options)
                .build();

        commander.parse(args);

        if (options.help) {
            commander.usage();
        }

        System.out.println("log : " + options.verbose);
        System.out.println("groups : " + options.groups);
        System.out.println("debug : " + options.debug);

    }
}
//end::Exam05[]