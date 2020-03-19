import static java.lang.Math.pow;

/**
 * Klasa zawiera metody na zmiane z systemu ósemkowego na inne(binarny, dziesietny, szesnastkowy)
 */
public class Octal {
    /**
     * Metoda zmienia liczbę ósemkową na binarną
     * @param liczba to liczba w systemie ósemkowym
     * @return liczba w systemie dwójkowym
     */
    public int binarny(int liczba){
        int[] cyfra = {0, 0, 0};
        double[] prawidlowa = {0, 0, 0};
        cyfra[0] = liczba/100;
        cyfra[1] = liczba/10 - cyfra[0]*10;
        cyfra[2] = liczba - cyfra[0]*100 -cyfra[1]*10;
        int wykladnik = 6;
        for(int i = 0; i < 3; i++) {
            double potega = pow(10, wykladnik);
            switch (cyfra[i]) {
                case 0:
                    prawidlowa[i] = 0 * potega;
                    break;
                case 1:
                    prawidlowa[i] = 1 * potega;
                    break;
                case 2:
                    prawidlowa[i] = 10 * potega;
                    break;
                case 3:
                    prawidlowa[i] = 11 * potega;
                    break;
                case 4:
                    prawidlowa[i] = 100 * potega;
                    break;
                case 5:
                    prawidlowa[i] = 101 * potega;
                    break;
                case 6:
                    prawidlowa[i] = 110 * potega;
                    break;
                case 7:
                    prawidlowa[i] = 111 * potega;
                    break;
            }
            wykladnik -= 3;
        }
        int wynik = (int) (prawidlowa[0] + prawidlowa[1] +prawidlowa[2]);
        return wynik;
    }
    /**
     * Metoda zmienia liczbę ósemkową na dziesiętną
     * @param liczba to liczba w systemie ósemkowym
     * @return liczba w systemie dziesiętnym
     */
    public int dziesietny(int liczba){
        int[] cyfra = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length;
        length = (int) (Math.log10(liczba) + 1); // ilosc cyfr w liczbie
        int potegiDziesiatki = (int) pow(10, 8);

        for (int i = 0; i < 9; i++){
            int x = i;
            cyfra[i] = liczba/potegiDziesiatki;
            int wielokrotnosciDziesiatki = 10;
            int z = 1;
            while (x != 0) {
                cyfra[i] -= cyfra[i - z] * wielokrotnosciDziesiatki;
                wielokrotnosciDziesiatki *= 10;
                x--;
                z++;
            }
            potegiDziesiatki /= 10;
        }
        int wynik = 0;
        int potega = 8;
        for(int i = 0; i < 9; i++){
            wynik += cyfra[i]*pow(8, potega);   //wystarczylo przekopiowac kod z binarnego i zamiast 2 dac 8 XD
            potega--;
        }
        return wynik;
    }

    /**
     * Metoda zmienia liczbę ósemkową na szesnastkową (łańcuch znaków)
     * @param liczba to liczba w systemie ósemkowym
     * @return liczba w systemie szesnastkowym (łańcych znaków)
     */
    public String szesnastkowy(int liczba){
        int[] cyfra = {0, 0, 0};
        double[] prawidlowa = {0, 0, 0};
        cyfra[0] = liczba/100;
        cyfra[1] = liczba/10 - cyfra[0]*10;
        cyfra[2] = liczba - cyfra[0]*100 -cyfra[1]*10;
        int wykladnik = 6;
        for(int i = 0; i < 3; i++) {
            double potega = pow(10, wykladnik);
            switch (cyfra[i]) {
                case 0:
                    prawidlowa[i] = 0 * potega;
                    break;
                case 1:
                    prawidlowa[i] = 1 * potega;
                    break;
                case 2:
                    prawidlowa[i] = 10 * potega;
                    break;
                case 3:
                    prawidlowa[i] = 11 * potega;
                    break;
                case 4:
                    prawidlowa[i] = 100 * potega;
                    break;
                case 5:
                    prawidlowa[i] = 101 * potega;
                    break;
                case 6:
                    prawidlowa[i] = 110 * potega;
                    break;
                case 7:
                    prawidlowa[i] = 111 * potega;
                    break;
            }
            wykladnik -= 3;
        }
        int binarna = (int) (prawidlowa[0] + prawidlowa[1] + prawidlowa[2]);
        int[] czworki = {0, 0, 0};
        String[] prawidlowaS = {"", "", ""};
        czworki[0] = binarna/100000000;
        czworki[1] = binarna/10000 - czworki[0]*10000;
        czworki[2] = binarna - czworki[1]*10000 - czworki[0]*100000000;
        for(int i = 0; i < 3; i++){
            switch (czworki[i]){
                case 0:
                    prawidlowaS[i] = "0";
                    break;
                case 1:
                    prawidlowaS[i] = "1";
                    break;
                case 10:
                    prawidlowaS[i] = "2";
                    break;
                case 11:
                    prawidlowaS[i] = "3";
                    break;
                case 100:
                    prawidlowaS[i] = "4";
                    break;
                case 101:
                    prawidlowaS[i] = "5";
                    break;
                case 110:
                    prawidlowaS[i] = "6";
                    break;
                case 111:
                    prawidlowaS[i] = "7";
                    break;
                case 1000:
                    prawidlowaS[i] = "8";
                    break;
                case 1001:
                    prawidlowaS[i] = "9";
                    break;
                case 1010:
                    prawidlowaS[i] = "A";
                    break;
                case 1011:
                    prawidlowaS[i] = "B";
                    break;
                case 1100:
                    prawidlowaS[i] = "C";
                    break;
                case 1101:
                    prawidlowaS[i] = "D";
                    break;
                case 1110:
                    prawidlowaS[i] = "E";
                    break;
                case 1111:
                    prawidlowaS[i] = "F";
                    break;

            }
        }
        String wynik = prawidlowaS[0] + prawidlowaS[1] + prawidlowaS[2];
        return wynik;
    }
}
