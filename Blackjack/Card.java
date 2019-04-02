public class Card {
    public int number;
    public String suit;


    public Card(int number, String suit) {
        this.number = number;
        this.suit = suit;
    }

    // accessors
    public int getNumber(){
        return number;
    }

    public String getSuit(){
        return suit;
    }

    //mutators
    public void setNumber(int value){
        number = value;
    }

    public void setSuit(String value) {
        suit = value;
    }
}
