package app;
import bank.Card;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Card ca = new Card(4567565);
        System.out.println(ca.getPinCode());
    }
}
