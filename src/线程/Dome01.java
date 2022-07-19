package 线程;

public class Dome01 {
//Thread.currentThread()  获取当前线程的信息
    public static void main(String[] args) {
        DomeT dt = new DomeT();
        dt.setName("创建的名字");
        dt.start();
    }


    // 创建一个内部类
    static class DomeT extends Thread{

        private int some;


        //线程要执行的任务写在run方法种
        @Override
        public void run() {
            System.out.println("继承thread的线程启动");
            while (some<10){
                System.out.println(Thread.currentThread().getName()+"输出的数"+some++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}


