package sorular_1;

public class RakamTopla_While {
    public static int rakamtopla_while(int sayi) {
        int toplam = 0;
        while (sayi >= 1) {
            toplam += sayi % 10;
            sayi = sayi / 10;
        }
        return toplam;
    }

    public static void main(String[] args) {
        System.out.println(rakamtopla_while(1234567));
    }
}
