
package threaddemo;


public class Main {
    public static void main(String[] args) {
        System.out.println("Start Main");
        for (int i = 0; i < 4; i++) {
            System.out.println("indise main");
            try{
                Thread.sleep(400);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            
        }
        //run Thread
            ThreadDemo t=new ThreadDemo("Cooking");
            //uu tien
            
            //t.setDaemon(true);
            t.start();
            try{
               t.join();
            }catch(InterruptedException e){
                System.out.println(e);
            }
         //run Runnable
         RunableDemo r=new RunableDemo();
         Thread t1=new Thread(r);
         t1.start();
         
        System.out.println("Stop main");
    }
    
}
