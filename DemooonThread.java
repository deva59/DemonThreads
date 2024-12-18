package DemonThreads;

import javax.imageio.stream.ImageInputStream;

public class DemooonThread extends Thread{
    public void run()
    {

        if(Thread.currentThread().isDaemon())
            System.out.println(" The daemon Thread is executing");
        else
            System.out.println(" The user Thread is executing");

    }

    public static void main(String[] args) {
        DemooonThread dd = new DemooonThread();
        DemooonThread dd1 = new DemooonThread();
          dd.setDaemon(true);
          dd1.setDaemon(true);
        dd.start();
        dd1.start();
    }

}
