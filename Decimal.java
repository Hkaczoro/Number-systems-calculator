/**
 * Klasa zawiera metody na zmiane z systemu dziesietnego na inne(binarny, ósenkowy, szesnastkowy)
 */

import static java.lang.Math.pow;

public class Decimal {
    /**
     * Metoda zmienia liczbe dziesiętną na binarną
     * @param liczba to liczba w systemie dziesiętnym
     * @return liczba w systemie binarnym
     */
    public long binarny(long liczba){
        long[] binarna = new long[18];
        long wynik = 0;
        int x = 0;
        while (liczba > 0){
            binarna[x] = liczba%2;
            liczba /= 2;
            x++;
        }
        long mnoznik = 1;
        for(int i = 0; i < binarna.length; i++){
            wynik += binarna[i]*mnoznik;
            mnoznik *= 10;
        }
        return wynik;
    }

    /**
     * Metoda zmienia liczbę dziesiętną na liczbę w systemie ósemkowym
     * @param liczba to liczba w systemie dziesiętnym
     * @return liczba w systemie ósemkowym
     */
    public int osemkowy(int liczba){
        int[] cyfra = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length;
        length = (int) (Math.log10(liczba) + 1); // ilosc cyfr w liczbie
        int x = 0;
        int przejscie = liczba;
        while(przejscie > 0){
            cyfra[x] = przejscie%8;
            przejscie = przejscie/8;
            x++;
        }
        int wykladnik = 0;
        int wynik = 0;
        for(int i = 0; i < 9; i++){
            wynik += cyfra[i]*pow(10, wykladnik);
            wykladnik++;
        }
        return wynik;

    }

    /**
     * Metoda zmienia liczbę w systemie dziesiętnym na liczbę w systmie szesnastkowym(łańcuch znaków)
     * @param liczba to liczba w systemie dziesiętnym
     * @return łańcuch znaków (liczba) w systemie szesnastkowym
     */
    public String szesnastkowy(int liczba){
        int[] binarna = new int[11];
        int wynik = 0;
        int x = 0;
        while (liczba > 0){
            binarna[x] = liczba%2;
            liczba /= 2;
            x++;
        }
        int mnoznik = 1;
        for(int i = 0; i < binarna.length; i++){
            wynik += binarna[i]*mnoznik;
            mnoznik *= 10;
        }
        int[] czworki = {0, 0, 0};
        String[] prawidlowa = {"", "", ""};
        czworki[0] = wynik/100000000;
        czworki[1] = wynik/10000 - czworki[0]*10000;
        czworki[2] = wynik - czworki[1]*10000 - czworki[0]*100000000;
        for(int i = 0; i < 3; i++){
            switch (czworki[i]){
                case 0:
                    prawidlowa[i] = "0";
                    break;
                case 1:
                    prawidlowa[i] = "1";
                    break;
                case 10:
                    prawidlowa[i] = "2";
                    break;
                case 11:
                    prawidlowa[i] = "3";
                    break;
                case 100:
                    prawidlowa[i] = "4";
                    break;
                case 101:
                    prawidlowa[i] = "5";
                    break;
                case 110:
                    prawidlowa[i] = "6";
                    break;
                case 111:
                    prawidlowa[i] = "7";
                    break;
                case 1000:
                    prawidlowa[i] = "8";
                    break;
                case 1001:
                    prawidlowa[i] = "9";
                    break;
                case 1010:
                    prawidlowa[i] = "A";
                    break;
                case 1011:
                    prawidlowa[i] = "B";
                    break;
                case 1100:
                    prawidlowa[i] = "C";
                    break;
                case 1101:
                    prawidlowa[i] = "D";
                    break;
                case 1110:
                    prawidlowa[i] = "E";
                    break;
                case 1111:
                    prawidlowa[i] = "F";
                    break;

            }
        }
        String koncowa = prawidlowa[0] + prawidlowa[1] + prawidlowa[2];
        return koncowa;

    }
}
