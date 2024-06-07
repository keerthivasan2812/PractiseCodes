package Round3;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Snake and Ladder game");
        
        System.out.println("Enter the number of players who are going to play the game:");
        int numberOfPlayers = scanner.nextInt();
        
        gameStart(numberOfPlayers);
        
        scanner.close();
    }
    
    public static void gameStart(int num) {
        Map<Integer, Integer> ladder = new LinkedHashMap<>();
        Map<Integer, Integer> snakes = new LinkedHashMap<>();
        
        ladder.put(7, 15);
        ladder.put(20, 35);
        ladder.put(40, 48);
        ladder.put(42, 60);
        ladder.put(81, 91);
        ladder.put(78, 85);
        ladder.put(89, 97);
        ladder.put(56, 84);
        
        snakes.put(45, 17);
        snakes.put(56, 40);
        snakes.put(36, 14);
        snakes.put(18, 7);
        snakes.put(39, 22);
        snakes.put(89, 69);
        snakes.put(85, 38);
        snakes.put(98, 22);
        
        int[] players = new int[num];
        Arrays.fill(players, 1);
        
        boolean gameWon = false;
        
        Random random = new Random();
        int currentPlayer=0;
        Scanner scanner=new Scanner(System.in); 
        
        while (!gameWon) {
        	  System.out.println("Player " + (currentPlayer + 1) + ", press Enter to roll the dice.");
              scanner.nextLine(); // Wait for player to press Enter
                // Roll the dice
                int diceRoll = random.nextInt(6) + 1;
                
                // Print the dice roll result
                System.out.println("Player " + (currentPlayer + 1) + " rolled a " + diceRoll);
                
                players[currentPlayer] += diceRoll;
                
                if (ladder.containsKey(players[currentPlayer])) {
                    players[currentPlayer] = ladder.get(players[currentPlayer]);
                }
                
                if (snakes.containsKey(players[currentPlayer])) {
                    players[currentPlayer] = snakes.get(players[currentPlayer]);
                }
                
                if (players[currentPlayer] >= 100) {
                    System.out.println("Player " + (currentPlayer + 1) + " wins!");
                    gameWon = true;
                    break;
                }
                currentPlayer = (currentPlayer + 1) % num;
            }
        }
    }

