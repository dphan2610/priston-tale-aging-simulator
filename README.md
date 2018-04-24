# priston-tale-aging-simulator

A tool to get expected result for items aging (upgrading) in Priston Tale MMORPG.<br/>
Interesting fact: Item upgrading could fail, and when it does, it is downgraded by 1 or 2 level. Chance of failing increases as item level gets higher. A possible sequence of item level when trying to upgrade from 10 to 14 would look like:<br/>
10->11->12->11->12->13->12->10->9->10->11->12->13->14

Another possible sequence:<br/>
10->11->12->13->12->13->14

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
