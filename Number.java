import com.sun.source.tree.ContinueTree;

import javax.swing.*;
import java.awt.*;
import java.time.temporal.ValueRange;

import static java.lang.Math.pow;

public class Number {
    public boolean poprawnoscBinarnej(int liczba) {
            int length;
            float x;
            int dzielnik = 10;
            length = (int) (Math.log10(liczba) + 1); // ilosc cyfr w liczbie
            if (length > 9) {

                return false;
            } else {
                for (int i = 0; i < 10; i++) {
                    x = liczba % dzielnik;
                    if (x >= 2) {
                        return false;
                    }
                    else {
                        liczba /= 10;

                    }
                }
            }
            return true;
    }
    public boolean poprawnoscOsemkowej(int liczba){
        int length;
        float x;
        int dzielnik = 10;
        length = (int) (Math.log10(liczba) + 1); // ilosc cyfr w liczbie
        if (length > 3) {

            return false;
        } else {
            for (int i = 0; i < 4; i++) {
                x = liczba % dzielnik;
                if (x >= 8) {
                    return false;
                }
                else {
                    liczba /= 10;

                }
            }
        }
        return true;
    }

    public boolean poprawnoscDziesietnejSzesnastkowej(int liczba){
        int length;
        length = (int) (Math.log10(liczba) + 1); // ilosc cyfr w liczbie
        if (length > 3) {
            return false;
        }
        else {
            return true;
        }
    }
    public boolean poprawnoscDziesietnejDwojkowej(int liczba){
        int length;
        length = (int) (Math.log10(liczba) + 1); // ilosc cyfr w liczbie
        if (length > 5) {
            return false;
        }
        else {
            return true;
        }
    }
    public boolean poprawnoscDziesietnejOsemkowej(int liczba){
        int length;
        length = (int) (Math.log10(liczba) + 1); // ilosc cyfr w liczbie
        if (length > 8) {
            return false;
        }
        else {
            return true;
        }
    }
    public boolean poprawnoscSzesnastkowej(String liczba){
        int dlugosc = liczba.length();
        int sprawdzian = 0;
        if (dlugosc > 3){
            return false;
        }
        else {
            char[] znak = liczba.toCharArray();
            for(int i = 0; i < 3;i++){
                switch (znak[i]){
                    case '0':
                        break;
                    case '1':
                        break;
                    case '2':
                        break;
                    case '3':
                        break;
                    case '4':
                        break;
                    case '5':
                        break;
                    case '6':
                        break;
                    case '7':
                        break;
                    case '8':
                        break;
                    case '9':
                        break;
                    case 'A':
                        break;
                    case 'B':
                        break;
                    case 'C':
                        break;
                    case 'D':
                        break;
                    case 'E':
                        break;
                    case 'F':
                        break;
                    default:
                        sprawdzian++;
                        break;
                }
            }
            if (sprawdzian != 0){
                return false;
            }
            else {
                return true;
            }
        }
    }
}
