package 线程;

public class Dome02 {

    public static void main(String[] args) {
        // 先创建自己编写的实例
        DomeT2 d2 = new DomeT2();
        // 再创建一个线程的实例
        Thread t = new Thread(d2);
        t.setName("runnable");
        t.start();

    }

    static class DomeT2 implements Runnable{
        int some;
        @Override
        public void run() {
            while (some<10){
                long l = System.currentTimeMillis();
                System.out.println(l+"\t"+Thread.currentThread().getName()+some++);

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
