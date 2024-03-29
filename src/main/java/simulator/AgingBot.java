package simulator;

import model.Sheltom;

import java.util.*;

public class AgingBot {

    private List<Integer> eoaUsedList = new ArrayList<Integer>();
    private List<Integer> sasUsedList = new ArrayList<Integer>();
    private List<Integer> scoUsedList = new ArrayList<Integer>();
    private List<Integer> ssoUsedList = new ArrayList<Integer>();
    private List<List<Sheltom>> sheltomUsedList = new ArrayList<List<Sheltom>>();

    private int trials;
    private int startLevel;
    private int endLevel;

    public AgingBot(int startLevel, int endLevel, int trials) {
        this.trials = trials;
        this.startLevel = startLevel;
        this.endLevel = endLevel;
    }

    public void start() {
        for (int i = 0; i < trials; ++i) {
            AgingSimulator simulator = new AgingSimulator(startLevel, endLevel);
            simulator.age();

            eoaUsedList.add(simulator.totalEOA);
            sasUsedList.add(simulator.totalSAS);
            scoUsedList.add(simulator.totalSCO);
            ssoUsedList.add(simulator.totalSSO);
            sheltomUsedList.add(simulator.sheltomsUsed);
        }
    }

    private int computeAverage(List<Integer> list) {
        int total = 0;
        for (Integer i: list) {
            total += i;
        }
        return total / list.size();
    }

    public int getAverageSASUsed() {
        return computeAverage(sasUsedList);
    }

    public int getAverageEOAUsed() {
        return computeAverage(eoaUsedList);
    }

    public int getAverageSCOUsed() {
        return computeAverage(scoUsedList);
    }

    public int getAverageSSOUsed() {
        return computeAverage(ssoUsedList);
    }

    public void countAverageSheltoms() {
        Map<Sheltom, Integer> sheltomCounts = new TreeMap<Sheltom, Integer>();
        for (Sheltom s : Sheltom.values()) {
            int total = 0;
            for (List<Sheltom> list : sheltomUsedList) {
                total += Collections.frequency(list, s);
            }
            int average = total / sheltomUsedList.size();
            sheltomCounts.put(s, average);
        }
        System.out.println(sheltomCounts);
    }
}
