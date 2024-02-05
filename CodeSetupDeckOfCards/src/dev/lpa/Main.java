package dev.lpa;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART,'A');
        Arrays.fill(cardArray,aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray),"Aces of Hearts",1);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards,aceOfHearts);
        System.out.println(cards);
        System.out.println("Cards.size() = " + cards.size());

        List<Card> acesOfHearts = Collections.nCopies(13,aceOfHearts);
        Card.printDeck(acesOfHearts,"Aces of Hearts",1);

        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUB,'K');
        List<Card> kingsOfClubs = Collections.nCopies(13,kingOfClubs);
        Card.printDeck(kingsOfClubs,"King of Clubs",1);

        Collections.addAll(cards,cardArray);
        Collections.addAll(cards,cardArray);
        Card.printDeck(cards,"Card Collection with Aces added",2);

        Collections.copy(cards,kingsOfClubs);
        Card.printDeck(cards,"Card Collection with Kings copied",2);

        cards = List.copyOf(kingsOfClubs);
        Card.printDeck(cards,"List od copy Kings",1);

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Collections.shuffle(deck);
        Card.printDeck(deck,"Shuffled deck",1);

        Collections.reverse(deck);
        Card.printDeck(deck,"Reversed deck",1);

        var sortingAlgorithm = Comparator.comparing(Card::rank)
                .thenComparing(Card::suit);
        Collections.sort(deck,sortingAlgorithm);

        Card.printDeck(deck,"Standard deck sorted by rank, suit",13);

        Collections.reverse(deck);
        Card.printDeck(deck,"Standard by rank, suit reversed",13);

        List<Card> kings = new ArrayList<>(deck.subList(4,8));
        Card.printDeck(kings,"Kings in deck",1);

        List<Card> tens = new ArrayList<>(deck.subList(16,20));
        Card.printDeck(tens,"Tens in deck",1);

        int subListIndex = Collections.indexOfSubList(deck,tens);
        System.out.println("sublist index for tens = " + subListIndex);

        System.out.println("Contains = " + deck.containsAll(tens));

        boolean disjoint = Collections.disjoint(deck,tens);
        System.out.println("disjoint = " + disjoint);

        boolean disjoint2 = Collections.disjoint(kings,tens);
        System.out.println("disjoint2 = " + disjoint2);

        deck.sort(sortingAlgorithm);
        Card tenOfHearts = Card.getNumericCard(Card.Suit.HEART,10);
        int fountIndex = Collections.binarySearch(deck,tenOfHearts,sortingAlgorithm);
        System.out.println("foundIndex = " + fountIndex);
        System.out.println("foundIndex = " + deck.indexOf(tenOfHearts));
        System.out.println(deck.get(fountIndex));

         Card tenOfClubs = Card.getNumericCard(Card.Suit.CLUB,10);
         Collections.replaceAll(deck,tenOfClubs,tenOfHearts);
         Card.printDeck(deck.subList(32,36),"Tens row",1);

        Collections.replaceAll(deck,tenOfHearts,tenOfClubs);
        Card.printDeck(deck.subList(32,36),"Tens row",1);

        if (Collections.replaceAll(deck,tenOfHearts,tenOfClubs)){
            System.out.println("Tens of hearts replaced with tens of clubs");
        } else {
            System.out.println("No tens of hearts were found in the list");
        }

        System.out.println("Ten of Clubs Cards = " +
                Collections.frequency(deck,tenOfClubs));

        System.out.println("Best Card = " + Collections.max(deck,sortingAlgorithm));
        System.out.println("Worst Card = " + Collections.min(deck,sortingAlgorithm));

        var sortBySuit = Comparator.comparing(Card::suit)
                .thenComparing(Card::rank);
        deck.sort(sortBySuit);
        Card.printDeck(deck,"Sorted by Suit, Rank",4);

        List<Card> copied = new ArrayList<>(deck.subList(0,13));
        Collections.rotate(copied,2);
        System.out.println("UnRotated: " + deck.subList(0,13));
        System.out.println("Rotated " + 2 +": " + copied);

        copied = new ArrayList<>(deck.subList(0,13));
        Collections.rotate(copied,-2);
        System.out.println("UnRotated: " + deck.subList(0,13));
        System.out.println("Rotated " + -2 +": " + copied);

        copied = new ArrayList<>(deck.subList(0,13));
        for (int i = 0; i < copied.size() /2 ; i++){
            Collections.swap(copied,i,copied.size() - 1 - i);
        }
        System.out.println("Manual reverse: " + copied);

        copied = new ArrayList<>(deck.subList(0,13));
        Collections.reverse(copied);
        System.out.println("Using reverse: " + copied);
    }
}
