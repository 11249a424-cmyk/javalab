class Payment implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Payment Processing...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {

        Payment p = new Payment();

        Thread t = new Thread(p);

        t.start();
    }
}