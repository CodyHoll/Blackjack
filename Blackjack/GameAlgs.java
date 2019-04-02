import java.util.Random;
import java.util.Scanner;
public class GameAlgs {



    public Card[] makeDeck() { // return a Card[]
        Card AceH = new Card(11, "Hearts");
        Card AceD = new Card(11, "Diamonds");
        Card AceS = new Card(11, "Spades");
        Card AceC = new Card(11, "Clubs");
        Card TwoH = new Card(2, "Hearts");
        Card TwoD = new Card(2, "Diamonds");
        Card TwoS = new Card(2, "Spades");
        Card TwoC  = new Card(2, "Clubs");
        Card ThreeH = new Card(3, "Hearts");
        Card ThreeD = new Card(3, "Diamonds");
        Card ThreeS = new Card(3, "Spades");
        Card ThreeC = new Card(3, "Clubs");
        Card FourH = new Card(4, "Hearts");
        Card FourD = new Card(4, "Diamonds");
        Card FourS = new Card(4, "Spades");
        Card FourC = new Card(4, "Clubs");
        Card FiveH = new Card(5, "Hearts");
        Card FiveD = new Card(5, "Diamonds");
        Card FiveS = new Card(5, "Spades");
        Card FiveC = new Card(5, "Clubs");
        Card SixH = new Card(6, "Hearts");
        Card SixD = new Card(6, "Diamonds");
        Card SixS = new Card(6, "Spades");
        Card SixC = new Card(6, "Clubs");
        Card SevenH = new Card(7, "Hearts");
        Card SevenD = new Card(7, "Diamonds");
        Card SevenS = new Card(7, "Spades");
        Card SevenC = new Card(7, "Clubs");
        Card EightH = new Card(8, "Hearts");
        Card EightD = new Card(8, "Diamonds");
        Card EightS = new Card(8, "Spades");
        Card EightC = new Card(8, "Clubs");
        Card NineH = new Card(9, "Hearts");
        Card NineD = new Card(9, "Diamonds");
        Card NineS = new Card(9, "Spades");
        Card NineC = new Card(9, "Clubs");
        Card TenH = new Card(10, "Hearts");
        Card TenD = new Card(10, "Diamonds");
        Card TenS = new Card(10, "Spades");
        Card TenC = new Card(10, "Clubs");
        Card JackH = new Card(10, "Hearts");
        Card JackD = new Card(10, "Diamonds");
        Card JackS = new Card(10, "Spades");
        Card JackC = new Card(10, "Clubs");
        Card QueenH = new Card(10, "Hearts");
        Card QueenD = new Card(10, "Diamonds");
        Card QueenS = new Card(10, "Spades");
        Card QueenC = new Card(10, "Clubs");
        Card KingH = new Card(10, "Hearts");
        Card KingD = new Card(10, "Diamonds");
        Card KingS = new Card(10, "Spades");
        Card KingC = new Card(10, "Clubs");
        Card c = new Card(20,"urmom");

        Card[] deck = new Card[52];
        deck[0]  = AceH;
        deck[1]  = AceD;
        deck[2]  = AceS;
        deck[3]  = AceC;
        deck[4]  = TwoH;
        deck[5]  = TwoD;
        deck[6]  = TwoS;
        deck[7]  = TwoC;
        deck[8]  = ThreeH;
        deck[9]  = ThreeD;
        deck[10] = ThreeS;
        deck[11] = ThreeC;
        deck[12] = FourH;
        deck[13] = FourD;
        deck[14] = FourS;
        deck[15] = FourC;
        deck[16] = FiveH;
        deck[17] = FiveD;
        deck[18] = FiveS;
        deck[19] = FiveC;
        deck[20] = SixH;
        deck[21] = SixD;
        deck[22] = SixS;
        deck[23] = SixC;
        deck[24] = SevenH;
        deck[25] = SevenD;
        deck[26] = SevenS;
        deck[27] = SevenC;
        deck[28] = EightH;
        deck[29] = EightD;
        deck[30] = EightS;
        deck[31] = EightC;
        deck[32] = NineH;
        deck[33] = NineD;
        deck[34] = NineS;
        deck[35] = NineC;
        deck[36] = TenH;
        deck[37] = TenD;
        deck[38] = TenS;
        deck[39] = TenC;
        deck[40] = JackH;
        deck[41] = JackD;
        deck[42] = JackS;
        deck[43] = JackC;
        deck[44] = QueenH;
        deck[45] = QueenD;
        deck[46] = QueenS;
        deck[47] = QueenC;
        deck[48] = KingH;
        deck[49] = KingD;
        deck[50] = KingS;
        deck[51] = KingC;

        //AceH,AceS,AceC,TwoH,TwoD,TwoS,TwoC,ThreeH,ThreeD,ThreeS,ThreeC,FourH,FourD,FourS,FourC,FiveH,FiveD,FiveS,FiveC,SixH,SixD,SixS,SixC,SevenH,SevenD,SevenS,SevenC,EightH,EightD,EightS,EightC,NineH,NineD,NineS,NineC,TenH,TenD,TenS,TenC,JackH,JackD,JackS,JackC,QueenH,QueenS,QueenC,KingH,KingD,KingS,KingC
        return deck;
    }

    public void shuffle(Card[] deck) {
        //select two random ints between 0-51 inclusivly
        //swap those two cards
        // do that like 200 times

         Random rand = new Random();
         for (int i=0; i< 200; i++) {
             int pos1 = rand.nextInt(52);
             int pos2 = rand.nextInt(52);
             Card temp = deck[pos1];
             deck[pos1] = deck[pos2];
             deck[pos2] = temp;
        }
    }

    // public void deal(int numOfPlayers, Card[] deck, int chips) {
    //     Player p = new Player();
    // }

    public Player[] getPlayers() {
        Player p1 = new Player(100);
        Player p2 = new Player(0);
        Player p3 = new Player(0);
        Player p4 = new Player(0);
        Player p5 = new Player(0);
        Player p6 = new Player(0);
        Player[] p = new Player[6];
        p[0] = p1;
        p[1] = p2;
        p[2] = p3;
        p[3] = p4;
        p[4] = p5;
        p[5] = p6;
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("How many players would you like? You can have up to 6");
        int numOfPlayers = scanner.nextInt();  // Read user input
        System.out.println("You have chosen "+ numOfPlayers + " player/s");  // Output user input

        Player[] players = new Player[numOfPlayers];
        for(int i=0;i<numOfPlayers;i++){
            players[i] = p[i];
        }


        System.out.println("How many chips should each player start with?");
        int chips = scanner.nextInt();
        for(int i=0; i<numOfPlayers;i++) {
            players[i].setChips(chips);
        }


        //System.out.println(p1.getChips());
        return players;
    }

    // public Deck shuffleMultiple(Deck deck){ //can maybe handle this is the shuffle class
    //
    // }
    //
    // public void startingChips(){ //may not need to be a function
    //
    // }
    //


    public int startingChips() {
        //do the whole scanner thing and ask how many chips to start with
        // for now just returning 150
        return 150;
    }
    //
    // public void playerBehavior(){ //will have helper functions (betting, splitting, hitting, doubling down, standing)
    //
    // }
    //
    // public void dealerBehavior(){
    //
    // }
    //
    // public void display(){
    //
    // }


}
