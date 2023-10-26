public class MontyHallSim {
    public static boolean runSim(boolean switchDoor)
    {
        int userChoice = (int) (Math.random() * 3 + 1);
        // Pick a random door: 1, 2, or 3
        int winDoor = (int) (Math.random() * 3 + 1);
        
        // System.out.println("Win: " + winDoor + "\nUser Choice: " + userChoice + "\nSwitch Doors: " + switchDoor);

        // --------------------------------
        // How this problem works:
        //      - The only case you would lose if you switched would be if you chose the door that had the prize to begin with. That is a 1/3 probability
        //      - The other 2/3 Probability would be for if you chose a door that did not have the price, and if you switched to the other one that probability stayed.
        // --------------------------------

        // return true or false for win or lose
        if (switchDoor)
        {
            if (userChoice == winDoor)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else if (userChoice == winDoor)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
