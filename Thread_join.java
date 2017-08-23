public class Thread_join extends Thread{

    public void run(){
                        for (int i=0;i<5;i++){
                         System.out.println(i);
                            try {
                                Thread.sleep(300);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
    }

    public static void main(String[] args) {
        Thread_join tj=new Thread_join();
        Thread_join tj1=new Thread_join();
        Thread_join tj2=new Thread_join();
        tj.start();
        try {
            tj.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            tj1.start();
            tj2.start();
    }
}
