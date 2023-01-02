package sorular_1;

import java.util.ArrayList;
import java.util.List;

public class CumledeKelimeKacDefaVar {
    static String str = "Merhaba dunya33";
    static String aranan = "a";

    public static void main(String[] args) {


        List<Integer> listem = new ArrayList<>();
        for (int i = 0; i < str.lastIndexOf(aranan); i++) {
            listem.add(str.indexOf(aranan, i));
            i = str.indexOf(aranan, i);
        }
        System.out.println("listem = " + listem);
    }
}
