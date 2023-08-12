package model;

public class AgingResult {

    public boolean success;
    public int numberOfSuccess;
    public int numberOfDeage;

    public AgingResult(boolean success, int numberOfSuccess, int numberOfDeage) {
        this.success = success;
        this.numberOfSuccess = numberOfSuccess;
        this.numberOfDeage = numberOfDeage;
    }
}
