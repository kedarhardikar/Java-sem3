import java.util.*;

public class Card {
    private int rank;
    private int suit;

    public Card() {
        // Default constructor
    }

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return this.rank;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getSuit() {
        return this.suit;
    }

    public void printCard() {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        System.out.println(ranks[this.rank] + " of " + suits[this.suit]);
    }

    public static Vector<Card> createDeck() {
        Vector<Card> deck = new Vector<Card>();
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                deck.add(new Card(rank, suit));
            }
        }
        return deck;
    }

    public static void printDeck(Vector<Card> deck) {
        for (Card card : deck) {
            card.printCard();
        }
    }

    public static boolean sameCard(Card card1, Card card2) {
        return (card1.getRank() == card2.getRank() && card1.getSuit() == card2.getSuit());
    }

    public static int compareCard(Card card1, Card card2) {
        if (card1.getRank() == card2.getRank()) {
            return card1.getSuit() - card2.getSuit();
        } else {
            return card1.getRank() - card2.getRank();
        }
    }

    public static void sortCard(Vector<Card> deck) {
        Collections.sort(deck, new Comparator<Card>() {
            @Override
            public int compare(Card card1, Card card2) {
                return compareCard(card1, card2);
            }
        });
    }

    public static void findCard(Vector<Card> deck, Card card) {
        for (int i = 0; i < deck.size(); i++) {
            if (sameCard(deck.get(i), card)) {
                System.out.println("Card found at position " + i);
                return;
            }
        }
        System.out.println("Card not found");
    }

    public static void dealCards(Vector<Card> deck) {
        System.out.println("Dealt cards:");
        for (int i = 0; i < 5; i++) {
            int index = (int)(Math.random() * deck.size());
            deck.get(index).printCard();
            deck.remove(index);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Card> deck = createDeck();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Print deck");
            System.out.println("2. Find card");
            System.out.println("3. Sort deck");
            System.out.println("4. Deal cards");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    printDeck(deck);
                    break;
                case 2:
                System.out.print("Enter rank of card to find (0-12): ");
int rank = sc.nextInt();
System.out.print("Enter suit of card to find (0-3): ");
int suit = sc.nextInt();
findCard(deck, new Card(rank, suit));
break;
case 3:
sortCard(deck);
System.out.println("Deck sorted");
break;
case 4:
dealCards(deck);
break;
case 5:
System.exit(0);
default:
System.out.println("Invalid choice");
}
}
}
}