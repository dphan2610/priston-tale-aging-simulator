import simulator.AgingBot;

public class Main {

    public static void main(String [] args) {
        AgingBot bot = new AgingBot(0, 20, 10000);
        bot.start();
        // SAS: superior aging stone
        System.out.println("Average SAS: " + bot.getAverageSASUsed());

        // SCO: superior copper ore
        System.out.println("Average SCO: " + bot.getAverageSCOUsed());
        bot.countAverageSheltoms();
    }
}
