public class HarmonikArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double toplam = 0;

        for (int n : numbers) {
            toplam = toplam + (1.0 / n);
        }

        System.out.println("Değerlerin Harmonik Ortalaması : " + numbers.length / toplam );

    }
}
