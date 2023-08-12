package info;

import model.Sheltom;

import java.util.Arrays;
import java.util.List;

import static model.Sheltom.*;
import static model.Sheltom.BELLUM;
import static model.Sheltom.ORDO;

public class AgingInfo {

    public List<Sheltom> sheltoms;
    public int chance;

    public AgingInfo(List<Sheltom> sheltoms, int chance) {
        this.sheltoms = sheltoms;
        this.chance = chance;
    }

    public static AgingInfo getAgingInfo(int level) {
        if (level == 1) {
            return new AgingInfo(
                    list(FADEO, FADEO, SPARKY, SPARKY, RAIDENT),
                    100);
        }
        if (level == 2) {
            return new AgingInfo(
                    list(FADEO, FADEO, SPARKY, SPARKY, RAIDENT, RAIDENT),
                    100);
        }
        if (level == 3) {
            return new AgingInfo(
                    list(FADEO, FADEO, SPARKY, SPARKY, RAIDENT, RAIDENT, TRANSPARO),
                    100);
        }
        if (level == 4) {
            return new AgingInfo(
                    list(FADEO, FADEO, SPARKY, SPARKY, RAIDENT, RAIDENT, TRANSPARO, TRANSPARO),
                    100);
        }
        if (level == 5) {
            return new AgingInfo(
                    list(FADEO, FADEO, SPARKY, SPARKY, RAIDENT, RAIDENT, TRANSPARO, TRANSPARO, MURKY),
                    100);
        }
        if (level == 6) {
            return new AgingInfo(
                    list(FADEO, FADEO, SPARKY, SPARKY, RAIDENT, RAIDENT, TRANSPARO, TRANSPARO, MURKY, MURKY),
                    100);
        }
        if (level == 7) {
            return new AgingInfo(
                    list(FADEO, FADEO, SPARKY, SPARKY, RAIDENT, RAIDENT, TRANSPARO, TRANSPARO, MURKY, MURKY, DEVINE),
                    100);
        }
        if (level == 8) {
            return new AgingInfo(
                    list(FADEO, FADEO, SPARKY, SPARKY, RAIDENT, RAIDENT, TRANSPARO, TRANSPARO, MURKY, MURKY, DEVINE, DEVINE),
                    100);
        }
        if (level == 9) {
            return new AgingInfo(
                    list(SPARKY, SPARKY, RAIDENT, RAIDENT, TRANSPARO, TRANSPARO, MURKY, MURKY, DEVINE, DEVINE, CELESTO),
                    100);
        }
        if (level == 10) {
            return new AgingInfo(
                    list(SPARKY, SPARKY, RAIDENT, RAIDENT, TRANSPARO, TRANSPARO, MURKY, MURKY, DEVINE, DEVINE, CELESTO, CELESTO),
                    100);
        }
        if (level == 11) {
            return new AgingInfo(
                    list(RAIDENT, RAIDENT, TRANSPARO, TRANSPARO, MURKY, MURKY, DEVINE, DEVINE, CELESTO, CELESTO, MIRAGE),
                    100);
        }
        if (level == 12) {
            return new AgingInfo(
                    list(RAIDENT, RAIDENT, TRANSPARO, TRANSPARO, MURKY, MURKY, DEVINE, DEVINE, CELESTO, CELESTO, MIRAGE, MIRAGE),
                    98);
        }
        if (level == 13) {
            return new AgingInfo(
                    list(TRANSPARO, TRANSPARO, MURKY, MURKY, DEVINE, DEVINE, CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA),
                    90);
        }
        if (level == 14) {
            return new AgingInfo(
                    list(TRANSPARO, TRANSPARO, MURKY, MURKY, DEVINE, DEVINE, CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA, INFERNA),
                    83);
        }
        if (level == 15) {
            return new AgingInfo(
                    list(MURKY, MURKY, DEVINE, DEVINE, CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA, INFERNA, ENIGMA),
                    75);
        }
        if (level == 16) {
            return new AgingInfo(
                    list(MURKY, MURKY, DEVINE, DEVINE, CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA, INFERNA, ENIGMA, ENIGMA),
                    68);
        }
        if (level == 17) {
            return new AgingInfo(
                    list(DEVINE, DEVINE, CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA, INFERNA, ENIGMA, ENIGMA, BELLUM),
                    57);
        }
        if (level == 18) {
            return new AgingInfo(
                    list(DEVINE, DEVINE, CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA, INFERNA, ENIGMA, ENIGMA, BELLUM, BELLUM),
                    47);
        }
        if (level == 19) {
            return new AgingInfo(
                    list(CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA, INFERNA, ENIGMA, ENIGMA, BELLUM, BELLUM, ORDO),
                    36);
        }
        if (level == 20) {
            return new AgingInfo(
                    list(CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA, INFERNA, ENIGMA, ENIGMA, BELLUM, BELLUM, ORDO, ORDO),
                    26);
        }
        if (level == 21) {
            return new AgingInfo(
                    list(CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA, INFERNA, ENIGMA, ENIGMA, BELLUM, BELLUM, ORDO, ORDO),
                    20);
        }
        if (level == 22) {
            return new AgingInfo(
                    list(CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA, INFERNA, ENIGMA, ENIGMA, BELLUM, BELLUM, ORDO, ORDO),
                    18);
        }
        if (level == 23) {
            return new AgingInfo(
                    list(CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA, INFERNA, ENIGMA, ENIGMA, BELLUM, BELLUM, ORDO, ORDO),
                    16);
        }
        if (level == 24) {
            return new AgingInfo(
                    list(CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA, INFERNA, ENIGMA, ENIGMA, BELLUM, BELLUM, ORDO, ORDO),
                    14);
        }
        if (level == 25) {
            return new AgingInfo(
                    list(CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA, INFERNA, ENIGMA, ENIGMA, BELLUM, BELLUM, ORDO, ORDO),
                    12);
        }
        throw new IllegalArgumentException("unknown ageToLevel: " + level);
    }

    public static AgingInfo getAgingInfoSCO(int level) {
        if (level == 1) {
            return new AgingInfo(
                    list(FADEO, FADEO, SPARKY, SPARKY, RAIDENT),
                    100);
        }
        if (level == 2) {
            return new AgingInfo(
                    list(FADEO, FADEO, SPARKY, SPARKY, RAIDENT, RAIDENT),
                    100);
        }
        if (level == 3) {
            return new AgingInfo(
                    list(FADEO, FADEO, SPARKY, SPARKY, RAIDENT, RAIDENT, TRANSPARO),
                    100);
        }
        if (level == 4) {
            return new AgingInfo(
                    list(FADEO, FADEO, SPARKY, SPARKY, RAIDENT, RAIDENT, TRANSPARO, TRANSPARO),
                    100);
        }
        if (level == 5) {
            return new AgingInfo(
                    list(FADEO, FADEO, SPARKY, SPARKY, RAIDENT, RAIDENT, TRANSPARO, TRANSPARO, MURKY),
                    100);
        }
        if (level == 6) {
            return new AgingInfo(
                    list(FADEO, FADEO, SPARKY, SPARKY, RAIDENT, RAIDENT, TRANSPARO, TRANSPARO, MURKY, MURKY),
                    97);
        }
        if (level == 7) {
            return new AgingInfo(
                    list(FADEO, FADEO, SPARKY, SPARKY, RAIDENT, RAIDENT, TRANSPARO, TRANSPARO, MURKY, MURKY, DEVINE),
                    97);
        }
        if (level == 8) {
            return new AgingInfo(
                    list(FADEO, FADEO, SPARKY, SPARKY, RAIDENT, RAIDENT, TRANSPARO, TRANSPARO, MURKY, MURKY, DEVINE, DEVINE),
                    93);
        }
        if (level == 9) {
            return new AgingInfo(
                    list(SPARKY, SPARKY, RAIDENT, RAIDENT, TRANSPARO, TRANSPARO, MURKY, MURKY, DEVINE, DEVINE, CELESTO),
                    93);
        }
        if (level == 10) {
            return new AgingInfo(
                    list(SPARKY, SPARKY, RAIDENT, RAIDENT, TRANSPARO, TRANSPARO, MURKY, MURKY, DEVINE, DEVINE, CELESTO, CELESTO),
                    85);
        }
        if (level == 11) {
            return new AgingInfo(
                    list(RAIDENT, RAIDENT, TRANSPARO, TRANSPARO, MURKY, MURKY, DEVINE, DEVINE, CELESTO, CELESTO, MIRAGE),
                    85);
        }
        if (level == 12) {
            return new AgingInfo(
                    list(RAIDENT, RAIDENT, TRANSPARO, TRANSPARO, MURKY, MURKY, DEVINE, DEVINE, CELESTO, CELESTO, MIRAGE, MIRAGE),
                    80);
        }
        if (level == 13) {
            return new AgingInfo(
                    list(TRANSPARO, TRANSPARO, MURKY, MURKY, DEVINE, DEVINE, CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA),
                    75);
        }
        if (level == 14) {
            return new AgingInfo(
                    list(TRANSPARO, TRANSPARO, MURKY, MURKY, DEVINE, DEVINE, CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA, INFERNA),
                    70);
        }
        if (level == 15) {
            return new AgingInfo(
                    list(MURKY, MURKY, DEVINE, DEVINE, CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA, INFERNA, ENIGMA),
                    65);
        }
        if (level == 16) {
            return new AgingInfo(
                    list(MURKY, MURKY, DEVINE, DEVINE, CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA, INFERNA, ENIGMA, ENIGMA),
                    55);
        }
        if (level == 17) {
            return new AgingInfo(
                    list(DEVINE, DEVINE, CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA, INFERNA, ENIGMA, ENIGMA, BELLUM),
                    45);
        }
        if (level == 18) {
            return new AgingInfo(
                    list(DEVINE, DEVINE, CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA, INFERNA, ENIGMA, ENIGMA, BELLUM, BELLUM),
                    35);
        }
        if (level == 19) {
            return new AgingInfo(
                    list(CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA, INFERNA, ENIGMA, ENIGMA, BELLUM, BELLUM, ORDO),
                    15);
        }
        if (level == 20) {
            return new AgingInfo(
                    list(CELESTO, CELESTO, MIRAGE, MIRAGE, INFERNA, INFERNA, ENIGMA, ENIGMA, BELLUM, BELLUM, ORDO, ORDO),
                    7);
        }
        throw new IllegalArgumentException("unknown ageToLevel: " + level);
    }

    private static List<Sheltom> list(Sheltom... sheltoms) {
        return Arrays.asList(sheltoms);
    }
}
