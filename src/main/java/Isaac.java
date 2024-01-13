import java.util.Random;
import java.util.Scanner;

public class Isaac {    
    public static void main(String[] args) {

        Squirt squirt = new Squirt();
        Player player = new Player();

        boolean game = true;
        boolean start = true;
        boolean roll = false;
        boolean win = false;

        long startTime = System.currentTimeMillis();

        Random random = new Random();

        String input = "";

        Scanner scanner = new Scanner(System.in);

        while (game) {

            while (start) {
                System.out.println("squirt appeard");
                System.out.println("roll dice..");
                input = scanner.nextLine();
                if (input.equals("roll")) {
                    start = false;
                    roll = true;
                }
            }

            while (roll) {
                int rollValue;
                System.out.println("you roll a " + (rollValue = random.nextInt(6) + 1));
                if (rollValue >= squirt.getRoll()) {
                    squirt.setHealth(squirt.getHealth() - player.getAttack());
                } else {
                    player.setHealth(player.getHealth() - squirt.getAttack());
                }

                System.out.println("player health: " + player.health);
                System.out.println("squirt health: " + squirt.health);

                if (player.health == 0) {
                    game = false;
                    roll = false;
                    System.out.println("You died! You must pay the death penalty. Give one cent! Give one loot! Give one item!");
                }

                if (squirt.health == 0) {
                    win = true;
                    game = false;
                    roll = false;
                    System.out.println("Squirt died. Loot one!");
                }

                if(game) {
                    input = scanner.nextLine();
                }
            }

            if (win) {
                System.out.println("You won the game! Well done!");
            }
        }

        System.out.println("Game over!");
    }

    static class Squirt {
        int health = 2;
        int roll = 3;
        int attack = 1;

        int getHealth() {
            return this.health;
        }

        int getRoll() {
            return this.roll;
        }

        int getAttack() {
            return this.attack;
        }

        void setHealth(int health) {
            this.health = health;
        }
    }

    static class Player {
        int health = 2;
        int attack = 1;

        int getHealth() {
            return this.health;
        }

        int getAttack() {
            return this.attack;
        }

        void setHealth(int health) {
            this.health = health;
        }
    }
}