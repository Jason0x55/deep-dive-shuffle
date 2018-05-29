/**
 * 
 */
package edu.cnm.deepdive;

import java.util.Arrays;

/**
 * @author jason
 *
 */
public class Test {

  /**
   * @param args standard args
   */
  public static void main(String[] args) {
    int[] deck = createDeck(100);
    reveal(deck);
    ArrayShuffles.shuffle(deck);
    reveal(deck);
    
    double[] deckDouble = createDeckDouble(100);
    revealDouble(deckDouble);
    ArrayShuffles.shuffle(deckDouble);
    revealDouble(deckDouble);
  }
  
  private static int[] createDeck(int size) {
    int[] deck = new int[size];
    for (int i = 0; i < size; i++) {
      deck[i] = i; 
    }
    
    return deck;
  }
  
  private static double[] createDeckDouble(int size) {
    double[] deck = new double[size];
    for (int i = 0; i < size; i++) {
      deck[i] = (double) i; 
    }
    
    return deck;
  }
  
  private static void reveal (int[] deck) {
//   for (int value : deck) {
//     System.out.print(value + " ");
//   }
//   System.out.println("");
    System.out.println(Arrays.toString(deck));
  }
  
  private static void revealDouble (double[] deck) {
//  for (int value : deck) {
//    System.out.print(value + " ");
//  }
//  System.out.println("");
   System.out.println(Arrays.toString(deck));
 }

}
