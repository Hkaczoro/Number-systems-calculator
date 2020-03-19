/**
 * Program konwertuje liczbę w danym systemie na liczbę w innym systemie
 * @author hubertkaczorowski
 * @version 1.0.0
 */

public class Main {
    public static void main(String[] args){
        Binary X = new Binary();
        System.out.println(X.osemkowy(111110011));   // 0 na początku krzaczy program
        System.out.println(X.dziesietny(100010010));
        System.out.println(X.szesnastkowy(11100));
    }
}
