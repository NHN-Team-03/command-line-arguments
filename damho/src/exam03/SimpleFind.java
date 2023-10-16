package exam03;

public class SimpleFind {
    public static void main(String[] args) {
        for(int i = 0 ; i < args.length ; i++) {
            if (args[i].charAt(0) == '-') {
                ;
            } else {
                System.out.println(args[i]);
            }
        }
    }
}