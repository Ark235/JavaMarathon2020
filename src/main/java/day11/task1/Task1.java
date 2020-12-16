package day11.task1;

public class Task1 {
    public static void main(String[] args) {
    Warehouse wh1 = new Warehouse();
    Picker pick1 = new Picker(wh1);
    Courier c1 = new Courier(wh1);
    businessProcess(pick1);
    businessProcess(c1);
    System.out.println("Количество собранных заказов у первого сборщика " + pick1.getOrdersCount());
    System.out.println("Количество доставленных заказов у первого курьера " + c1.getOrdersCount());
    System.out.println("Количество собранных заказов на первом складе " + wh1.getCountPickedOrders());
    System.out.println("Количество доставленных заказов на первом складе " + wh1.getCountDeliveredOrders());
    System.out.println("ЗП сборщика на 1 складе " + pick1.getSalary());
    System.out.println("ЗП курьера на 1 складе " + c1.getSalary());

    System.out.println();

    Warehouse wh2 = new Warehouse();
    Picker pick2 = new Picker(wh2);
    Courier c2 = new Courier(wh2);
    pick2.doWork();
    c2.doWork();
    System.out.println("Количество собранных заказов у второго сборщика " + pick2.getOrdersCount());
    System.out.println("Количество доставленных заказов у второго курьера " + c2.getOrdersCount());
    System.out.println("Количество собранных заказов на втором складе " + wh2.getCountPickedOrders());
    System.out.println("Количество доставленных заказов на втором складе " + wh2.getCountDeliveredOrders());
    System.out.println("ЗП сборщика на 2 складе " + pick2.getSalary());
    System.out.println("ЗП курьера на 2 складе " + c2.getSalary());
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
