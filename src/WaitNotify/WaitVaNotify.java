package WaitNotify;

public class WaitVaNotify {
    public static void main(String[] args){
        LuongB b = new LuongB();
        b.start();

        synchronized(b){
            try{
                System.out.println("Waiting for b to complete...");
                b.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("Total is: " + b.total);
        }
    }
}
