package sorular_1;

public class ArtikYil {
    /*Soru ) Interview Question

                Kullanicidan artik yil olup olmadigini kontrol
                etmek icin yil girmesini isteyin.

                Kural 1: 4 ile bolunemeyen yillar artik yil
                degildir

                Kural 2: 4 ile bolunup 100 ile bolunemeyen
                yillar artik yildir

                Kural 3: 4’un kati olmasina ragmen 100 ile
                bolunebilen yillardan sadece
                400’un kati olan yillar artik yildir

                     */
    public static void main(String[] args) {
        System.out.println("Artik yil mi : "+artikYilMi(2020));
    }
    public static boolean artikYilMi(int artikyil) {

        if (artikyil % 4 == 0) {

            if (artikyil % 100 == 0) {

                if (artikyil % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;

        } else {
            System.out.println("artık yıl degil");
            return false;
        }

    }
}