import java.util.*;

public class lab4 {
    private int rank;
    private int suit;

    public lab4() {
        // Default constructor
    }

    public lab4(int rank, int suit) {
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

    public void printlab4() {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        System.out.println(ranks[this.rank] + " of " + suits[this.suit]);
    }

    public static Vector<lab4> createDeck() {
        Vector<lab4> deck = new Vector<lab4>();
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                deck.add(new lab4(rank, suit));
            }
        }
        return deck;
    }

    public static void printDeck(Vector<lab4> deck) {
        for (lab4 lab4 : deck) {
            lab4.printlab4();
        }
    }

    public static boolean samelab4(lab4 lab41, lab4 lab42) {
        return (lab41.getRank() == lab42.getRank() && lab41.getSuit() == lab42.getSuit());
    }

    public static int comparelab4(lab4 lab41, lab4 lab42) {
        if (lab41.getRank() == lab42.getRank()) {
            return lab41.getSuit() - lab42.getSuit();
        } else {
            return lab41.getRank() - lab42.getRank();
        }
    }

    public static void sortlab4(Vector<lab4> deck) {
        Collections.sort(deck, new Comparator<lab4>() {
            @Override
            public int compare(lab4 lab41, lab4 lab42) {
                return comparelab4(lab41, lab42);
            }
        });
    }

    public static void findlab4(Vector<lab4> deck, lab4 lab4) {
        for (int i = 0; i < deck.size(); i++) {
            if (samelab4(deck.get(i), lab4)) {
                System.out.println("lab4 found at position " + i);
                return;
            }
        }
        System.out.println("lab4 not found");
    }

    public static void deallab4s(Vector<lab4> deck) {
        System.out.println("Dealt lab4s:");
        for (int i = 0; i < 5; i++) {
            int index = (int)(Math.random() * deck.size());
            deck.get(index).printlab4();
            deck.remove(index);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<lab4> deck = createDeck();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Print deck");
            System.out.println("2. Find lab4");
            System.out.println("3. Sort deck");
            System.out.println("4. Deal lab4s");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    printDeck(deck);
                    break;
                case 2:
                System.out.print("Enter rank of lab4 to find (0-12): ");
int rank = sc.nextInt();
System.out.print("Enter suit of lab4 to find (0-3): ");
int suit = sc.nextInt();
findlab4(deck, new lab4(rank, suit));
break;
case 3:
sortlab4(deck);
System.out.println("Deck sorted");
break;
case 4:
deallab4s(deck);
break;
case 5:
System.exit(0);
default:
System.out.println("Invalid choice");
}
}
}
}