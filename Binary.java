/**
 * Klasa zawiera metody na zmiane z systemu binarnego na inne(osemkowy, dziesietny, szesnastkowy)
 */

import static java.lang.Math.*;

public class Binary {
    public void osemkowy(int liczba){
        int length;
        length = (int) (Math.log10(liczba) + 1); // ilosc cyfr liczby
        System.out.println(length);
        int[] trojki = {0, 0, 0};
        double[] prawidlowa = {0, 0, 0};
        trojki[0] = liczba/1000000;
        trojki[1] = liczba/1000 - trojki[0]*1000;
        trojki[2] = liczba - trojki[1]*1000 - trojki[0]*1000000;
        System.out.println(trojki[0]);
        System.out.println(trojki[1]);
        System.out.println(trojki[2]);
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
        System.out.println(wynik);
    }

}
