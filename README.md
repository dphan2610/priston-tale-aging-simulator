# priston-tale-aging-simulator

A tool to get expected result for items upgrading in Priston Tale MMORPG.
```
    public static void main(String [] args) {
        AgingBot bot = new AgingBot(0, 15, 10000);
        bot.start();
        // SAS: super aging stone
        System.out.println("Average SAS: " + bot.getAverageSASUsed());
        bot.countAverageSheltoms();
    }
```

More information:<br/>
http://pristonworld.com/EPT/aging.html
