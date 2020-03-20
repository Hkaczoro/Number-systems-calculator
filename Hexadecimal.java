import static java.lang.Math.pow;

public class Hexadecimal {
    public long binarna(String liczba) {
        char[] znak = liczba.toCharArray();
        int[] liczbaP = new int[3];
        int wynik = 0;
        for(int i = 0; i < znak.length; i++){
            switch (znak[i]){
                case '0':
                    liczbaP[i] = 0;
                    break;
                case '1':
                    liczbaP[i] = 1;
                    break;
                case '2':
                    liczbaP[i] = 10;
                    break;
                case '3':
                    liczbaP[i] = 11;
                    break;
                case '4':
                    liczbaP[i] = 100;
                    break;
                case '5':
                    liczbaP[i] = 101;
                    break;
                case '6':
                    liczbaP[i] = 110;
                    break;
                case '7':
                    liczbaP[i] = 111;
                    break;
                case '8':
                    liczbaP[i] = 1000;
                    break;
                case '9':
                    liczbaP[i] = 1001;
                    break;
                case 'A':
                    liczbaP[i] = 1010;
                    break;
                case 'B':
                    liczbaP[i] = 1011;
                    break;
                case 'C':
                    liczbaP[i] = 1100;
                    break;
                case 'D':
                    liczbaP[i] = 1101;
                    break;
                case 'E':
                    liczbaP[i] = 1110;
                    break;
                case 'F':
                    liczbaP[i] = 1111;
                    break;

            }
        }
        int mnoznik = 100000000;
        for(int i = 0; i < 3; i++){
            wynik += liczbaP[i]*mnoznik;
            mnoznik /= 10000;
        }
        return wynik;
    }
    public int osemkowa(String liczba){
        char[] znak = liczba.toCharArray();
        int[] liczbaP = new int[3];
        int wynik = 0;
        for(int i = 0; i < znak.length; i++){
            switch (znak[i]){
                case '0':
                    liczbaP[i] = 0;
                    break;
                case '1':
                    liczbaP[i] = 1;
                    break;
                case '2':
                    liczbaP[i] = 10;
                    break;
                case '3':
                    liczbaP[i] = 11;
                    break;
                case '4':
                    liczbaP[i] = 100;
                    break;
                case '5':
                    liczbaP[i] = 101;
                    break;
                case '6':
                    liczbaP[i] = 110;
                    break;
                case '7':
                    liczbaP[i] = 111;
                    break;
                case '8':
                    liczbaP[i] = 1000;
                    break;
                case '9':
                    liczbaP[i] = 1001;
                    break;
                case 'A':
                    liczbaP[i] = 1010;
                    break;
                case 'B':
                    liczbaP[i] = 1011;
                    break;
                case 'C':
                    liczbaP[i] = 1100;
                    break;
                case 'D':
                    liczbaP[i] = 1101;
                    break;
                case 'E':
                    liczbaP[i] = 1110;
                    break;
                case 'F':
                    liczbaP[i] = 1111;
                    break;

            }
        }
        int mnoznik = 100000000;
        for(int i = 0; i < 3; i++) {
            wynik += liczbaP[i] * mnoznik;
            mnoznik /= 10000;
        }
        int[] trojki = {0, 0, 0};   //tablica przechowuje wartosci liczby binarnej wedlug schematu: (111)(111(101)
        double[] prawidlowa = {0, 0, 0};   //tablica przechowuje wartosci liczby w systemie osemkowym wedlug schematu (1)(3)(8)
        trojki[0] = wynik/1000000;
        trojki[1] = wynik/1000 - trojki[0]*1000;
        trojki[2] = wynik - trojki[1]*1000 - trojki[0]*1000000;
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
        int koniec = (int) (prawidlowa[0] + prawidlowa[1] + prawidlowa[2]);
        return koniec;
    }
    public int dziesietna(String liczba){
        char[] znak = liczba.toCharArray();
        int[] liczbaP = new int[3];
        int wynik = 0;
        for(int i = 0; i < znak.length; i++){
            switch (znak[i]){
                case '0':
                    liczbaP[i] = 0;
                    break;
                case '1':
                    liczbaP[i] = 1;
                    break;
                case '2':
                    liczbaP[i] = 10;
                    break;
                case '3':
                    liczbaP[i] = 11;
                    break;
                case '4':
                    liczbaP[i] = 100;
                    break;
                case '5':
                    liczbaP[i] = 101;
                    break;
                case '6':
                    liczbaP[i] = 110;
                    break;
                case '7':
                    liczbaP[i] = 111;
                    break;
                case '8':
                    liczbaP[i] = 1000;
                    break;
                case '9':
                    liczbaP[i] = 1001;
                    break;
                case 'A':
                    liczbaP[i] = 1010;
                    break;
                case 'B':
                    liczbaP[i] = 1011;
                    break;
                case 'C':
                    liczbaP[i] = 1100;
                    break;
                case 'D':
                    liczbaP[i] = 1101;
                    break;
                case 'E':
                    liczbaP[i] = 1110;
                    break;
                case 'F':
                    liczbaP[i] = 1111;
                    break;

            }
        }
        int mnoznik = 100000000;
        for(int i = 0; i < 3; i++){
            wynik += liczbaP[i]*mnoznik;
            mnoznik /= 10000;
        }
        Binary a = new Binary();
        int z = a.dziesietny(wynik);
        return z;
    }
}
