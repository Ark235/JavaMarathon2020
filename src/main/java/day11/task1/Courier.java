package day11.task1;

public class Courier implements Worker {
    private double salary;
    private boolean isPayed = false;
    private Warehouse warehouse;
//    private int ordersCount = 0;

    @Override
    public void doWork() {
        salary += 100;
//        ordersCount += 1;
        warehouse.addDeliveredOrders(this);
    }

    @Override
    public void bonus() {
        if (!isPayed && warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (!isPayed && warehouse.getCountDeliveredOrders() >= 1000) {
            salary += 50000;
            isPayed = true;
        } else System.out.println("Бонус уже был выплачен");
    }

    public double getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

//    public int getOrdersCount() {
//        return ordersCount;
//    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}
