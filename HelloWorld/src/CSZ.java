public class CSZ {
    public static void main(String[] args) {
        double random;
        double min=0.0;
        double max=10.0;
        random = (int) (min+Math.random()*(max-min));
        System.out.println(random);

    }
}
