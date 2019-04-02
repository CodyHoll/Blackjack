public class Player {
    public int chips;
    public Card[] hand;

    public Player(int chips) {
        this.chips = chips;
    }

    // accessors
    public int getChips(){
        return chips;
    }

    public Card[] getHand() {
        return hand;
        // int total = 0;
        // for (int i : hand) {
        //     total += hand[i];
        // }
        // return total;
    }

    //mutators
    public void setChips(int value){
        chips = value;
    }

    public void setHand(Card[] value) {
        hand = value;
    }
}
