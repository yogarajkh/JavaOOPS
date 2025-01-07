class MyThread extends Thread {
    String s;
    int n;

    public MyThread(String s, int n) {
        this.s = s;
        this.n = n;
    }

    public void run() {
        while (true) {
            System.out.println(s);
            try {
                Thread.sleep(n);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class BMS {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("BMS College of Engineering", 10000);
        MyThread t2 = new MyThread("CSE", 2000);
        t1.start();
        t2.start();
    }
}
