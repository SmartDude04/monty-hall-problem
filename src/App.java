public class App {
    public static void main(String[] args) throws Exception {
        // Set up variables
        double startTime = System.currentTimeMillis();

        int numWinsFalse = 0;
        int numLosesFalse = 0;
        int numWinsTrue = 0;
        int numLossesTrue = 0;
        // So you can easily change the amount
        int numTries = 1000000;

        // Try false
        for (int i = 0; i < numTries; i++)
        {
            if (MontyHallSim.runSim(false))
            {
                numWinsFalse++;
            }
            else
            {
                numLosesFalse++;
            }
        }

        System.out.println("When switching set to false:");
        System.out.println("Wins: " + numWinsFalse + " -- Losses: " + numLosesFalse);
        System.out.println("Win: " + ((double) numWinsFalse / numTries * 100) + "%");

        // Try true
        for (int i = 0; i < numTries; i++)
        {
            if (MontyHallSim.runSim(true))
            {
                numWinsTrue++;
            }
            else
            {
                numLossesTrue++;
            }
        }

        System.out.println("\n\nWhen switching set to true:");
        System.out.println("Wins: " + numWinsTrue + " -- Losses: " + numLossesTrue);
        System.out.println("Win: " + ((double) numWinsTrue / numTries * 100) + "%");

        double endTime = System.currentTimeMillis();

        System.out.println("Time: "+ (endTime - startTime));
    }
}