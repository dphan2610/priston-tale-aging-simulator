import simulator.AgingBot;

public class Main {

    public static void main(String [] args) {
        AgingBot bot = new AgingBot(1, 21, 10000);
        bot.start();
        // SAS: superior aging stone
        System.out.println("Average SAS: " + bot.getAverageSASUsed());
        System.out.println("Average EOA: " + bot.getAverageEOAUsed());
        System.out.println("Average SSO: " + bot.getAverageSSOUsed());
        bot.countAverageSheltoms();
    }
}
