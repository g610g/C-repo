public class GonzalesMultithread extends Thread {
    

    private int id;
    public GonzalesMultithread(int i)
    {
        this.id = i;
    }
    //the run method is the entry point for a thread execution
    // also put the code that the thread should run
    @Override
    public void run(){
        //this thread will just loop 10 times and prints
        //the value of i each iteration
        for (int i = 1; i <= 10; i++ ){
            System.out.println(i + "from thread " + this.id);

            //a try-catch block for any error exception handling

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
     }
}
