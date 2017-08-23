public class Thread_extend extends Thread{     //1st way-Thread can be created by extending the Thread Class
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread_extend rd=new Thread_extend();
        System.out.println("Hello..");
        rd.start();
        System.out.println("Hiiii");



    }
}