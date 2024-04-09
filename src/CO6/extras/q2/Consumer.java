package CO6.extras.q2;

public class Consumer {
    private int consumerNo;
    private String consumerName;
    private int previousMonthReading;
    private int currentMonthReading;
    private String ebConnectionType;

    public Consumer(int consumerNo, String consumerName, int previousMonthReading, int currentMonthReading, String ebConnectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousMonthReading = previousMonthReading;
        this.currentMonthReading = currentMonthReading;
        this.ebConnectionType = ebConnectionType;
    }

    public double calculateBill() {
        int unitsConsumed = currentMonthReading - previousMonthReading;
        double amount = 0;

        if (ebConnectionType.equalsIgnoreCase("domestic")) {
            if (unitsConsumed <= 100) {
                amount = unitsConsumed * 1;
            } else if (unitsConsumed <= 200) {
                amount = 100 + (unitsConsumed - 100) * 2.5;
            } else if (unitsConsumed <= 500) {
                amount = 100 + 100 * 2.5 + (unitsConsumed - 200) * 4;
            } else {
                amount = 100 + 100 * 2.5 + 300 * 4 + (unitsConsumed - 500) * 6;
            }
        } else if (ebConnectionType.equalsIgnoreCase("commercial")) {
            if (unitsConsumed <= 100) {
                amount = unitsConsumed * 2;
            } else if (unitsConsumed <= 200) {
                amount = 100 * 2 + (unitsConsumed - 100) * 4.5;
            } else if (unitsConsumed <= 500) {
                amount = 100 * 2 + 100 * 4.5 + (unitsConsumed - 200) * 6;
            } else {
                amount = 100 * 2 + 100 * 4.5 + 300 * 6 + (unitsConsumed - 500) * 7;
            }
        }

        return amount;
    }

    public static void main(String[] args) {
        Consumer consumer1 = new Consumer(1, "Abrar", 100, 300, "domestic");
        System.out.println("Consumer 1 bill: " + consumer1.calculateBill());
    
        Consumer consumer2 = new Consumer(2, "Bakshay", 200, 800, "commercial");
        System.out.println("Consumer 2 bill: " + consumer2.calculateBill());
    }
}