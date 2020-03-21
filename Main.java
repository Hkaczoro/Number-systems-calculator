import java.awt.*;

/**
 * Program konwertuje liczbę w danym systemie na liczbę w innym systemie
 * @author hubertkaczorowski
 * @version 1.0.0
 */

public class Main {
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Gui();
            }
        });
    }
}
