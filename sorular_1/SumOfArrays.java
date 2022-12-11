package sorular_1;
import java.util.Arrays;
public class SumOfArrays {
    public static void main(String[] args) {

        //123 ile 789 u toplayın

        int[] sayi1 = new int[3];
        int[] sayi2 = {1, 2, 3};
        sayi1[0] = 7;
        sayi1[1] = 8;
        sayi1[2] = 9;

        //iki arrray i toplayalım
        int[] toplamlari = new int[3];

        int elde=0;
        for (int i = 2; i >= 0; i--) {

            if ((toplamlari[i] + sayi1[i] + sayi2[i]) >= 10) {

                toplamlari[i] += (sayi1[i] + sayi2[i]) % 10;//8
                elde++;
                if (i!=0){toplamlari[i-1]=elde;}else toplamlari[i]=toplamlari[i]+10;
            } else {
                toplamlari[i] += sayi1[i] + sayi2[i];
            }
            elde=0;
        }
        int topsayi=toplamlari[0]*100+toplamlari[1]*10+toplamlari[2];
        System.out.println(topsayi);
        System.out.println(Arrays.toString(toplamlari));

    }

}
