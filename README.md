# priston-tale-aging-simulator

A tool to get expected result for items upgrading in Priston Tale MMORPG.
```
    public static void main(String [] args) {
        int itemStartLevel = 0;
        int itemEndLevel = 15;
        int numberOfSimulation = 10000;
        AgingBot bot = new AgingBot(itemStartLevel, itemEndLevel, numberOfSimulation);
        bot.start();
        // SAS: super aging stone
        System.out.println("Average SAS: " + bot.getAverageSASUsed());
        bot.countAverageSheltoms();
    }
```

More information:<br/>
http://pristonworld.com/EPT/aging.html
