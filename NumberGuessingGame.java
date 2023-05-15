import java.util.Scanner;
public class NumberGuess
{
    public static void main(String args[])
    {
        int attempt = 1;
        int userGuessNumber = 0;
        int secretNumber = (int) (Math.random() * 99 + 1);
        Scanner userInput = new Scanner(System.in);
        System.out.println("Guess Number Game \nGuess A Number To Win This Game \nYou have Maximum 3 Attempt");
        do {
            System.out.print("Enter a guess number between 1 to 100\n");
            if(userInput.hasNextInt()) {
                userGuessNumber = userInput.nextInt();
                if (userGuessNumber == secretNumber)
                {
                    System.out.println("Yesss!!!!, Your Number is Correct. You Win the Game!");
                    break;
                }
                else if (userGuessNumber < secretNumber)
                    System.out.println("Your Guess Number is Smaller.");
                else if (userGuessNumber > secretNumber)
                    System.out.println("Your Guess Number is Greater.");
                if(attempt == 3) {
                    System.out.println("You have exceeded the maximum attempt. Try Again");
                    break;
                }
                attempt++;
            }else {
                System.out.println("Enter a Valid Integer Number");
                break;
            }
        } while (userGuessNumber != secretNumber);
    }
}
