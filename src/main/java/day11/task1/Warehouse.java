package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int addPickedOrders(Picker picker) {
//        countPickedOrders = picker.getOrdersCount();
        countPickedOrders ++;
        return countPickedOrders;
    }

    public int addDeliveredOrders(Courier courier) {
//        countDeliveredOrders = courier.getOrdersCount();
        countDeliveredOrders ++;
        return countDeliveredOrders;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }
}
