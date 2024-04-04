package bank;

import java.util.*;

public class Card {

    private int getCARD_NUMBER() {
        return CARD_NUMBER;
    }

    public Card(int CARD_NUMBER) {
        this.CARD_NUMBER = CARD_NUMBER;
        this.pinCode = setPinCode();
    }

    private void setCARD_NUMBER(int CARD_NUMBER) {
        this.CARD_NUMBER = CARD_NUMBER;
    }

    public String getPinCode() {
        return pinCode;
    }

    private String setPinCode() {
        System.out.println("Введите новый пинкод:");
        Scanner sc = new Scanner(System.in);
        String pinCode = sc.nextLine();
        int pinSize=pinCode.length();
        if(pinSize == 4){
            return pinCode;
        }
        else System.out.println("Ошибка! Ваш пинкод не подходит, поэтому вам насильно был создан подходящий:");
        String newPinCode = "";
        for (int i = 0; i < 4; i++) {
            Random r = new Random();
            newPinCode = newPinCode + r.nextInt(4);
        }
        System.out.println(newPinCode);
        return newPinCode;
    }

    private int CARD_NUMBER;
    private String pinCode;
}
