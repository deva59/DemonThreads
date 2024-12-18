package DemonThreads;



class  firstThread extends Thread{
public  void run(){
        Thread.currentThread().setName("First");
        System.out.println("Thread Name is "+Thread.currentThread().getName());
        }
        }

class secondThread extends  Thread{
    public void run(){
        Thread.currentThread().setName("Second");
        System.out.println("Thread Name is "+Thread.currentThread().getName());
    }
}


class ThirdThred extends  Thread{
    public void run(){
        Thread.currentThread().setName("Third");
        System.out.println("Thread Name is "+Thread.currentThread().getName());
    }
}


public class ThreadPrioritys {
    public static void main(String[] args) {
        firstThread ff = new firstThread();
        secondThread th = new secondThread();
        ThirdThred tf = new ThirdThred();


        tf.setPriority(Thread.MAX_PRIORITY);
        ff.setPriority(Thread.MIN_PRIORITY);
        th.setPriority(Thread.NORM_PRIORITY);

        System.out.println("Priority of first Thread "+ ff.getPriority());
        System.out.println("Priority of first Thread "+ th.getPriority());
        System.out.println("Priority of first Thread "+ tf.getPriority());


        tf.start();
        ff.start();
        th.start();
    }
}
