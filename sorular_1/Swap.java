package sorular_1;

public class Swap {
    public static void main(String[] args) {
        int sayi55s=55;
        int sayi99s=99;

        sayi55s=sayi99s-sayi55s;
        sayi99s=sayi99s-sayi55s;
        sayi55s=sayi99s+sayi55s;

        System.out.println("sayi55s = " + sayi55s);//sayi55s = 99
        System.out.println("sayi99s = " + sayi99s);//sayi99s = 55
    }
}
