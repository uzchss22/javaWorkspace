package test_1;

public class _01_ {
    public static void main(String[] args) {
        String name = "choi hyeok";
        int hour = 3;


        System.out.println(name + "\tmsg_1" + hour);
        System.out.println(name + " msg_2" + hour);

        double score = 90.5;
        char grade = 'A';
        name = "bakdi";
        System.out.println(name + score + grade);


        boolean pass = true;
        System.out.println("?" + pass + "\n");

        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);


        long l = 1_000_000_000_000L;
        System.out.println(l);
    }
}