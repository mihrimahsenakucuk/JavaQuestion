import java.util.Arrays;
import java.util.Random;

public class RandomArray {
        public static void main(String[] args) {

            Random r = new Random();

            int[] eleman = new int[500];
            for (int i = 0; i < eleman.length; i++) {
                eleman[i] = r.nextInt();
            }
            System.out.println(Arrays.toString(eleman));

            double[] arrMinMax = new double[eleman.length];

            double max = eleman[0];
            double min = eleman[0];
            for (int i = 0; i < eleman.length; i++) {
                if (eleman[i] < min) {
                    min = eleman[i];
                }
                if (eleman[i] > max) {
                    max = eleman[i];
                }
            }
            System.out.println("Max : " + max);
            System.out.println("Min : " + min);

            double sonuc;
            for (int i = 0; i < eleman.length; i++) {
                sonuc = (eleman[i] - min) / (max - min);
                arrMinMax[i] = sonuc;
            }
            for (int i = 0; i < eleman.length; i++) {
                System.out.println(eleman[i] + " " + eleman[i]);}}


        }

