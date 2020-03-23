import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URI;
import java.awt.Desktop;

public class Gui extends JFrame implements ActionListener {
    private JRadioButton pierwotnaBinarna, pierwotnaOsemkowa, pierwotnaDziesietna, pierwotnaSzesnastkowa;
    private JRadioButton konwertBinarna, konwertOsemkowa, konwertDziesietna, konwertSzesnastkowa;
    private ButtonGroup pierwotna, konwert;
    private JLabel binarnaL, binarnaR, osemkowaL, osemkowaR, dziesietnaL, dziesietnaR, szesnastkowaL, szesnastkowaR;
    private JTextField przed, po;
    private JButton zmien;
    private long przedKonwersja, poKonwersji;
    private Component frame;
    private Number x = new Number();

    public Gui(){
        super("Kalkulator systemów liczbowych");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 520);
        setLocation(100, 100);
        pierwotna = new ButtonGroup();
        pierwotnaBinarna = new JRadioButton("", true);
        pierwotnaOsemkowa = new JRadioButton("");
        pierwotnaDziesietna = new JRadioButton("");
        pierwotnaSzesnastkowa = new JRadioButton("");
        pierwotna.add(pierwotnaBinarna);
        pierwotna.add(pierwotnaOsemkowa);
        pierwotna.add(pierwotnaDziesietna);
        pierwotna.add(pierwotnaSzesnastkowa);
        pierwotnaBinarna.setBounds(10, 200, 108, 20);
        pierwotnaOsemkowa.setBounds(10,280 , 130, 20);
        pierwotnaDziesietna.setBounds(10, 360, 130, 20);
        pierwotnaSzesnastkowa.setBounds(10, 440, 162, 20);
        add(pierwotnaBinarna);
        add(pierwotnaOsemkowa);
        add(pierwotnaDziesietna);
        add(pierwotnaSzesnastkowa);

        konwert = new ButtonGroup();
        konwertBinarna = new JRadioButton("", true);
        konwertOsemkowa = new JRadioButton("");
        konwertDziesietna = new JRadioButton("");
        konwertSzesnastkowa = new JRadioButton("");
        konwert.add(konwertBinarna);
        konwert.add(konwertOsemkowa);
        konwert.add(konwertDziesietna);
        konwert.add(konwertSzesnastkowa);
        konwertBinarna.setBounds(210, 200, 108, 20);
        konwertOsemkowa.setBounds(210,280 , 130, 20);
        konwertDziesietna.setBounds(210, 360, 130, 20);
        konwertSzesnastkowa.setBounds(210, 440, 162, 20);
        add(konwertBinarna);
        add(konwertOsemkowa);
        add(konwertDziesietna);
        add(konwertSzesnastkowa);

        binarnaL = new JLabel("BINARNA");
        osemkowaL = new JLabel("ÓSEMKOWA");
        dziesietnaL = new JLabel("DZIESIĘTNA");
        szesnastkowaL = new JLabel("SZESNASTKOWA");
        binarnaL.setBounds(45, 200, 160, 25);
        osemkowaL.setBounds(45, 280, 160, 25);
        dziesietnaL.setBounds(45, 360, 160, 25);
        szesnastkowaL.setBounds(45, 440, 160, 25);
        binarnaL.setFont(new Font("lol", Font.BOLD, 15));
        osemkowaL.setFont(new Font("lol", Font.BOLD, 15));
        dziesietnaL.setFont(new Font("lol", Font.BOLD, 15));
        szesnastkowaL.setFont(new Font("lol", Font.BOLD, 15));
        add(binarnaL);
        add(osemkowaL);
        add(dziesietnaL);
        add(szesnastkowaL);

        binarnaR = new JLabel("BINARNA");
        osemkowaR = new JLabel("ÓSEMKOWA");
        dziesietnaR = new JLabel("DZIESIĘTNA");
        szesnastkowaR = new JLabel("SZESNASTKOWA");
        binarnaR.setBounds(245, 200, 160, 25);
        osemkowaR.setBounds(245, 280, 160, 25);
        dziesietnaR.setBounds(245, 360, 160, 25);
        szesnastkowaR.setBounds(245, 440, 160, 25);
        binarnaR.setFont(new Font("lol", Font.BOLD, 15));
        osemkowaR.setFont(new Font("lol", Font.BOLD, 15));
        dziesietnaR.setFont(new Font("lol", Font.BOLD, 15));
        szesnastkowaR.setFont(new Font("lol", Font.BOLD, 15));
        add(binarnaR);
        add(osemkowaR);
        add(dziesietnaR);
        add(szesnastkowaR);

        przed = new JTextField();
        przed.setBounds(10, 10, 380, 60);
        przed.setFont(new Font(" ", Font.PLAIN, 23));
        add(przed);
        po = new JTextField();
        po. setBounds(10, 130, 380, 60);
        po.setFont(new Font("fd ", Font.PLAIN, 27));
        add(po);

        zmien = new JButton();
        zmien.setBounds(10, 80, 380, 40);
        zmien.setText("KONWERTUJ");
        zmien.addActionListener(this);
        add(zmien);

        setLayout(null);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (pierwotnaBinarna.isSelected()){
            przedKonwersja = (Integer.parseInt(przed.getText()));
       //     JOptionPane.showMessageDialog(frame, "Eggs are not supposed to be green.");
            if (x.poprawnoscBinarnej((int) przedKonwersja)) {
                if (konwertBinarna.isSelected()) {
                    po.setText(przed.getText());
                } else if (konwertOsemkowa.isSelected()) {
                    przedKonwersja = (Long.parseLong(przed.getText()));
                    Binary x = new Binary();
                    poKonwersji = x.osemkowy((int) przedKonwersja);
                    po.setText(String.valueOf(poKonwersji));
                } else if (konwertDziesietna.isSelected()) {
                    przedKonwersja = (Long.parseLong(przed.getText()));
                    Binary x = new Binary();
                    poKonwersji = x.dziesietny((int) przedKonwersja);
                    poKonwersji = (int) poKonwersji;
                    po.setText(String.valueOf(poKonwersji));
                } else if (konwertSzesnastkowa.isSelected()) {
                    przedKonwersja = (Long.parseLong(przed.getText()));
                    Binary x = new Binary();
                    String szesna;
                    szesna = x.szesnastkowy((int) (przedKonwersja));
                    po.setText(szesna);
                }
            }
            else {
                JOptionPane.showMessageDialog(frame, "Sprawdź poprawność twojej liczby. \n Maksymalna liczba cyfr: 9");
            }
        }
        else if (pierwotnaOsemkowa.isSelected()){
            przedKonwersja = (Integer.parseInt(przed.getText()));
            if (x.poprawnoscOsemkowej((int) przedKonwersja)) {
                if (konwertBinarna.isSelected()) {
                    przedKonwersja = (Long.parseLong(przed.getText()));
                    Octal x = new Octal();
                    poKonwersji = x.binarny((int) przedKonwersja);
                    poKonwersji = (int) poKonwersji;
                    po.setText(String.valueOf(poKonwersji));
                } else if (konwertOsemkowa.isSelected()) {
                    po.setText(przed.getText());
                } else if (konwertDziesietna.isSelected()) {
                    przedKonwersja = (Long.parseLong(przed.getText()));
                    Octal x = new Octal();
                    poKonwersji = x.dziesietny((int) przedKonwersja);
                    poKonwersji = (int) poKonwersji;
                    po.setText(String.valueOf(poKonwersji));
                } else if (konwertSzesnastkowa.isSelected()) {
                    przedKonwersja = (Long.parseLong(przed.getText()));
                    Octal x = new Octal();
                    String szesna;
                    szesna = x.szesnastkowy((int) (przedKonwersja));
                    po.setText(szesna);
                }
            }
            else{
                JOptionPane.showMessageDialog(frame, "Sprawdź poprawność twojej liczby. \n Maksymalna liczba cyfr: 3");
            }
        }
        else if (pierwotnaDziesietna.isSelected()){
            przedKonwersja = (Integer.parseInt(przed.getText()));
            if (konwertBinarna.isSelected()){
                if (x.poprawnoscDziesietnejDwojkowej((int) przedKonwersja)){
                    przedKonwersja = (Long.parseLong(przed.getText()));
                    Decimal x = new Decimal();
                    poKonwersji = x.binarny((int) przedKonwersja);
                    po.setText(String.valueOf(poKonwersji));
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Sprawdź poprawność twojej liczby. \n Maksymalna liczba cyfr: 5");
                }
            }
                else if (x.poprawnoscDziesietnejOsemkowej((int) przedKonwersja)) {


                if (konwertOsemkowa.isSelected()) {
                    przedKonwersja = (Long.parseLong(przed.getText()));
                    Decimal x = new Decimal();
                    poKonwersji = x.osemkowy((int) przedKonwersja);
                    poKonwersji = (int) poKonwersji;
                    po.setText(String.valueOf(poKonwersji));
                }
            }
                else {
                    JOptionPane.showMessageDialog(frame, "Sprawdź poprawność twojej liczby. \n Maksymalna liczba cyfr: 8");
                }
                if (konwertDziesietna.isSelected()){
                    po.setText(przed.getText());
                }
                if (x.poprawnoscDziesietnejSzesnastkowej((int) przedKonwersja)) {


                    if (konwertSzesnastkowa.isSelected()) {
                        przedKonwersja = (Long.parseLong(przed.getText()));
                        Decimal x = new Decimal();
                        String szesna;
                        szesna = x.szesnastkowy((int) (przedKonwersja));
                        po.setText(szesna);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Sprawdź poprawność twojej liczby. \n Maksymalna liczba cyfr: 3");
                }

        }
        else if (pierwotnaSzesnastkowa.isSelected()){
            String z = przed.getText();
            if (x.poprawnoscSzesnastkowej(z)) {

                if (konwertBinarna.isSelected()) {
                    Hexadecimal x = new Hexadecimal();
                    z = przed.getText();
                    po.setText(String.valueOf(x.binarna(z)));
                }
                else if (konwertOsemkowa.isSelected()) {
                    Hexadecimal x = new Hexadecimal();
                    z = przed.getText();
                    po.setText(String.valueOf(x.osemkowa(z)));
                }
                else if (konwertDziesietna.isSelected()) {
                    Hexadecimal x = new Hexadecimal();
                    z = przed.getText();
                    po.setText(String.valueOf(x.dziesietna(z)));
                }
                else if (konwertSzesnastkowa.isSelected()) {
                    po.setText(przed.getText());
                }
            }
            else {
                JOptionPane.showMessageDialog(frame, "Sprawdź poprawność twojej liczby. \n Wymagana liczba znaków: 3");
            }
        }

    }
}
