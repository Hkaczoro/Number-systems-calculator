import static java.lang.Math.pow;

public class Decimal {
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
}
