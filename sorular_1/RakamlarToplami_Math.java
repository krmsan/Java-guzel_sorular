package sorular_1;

public class RakamlarToplami_Math {
    public static void main(String[] args) {
        int sayi = 1234567;
        int toplam = rakamlariTopla(sayi);
        System.out.println(toplam);
    }

    private static int rakamlariTopla(int sayi) {
        int top = 0;
        String sayistr=""+sayi;
        for (int j = 0; j <sayistr.length() ; j++) {
            top+=sayi%10;
            sayi=sayi/10;
        }
        return top;
    }

}
/*
//=========================
 int top = 0;
 String sayistr=""+sayi;
 int[]sayilar=new int[sayistr.length()];
        for (int i = 0; i < sayistr.length(); i++) {
            for (int j = 0; j <sayistr.length() ; j++) {
                sayilar[j]+=sayi%10;
                sayi=sayi/10;
            }
            top+=sayilar[i];
        }
        return top;
  //========================
 */