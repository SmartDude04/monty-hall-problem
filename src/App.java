import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // Pick a random door: 1, 2, or 3
        int winDoor = (int) (Math.random() * 3 + 1);
        
        // Prompt the user for a door (int)
        System.out.print("Welcome to Let's Make a Deal!\nPick a door, 1, 2, or 3: ");
        int userChoice = input.nextInt();
        
        // Open one of the other doors (see exercise notes)
        if (userChoice == winDoor)
        {
            int doorToReveal = (int) (Math.random() * 3 + 1);
            // If the door is the same as the users, you have to choose a random door that is NOT that door
            if (doorToReveal == userChoice)
            {
                int randDoorToShow = 3;
            }
        }
        
        // Prompt the user to see if they want to switch their
        // door choice (boolean)
        
        
        // Print out either: You win! or Sorry, you lose.
        input.close();
    }
}
