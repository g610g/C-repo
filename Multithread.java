public class Multithread{
    public static void main(String[] args) {
        //creates 5 threads and execute the thread
        //i use the start method not the run method
        for(int i = 0; i <= 5; i++){
            GonzalesMultithread mythread  = new GonzalesMultithread(i);
            mythread.start();
        }
        
    }
}