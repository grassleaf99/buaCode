
package threaddemo;


public class RunableDemo implements Runnable{
    private int index;
    @Override
    public void run() {
        System.out.println("start Runable");
        for (int i = 0; i < 7; i++) {
            System.out.println("inside runable "+index++);
            try{
                Thread.sleep(600);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("the end runable");
    }
    
}
