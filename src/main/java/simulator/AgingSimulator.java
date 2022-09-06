package simulator;

import info.AgingInfo;
import model.AgingResult;
import model.Sheltom;

import java.util.*;

import static info.AgingInfo.getAgingInfo;
import static info.AgingInfo.getAgingInfoSCO;

public class AgingSimulator {

    public int totalDeages = 0;
    public int totalSAS = 0;
    public int totalSCO = 0;
    private int startLevel;
    private int endLevel;

    private boolean useSAS = false;

    public List<Sheltom> sheltomsUsed = new ArrayList<Sheltom>();

    public AgingSimulator(int startLevel, int endLevel) {
        this.startLevel = startLevel;
        this.endLevel = endLevel;
    }

    public void age() {
        validate();
        int currentLevel = startLevel;
        while (currentLevel < endLevel) {
            if (currentLevel >= 6) {
                useSAS = true;
            } else {
                useSAS = false;
            }
            if (currentLevel >= 5) {
                if (useSAS)
                    totalSAS++;
                else
                    totalSCO++;
            }
            int toLevel = currentLevel + 1;
            AgingResult result = computeResult(toLevel);
            AgingInfo info = (useSAS ? getAgingInfo(toLevel) : getAgingInfoSCO(toLevel));
            sheltomsUsed.addAll(info.sheltoms);

            if (result.success) {
                currentLevel++;
            } else {
                currentLevel -= result.numberOfDeage;
                totalDeages += result.numberOfDeage;
            }
        }
    }

    private AgingResult computeResult(int toLevel) {
        AgingInfo info = (useSAS ? getAgingInfo(toLevel) : getAgingInfoSCO(toLevel));
        boolean success = isSuccess(info.chance);
        int deage = 0;
        if (!success) {
            deage = computeDeage();
        }
        return new AgingResult(success, deage);
    }

    private static boolean isSuccess(int chance) {
        int randomNumber = random(1, 100);
        if (1 <= randomNumber && randomNumber <= chance) {
            return true;
        }
        return false;
    }

    private int computeDeage() {
        int deageByTwoChance = 50;
        if (isSuccess(deageByTwoChance)) {
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
        if (!(0 <= startLevel && startLevel <= 19)) {
            throw new IllegalStateException("startLevel must be between 0 and 19");
        }
        if (!(1 <= endLevel && endLevel <= 20)) {
            throw new IllegalStateException("endLevel must be between 1 and 20");
        }
        if (!(startLevel < endLevel)) {
            throw new IllegalStateException("startLevel must be smaller than endLevel");
        }
    }
}
