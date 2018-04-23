import simulator.AgingBot;

public class Main {

    public static void main(String [] args) {
        AgingBot bot = new AgingBot(0, 15, 10000);
        bot.start();
        // SAS: super aging stone
        System.out.println("Average SAS: " + bot.getAverageSASUsed());
        bot.countAverageSheltoms();
    }
}
