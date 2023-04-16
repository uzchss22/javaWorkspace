package test_1;

public class _01_ {
    public static void main(String[] args) {
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);


        int i = Integer.parseInt("93");
        System.out.println(i);
    }
}