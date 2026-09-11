class OrderPlacement extends Thread {
    public void run() {
        System.out.println("Order Placement Started");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Placing order step " + i);
        }
        System.out.println("Order Placed Successfully");
    }
}

class OrderDelivery extends Thread {
    public void run() {
        System.out.println("Order Delivery Started");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Delivery step " + i);
        }
        System.out.println("Order Delivered Successfully");
    }
}

class Main {
    public static void main(String[] args) {

        OrderPlacement t1 = new OrderPlacement();
        OrderDelivery t2 = new OrderDelivery();

        t1.start();
        t2.start();
    }
}