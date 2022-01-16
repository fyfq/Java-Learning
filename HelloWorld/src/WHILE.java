public class WHILE {
    public static void main(String[] args) {
        int count = 0;
        int n = 100;
        int divdend = 100;
        int divsior = 89;

        while (count < n) {
            if (divdend % divsior == 0) {
                System.out.println(divdend + "除以" + divsior + "=" + divdend / divsior);
                count++;
            }
            divdend++;

        }
        n = 999999999;
        while(true) {
            System.out.println(n);
            n++;
        }
    }
}
