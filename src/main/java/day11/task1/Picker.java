package day11.task1;

public class Picker implements Worker {
    private double salary;
    private boolean isPayed = false;
    private Warehouse warehouse;
//    private int ordersCount = 0;

    @Override
    public void doWork() {
        salary += 80;
//        ordersCount += 1;
        warehouse.addPickedOrders(this);
    }

    @Override
    public void bonus() {
        if (!isPayed && warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (!isPayed && warehouse.getCountPickedOrders() >= 1000) {
            salary += 70000;
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

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}
