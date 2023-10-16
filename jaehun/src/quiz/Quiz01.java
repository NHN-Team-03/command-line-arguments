package quiz;
//tag::Quiz01[]
public class Quiz01 {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
            if(args[i].charAt(0) == '-') {
                if(args[i+1].charAt(0) == '-') {
                    System.out.println(args[i]);
                } else {
                    System.out.print(args[i] + " ");
                }
            } else {
                System.out.println(args[i]);
            }
        }
    }
}
//end::Quiz01[]
