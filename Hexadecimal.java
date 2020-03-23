import static java.lang.Math.pow;

public class Hexadecimal {
    public long binarna(String liczba) {
        int dlugosc = liczba.length();
        char[] znak = liczba.toCharArray();
        long[] liczbaP = new long[dlugosc];
        long wynik = 0;
        int mnoznik;
        if (dlugosc == 1) {
            mnoznik = 1;
        } else if (dlugosc == 2) {
            mnoznik = 10000;
        } else {
            mnoznik = 100000000;
        }
        for (int i = 0; i < znak.length; i++) {
            switch (znak[i]) {
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
        for (int i = 0; i < znak.length; i++) {
            wynik += liczbaP[i] * mnoznik;
            mnoznik /= 10000;
        }
        return wynik;
    }
    public long osemkowa(String liczba){
        int dlugosc = liczba.length();
        char[] znak = liczba.toCharArray();
        long[] liczbaP = new long[dlugosc];
        long wynik = 0;
        int mnoznik;
        if (dlugosc == 1) {
            mnoznik = 1;
        } else if (dlugosc == 2) {
            mnoznik = 10000;
        } else {
            mnoznik = 100000000;
        }
        for (int i = 0; i < znak.length; i++) {
            switch (znak[i]) {
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
        for (int i = 0; i < znak.length; i++) {
            wynik += liczbaP[i] * mnoznik;
            mnoznik /= 10000;
        }
        int length;
        length = (int) (Math.log10(wynik) + 1); // ilosc cyfr w liczbie

        int[] trojki = {0, 0, 0, 0};   //tablica przechowuje wartosci liczby binarnej wedlug schematu: (111)(111(101)
        long[] prawidlowa = {0, 0, 0};//tablica przechowuje wartosci liczby w systemie osemkowym wedlug schematu (1)(3)(8)
        long a, b, c, d;
        long zastepcza = (long) Math.pow(10,12);
        a = (wynik/1000000000);
        b = (wynik/1000000 - a*1000000000);
        c = (wynik/1000 - b*1000000 - a*1000000000);
        d = wynik - c*1000 - b*1000000 - a*1000000000;
        a = (int) a;
        b = (int) b;
        c = (int) c;
        d = (int) d;
        trojki[0] = (int) a;
        trojki[1] = (int) b;
        trojki[2] = (int) c;
        int wykladnik;
        int dlugoscA;
        if (trojki[2] == 0){
            dlugoscA = 2;
            wykladnik = 1;
        }
        else if (trojki[1] == 0 && trojki[2] == 0){
            dlugoscA = 1;
            wykladnik = 0;
        }
        else {
            dlugoscA = 3;
            wykladnik = 2;
        }
        for(int i = 0; i < dlugoscA; i++){
            double potega = pow(10, wykladnik);
            switch (trojki[i]){
                case 0:
                    prawidlowa[i] = (long) (0*potega);
                    break;
                case 1:
                    prawidlowa[i] = (long) (1*potega);
                    break;
                case 10:
                    prawidlowa[i] = (long) (2*potega);
                    break;
                case 11:
                    prawidlowa[i] = (long) (3*potega);
                    break;
                case 100:
                    prawidlowa[i] = (long) (4*potega);
                    break;
                case 101:
                    prawidlowa[i] = (long) (5*potega);
                    break;
                case 110:
                    prawidlowa[i] = (long) (6*potega);
                    break;
                case 111:
                    prawidlowa[i] = (long) (7*potega);
                    break;

            }
            wykladnik--;
        }
        long koniec = (prawidlowa[0] + prawidlowa[1] + prawidlowa[2]);
        return koniec;
    }
    public int dziesietna(String liczba){
        int dlugosc = liczba.length();
        char[] znak = liczba.toCharArray();
        long[] liczbaP = new long[dlugosc];
        long wynik = 0;
        int mnoznik;
        if (dlugosc == 1) {
            mnoznik = 1;
        } else if (dlugosc == 2) {
            mnoznik = 10000;
        } else {
            mnoznik = 100000000;
        }
        for (int i = 0; i < znak.length; i++) {
            switch (znak[i]) {
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
        for (int i = 0; i < znak.length; i++) {
            wynik += liczbaP[i] * mnoznik;
            mnoznik /= 10000;
        }
        Binary a = new Binary();
        int z = (int) a.dziesietny(wynik);
        return z;
    }
    public static void main(String[] args){
        Hexadecimal c = new Hexadecimal();
        System.out.println(c.osemkowa("100"));
    }
}

