public class LimitException extends Exception {

    private static Double remainingAmount = 0.0;
    public LimitException(String message, Double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public static Double getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(Double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }
}
