package exam;

//tag::Exam02[]
public class Exam02 {
    public static void main(String[] args) {
        for (String arg : args) {
            try {
                int value = Integer.parseInt(arg);
                System.out.println("Integer : " + value);
            } catch (NumberFormatException e) {
                System.out.println("String : " + arg);
            }
        }
    }
}
//end::Exam02[]
