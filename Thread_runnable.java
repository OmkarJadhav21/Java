public class Thread_runnable implements Runnable  {
    public void run(){
        System.out.println("firstll;;");
    }

    public static class Inner1 extends Thread{ //Innner class cannot be Static.this is not inner class
        public void run(){
            System.out.println("newwww");
        }

    }
    public static void main(String[] args) {
        Thread_runnable tr=new Thread_runnable();
        Inner1 t2=new Inner1();

        Thread t1=new Thread(tr);

        System.out.println("Hello..");
        t1.start();
        System.out.println("Hiiii");


       t2.start();


    }


}
