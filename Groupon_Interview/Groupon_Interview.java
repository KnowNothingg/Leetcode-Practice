package Groupon_Interview;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 
 # The coin game is a game where a number of coins are put in a center "pot".
 # Two players take turns where they can pick up 1, 2 or 4 coins from the pot.
 # The winner is the player who takes the last coin(s) from the pot.

 # Write a function that, given the number of coins in the center and the order
 # of the players' turns, returns which player will win the game if they both
 # play with 'optimal strategy' - that is, they are trying to win.

 # Examples:
 # coin_game(1, "alice", "bob") returns "alice"
 # coin_game(3, "alice", "bob") returns "bob”
 coin_game(5, "alice", "bob") return "alice" 
 
 
 # coin_game(6, "alice", "bob") returns "bob"
 */

class Solution {
  public static void main(String[] args) {
    System.out.println( coin_game(1, "alice", "bob")); // Alice
    System.out.println( coin_game(3, "alice", "bob")); // Bob
    System.out.println( coin_game(5, "alice", "bob")); // Alice
    System.out.println( coin_game(6, "alice", "bob")); // Alice
    System.out.println( coin_game(10, "alice", "bob")); // Alice


  }
  
  
  public static String coin_game(int n, String p1, String p2){
    if(n == 1 || n == 2 || n == 4){
      return p1; 
    }
    
    if(n > 1 && (n - 1 != 1 || n - 1 != 2 || n - 1 != 4)) return coin_game(n-1, p2, p1);
    if(n > 2 && (n - 2 != 1 || n - 2 != 2 || n - 2 != 4)) return coin_game(n-2, p2, p1);
    if(n > 4 && (n - 4 != 1 || n - 4 != 2 || n - 4 != 4)) return coin_game(n-4, p2, p1);
    
    return "Null";
  }
}
