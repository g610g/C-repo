public class Multithread{
    public static void main(String[] args) {
        //creates 5 threads and execute the thread
        //i use the start method not the run method since the start method
        // properly intiaties a thread of execution which means that to properly 
        //execute or run the read and goes into its proper lifecycle
        for(int i = 0; i <= 5; i++){
            GonzalesMultithread mythread  = new GonzalesMultithread(i);
            mythread.start();
        }
        
    }
}