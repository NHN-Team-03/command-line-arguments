package exam01;

//tag::Echo[]
public class Echo {
    public static void main (String[] args) {
        for (String s: args) {
            System.out.println(s);
        }
    }
}
//end::Echo[]