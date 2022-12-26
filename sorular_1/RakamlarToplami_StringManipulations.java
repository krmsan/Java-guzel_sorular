package sorular_1;

public class RakamlarToplami_StringManipulations {
    public static void main(String[] args) {
        int sayi = 1234567;
        int toplam = rakamlariTopla(sayi);

        System.out.println(toplam);
    }

    public static int rakamlariTopla(int sayi) {
        String str = "" + sayi;
        String[] arr = new String[str.length()];
        arr = str.split("");
        int toparr = 0;
        int top1 = 0;
        int top = 0;
        for (int i = 0; i < str.length(); i++) {

            /*1.yol */
            toparr += Integer.valueOf(arr[i]);

            /*2.yol */
            top1 += Integer.valueOf(str.substring(i, i + 1));

            /*3.yol */
            top += Integer.valueOf("" + str.charAt(i));
        }
        return top;
    }
}

