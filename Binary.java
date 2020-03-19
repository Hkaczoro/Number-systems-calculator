/**
 * Klasa zawiera metody na zmiane z systemu binarnego na inne(osemkowy, dziesietny, szesnastkowy)
 */

import static java.lang.Math.*;

public class Binary {
    /**
     * Funkcja zamienia liczbę binarną na liczbę w systemie ósemkowym
     * @param liczba to liczba binarna(maks 9 bitów) (bez zabezpieczenia)
     * @return parametr w systemie ósemkowym
     */
    public int osemkowy(int liczba){
        int length;
        length = (int) (Math.log10(liczba) + 1); // ilosc cyfr w liczbie
        int[] trojki = {0, 0, 0};   //tablica przechowuje wartosci liczby binarnej wedlug schematu: (111)(111(101)
        double[] prawidlowa = {0, 0, 0};   //tablica przechowuje wartosci liczby w systemie osemkowym wedlug schematu (1)(3)(8)
        trojki[0] = liczba/1000000;
        trojki[1] = liczba/1000 - trojki[0]*1000;
        trojki[2] = liczba - trojki[1]*1000 - trojki[0]*1000000;
        int wykladnik = 2;
        for(int i = 0; i < 3; i++){
            double potega = pow(10, wykladnik);
            switch (trojki[i]){
                case 0:
                    prawidlowa[i] = 0*potega;
                    break;
                case 1:
                    prawidlowa[i] = 1*potega;
                    break;
                case 10:
                    prawidlowa[i] = 2*potega;
                    break;
                case 11:
                    prawidlowa[i] = 3*potega;
                    break;
                case 100:
                    prawidlowa[i] = 4*potega;
                    break;
                case 101:
                    prawidlowa[i] = 5*potega;
                    break;
                case 110:
                    prawidlowa[i] = 6*potega;
                    break;
                case 111:
                    prawidlowa[i] = 7*potega;
                    break;

            }
            wykladnik--;
        }
        int wynik = (int) (prawidlowa[0] + prawidlowa[1] + prawidlowa[2]);
        return wynik;
    }

    /**
     * Metoda zamienia liczbę binarną na dziesiętną
     * @param liczba to liczba binarna (brak zabezpieczenia)
     * @return parametr w systemie dziesiętnym
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
            wynik += cyfra[i]*pow(2, potega);
            potega--;
        }
        return wynik;
    }
}
