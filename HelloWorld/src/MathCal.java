public class MathCal {
    public static void main(String[] args) {
        System.out.println("5+6");
        System.out.println(5 + 6);
        //注意下列两者的差别
        System.out.println(5 / 8);
        System.out.println(5 / 8.0);
        System.out.println(Math.pow(2, 8 - 1));
        System.out.println(1 / 3.0);
        System.out.println(10 % 3);
        System.out.println(10 % -3);
        System.out.println(-10 % 3);
        System.out.println(-10 % -3);
        System.out.println(true);
        System.out.println(0xF);
        System.out.println(~5);
        System.out.println(-0b111);
        System.out.println(-0b111 >> 2);
        System.out.println(0b111);
        System.out.println((char) 100);
        System.out.println("\u0063");
        int a = 5;
        System.out.println(a-- - a);
        System.out.println(0);
        for (int i = 0; i < 26; i++) {
            System.out.println((char) ('a' + i));
        }
        int num = 'a';
        System.out.println((char) num++);
        System.out.println(num);
    }
}
