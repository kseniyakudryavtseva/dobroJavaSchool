package lesson05;

public class Money {

    public int rub;
    public int penny;

    public Money(int rub, int penny) {
        this.rub = rub;
        this.penny = penny;
    }

    public Money plus(Money other) {
        int sum_rub = rub + other.rub;
        int sum_penny = penny + other.penny;
        if (sum_penny >= 100) {
            sum_rub++;
            sum_penny = sum_penny - 100;
        }
        return new Money(sum_rub, sum_penny);
    }

    public Money minus(Money other) {
        int result_rub = rub - other.rub;
        int result_penny = penny - other.penny;
        if (result_penny<0) {
            result_rub--;
            result_penny = penny + 100 - other.penny;
        }
        return new Money(result_rub, result_penny);
    }

    public Money multiply(int multiplier) {
        int result_rub = rub * multiplier;
        int result_penny = penny * multiplier;
        if ( result_penny>=100){
            int x = result_penny/100;
            result_rub = result_rub + x;
            result_penny = result_penny%100;
        }
        return new Money(result_rub, result_penny);
    }

    public void print() {
        System.out.println("rub = " + rub + ", penny = " + penny);
    }

    @Override
    public String toString() {
        return "Money{" +
                "rub=" + rub +
                ", penny=" + penny +
                '}';
    }
}
