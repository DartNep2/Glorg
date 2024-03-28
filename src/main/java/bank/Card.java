package bank;

public class Card {
    public int getCARD_NUMBER() {
        return CARD_NUMBER;
    }

    public Card(int CARD_NUMBER, int pinCode) {
        this.CARD_NUMBER = CARD_NUMBER;
        this.pinCode = pinCode;
    }

    public void setCARD_NUMBER(int CARD_NUMBER) {
        this.CARD_NUMBER = CARD_NUMBER;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    private int CARD_NUMBER;
    private int pinCode;
}
