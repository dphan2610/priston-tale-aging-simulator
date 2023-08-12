package simulator;

import info.AgingInfo;
import model.AgingResult;
import model.Sheltom;

import java.util.*;

import static info.AgingInfo.getAgingInfo;

public class AgingSimulator {

    public int totalDeages = 0;
    public int totalSAS = 0;
    public int totalEOA = 0;
    public int totalSCO = 0;
    public int totalSSO = 0; // Superior Silver Ore, for age >= 21
    private int startLevel;
    private int endLevel;

    private boolean useSAS = true;
    private boolean useEOA = false;

    public List<Sheltom> sheltomsUsed = new ArrayList<Sheltom>();

    public AgingSimulator(int startLevel, int endLevel) {
        this.startLevel = startLevel;
        this.endLevel = endLevel;
    }

    public void age() {
        validate();
        int currentLevel = startLevel;
        while (currentLevel < endLevel) {
            if (currentLevel >= 10) {
                useSAS = true;
            } else {
                useSAS = false;
            }
            if (currentLevel >= 10 && currentLevel < 20) {
                if (useEOA && currentLevel < 17)
                    totalEOA++;
                else if (useSAS)
                    totalSAS++;
                else
                    totalSCO++;
            } else if (currentLevel >= 20) {
                totalSSO++;
            }
            int toLevel = currentLevel + 1;
            AgingResult result = computeResult(toLevel);
            AgingInfo info = getAgingInfo(toLevel);
            sheltomsUsed.addAll(info.sheltoms);

            if (result.success) {
                currentLevel += result.numberOfSuccess;
            } else {
                currentLevel -= result.numberOfDeage;
                totalDeages += result.numberOfDeage;
            }
        }
    }

    private AgingResult computeResult(int toLevel) {
        AgingInfo info = getAgingInfo(toLevel);
        boolean success = (useEOA && toLevel <= 17 || isSuccess(info.successRate));
        int deage = 0;
        int numSuccess = 0;
        if (!success) {
            deage = computeDeage(info);
        } else {
            numSuccess = computeNumSuccess(info);
        }
        return new AgingResult(success, numSuccess, deage);
    }

    private boolean isSuccess(int chance) {
        int randomNumber = random(1, 100);
        if (1 <= randomNumber && randomNumber <= chance) {
            return true;
        }
        return false;
    }

    private int computeDeage(AgingInfo info) {
        int deageByTwoChance = info.minus2FailureRate;
        if (isSuccess(deageByTwoChance)) {
            return 2;
        }
        return 1;
    }

    private int computeNumSuccess(AgingInfo info) {
        if (isSuccess(info.plus2SuccessRate)) {
            return 2;
        }
        return 1;
    }

    private static int random(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    private void validate() {
        if (!(0 <= startLevel && startLevel <= 29)) {
            throw new IllegalStateException("startLevel must be between 0 and 29");
        }
        if (!(1 <= endLevel && endLevel <= 30)) {
            throw new IllegalStateException("endLevel must be between 1 and 30");
        }
        if (!(startLevel < endLevel)) {
            throw new IllegalStateException("startLevel must be smaller than endLevel");
        }
    }
}
