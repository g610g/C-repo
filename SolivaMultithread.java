
//thread class should be extended for this class to be a childClass of the thread Class and can perform in a thread manner
public class SolivaMultithread  extends Thread{
    

    
    private String name;
    public SolivaMultithread(String name)
    {
        this.name = name;
    }

    //the execution of this thread is only to print a name that is assigned on this thread
    @Override
    public void run()
    {
        System.out.println("Thread that runs on name  "   + this.name);
    }
}
