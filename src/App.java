import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // Pick a random door: 1, 2, or 3
        int winDoor = (int) (Math.random() * 3 + 1);
        int firstNonPrize;
        int secondNonPrize;

        if (winDoor == 1)
        {
            firstNonPrize = 2;
            secondNonPrize = 3;
        }
        else if (winDoor == 2)
        {
            firstNonPrize = 1;
            secondNonPrize = 3;
        }
        else
        {
            firstNonPrize = 1;
            secondNonPrize = 2;
        }
        
        // Prompt the user for a door (int)
        System.out.print("Welcome to Let's Make a Deal!\nPick a door, 1, 2, or 3: ");
        int userChoice = input.nextInt();
        
        // Open one of the other doors (see exercise notes)
        System.out.println("You picked door " + userChoice);

        // If they picked the prize door
        if (userChoice == winDoor)
        {
            int randDoorToShow = (int) (Math.random() * 2);
            if (randDoorToShow == 0) // Pick first non-prize door
            {
                System.out.println("I opened door " + firstNonPrize);
            }
            else // Pick second non-prize door
            {
                System.out.println("I opened door " + secondNonPrize);
            }

        }
        else // If they picked one of the non-prize doors, show them the other non-prize door
        {
            if (userChoice == firstNonPrize)
            {
                System.out.println("I opened door " + secondNonPrize);
            }
            else
            {
                System.out.println("I opened door " + firstNonPrize);
            }
        }
        
        // Prompt the user to see if they want to switch their
        // door choice (boolean)
        System.out.print("Switch doors (true or false): ");
        boolean switchDoor = input.nextBoolean();
        
        // Print win or lose
        
        // ----------------------------------------------
        // This is why you have a better chance after choosing! The selection is between two different items
        // ----------------------------------------------

        if (switchDoor)
        {
            if (userChoice == winDoor)
            {
                System.out.println("Sorry, you lose.");
            }
            else
            {
                System.out.println("You win!");
            }
        }
        else if (userChoice == winDoor)
        {
            System.out.println("You win!");
        }
        else
        {
            System.out.println("Sorry, you lose.");
        }

        // Close input
        input.close();
    }
}