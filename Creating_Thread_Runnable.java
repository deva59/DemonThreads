package DemonThreads;
class thread123 implements  Runnable{
    public  void run(){
        System.out.println("Thread has been created ");
    }
}
class Creating_Thread_Runnable
{
    public static void main(String[] args) {
        thread123 th = new thread123();
        Thread ths = new Thread(th);
        ths.start();
    }
}
