public class RewardValue { 
    double cash;
    int miles;

    RewardValue(double cash) {
        this.cash = cash;
        this.miles = (int)(cash / 0.0035);
    }

    RewardValue(int miles) {
        this.miles = miles;
        this.cash = miles * 0.0035;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }
}
