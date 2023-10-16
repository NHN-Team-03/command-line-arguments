package exam02;

//tag::Exam02[]

public class Exam02 {
    public static void main(String[] args) {
        int firstArg;
        if (args.length > 0) {
            try {
                firstArg = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
    }
}
//end::Exam02[]
