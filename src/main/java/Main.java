import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose 1 = rock, 2 = paper, 3 = Scissors");
        int player = input.nextInt();

        int computer = (int) (Math.random() * 3) + 1;

        if (player < 1 || player > 3) {
            System.out.println("Error: invalid choice!!");
            return;
        }

        System.out.println("Player chose: " + player + ", computer chose: " + computer);

        if (player == computer) {
            System.out.println("Draw");
        } else if ((player == 1 && computer == 3)
                || (player == 2 && computer == 1)
                || (player == 3 && computer == 2)) {
            System.out.println("You have won!");
        } else {
            System.out.println("You have lost");
        }
    }
}
