package sorular_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EskenarMi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> klist = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            System.out.println("Lütfen "+i+". kenar uzunlugunu giriniz : ");
            klist.add(scan.nextInt());
        }
        String sonuc = klist.get(0) == klist.get(1) && klist.get(1) == klist.get(2) ? "Eskenardir" : "Degildir";
        System.out.println(sonuc);
    }
}
