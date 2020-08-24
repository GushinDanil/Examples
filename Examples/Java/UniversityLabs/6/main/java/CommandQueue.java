
import java.util.Vector;

public class CommandQueue implements Queue {
private Vector<Command> tasks;

private boolean waiting;

private boolean shutdown;

public void shutDown()

{
    shutdown=true;
}

public CommandQueue()
{
    tasks =new Vector<Command>();
    waiting =false;
    new Thread(new Worker()).start();
}
    public void put(Command cmd) {
tasks.add(cmd);
if (waiting)
{
    synchronized (this){
        notifyAll();
    }
}
    }

    public Command take() {
    if (tasks.isEmpty())
    {
        synchronized (this)
        {
            waiting=true;
            try
            {
                try {
                    wait();
                } catch (InterruptedException e) {
                   waiting=false;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
        return (Command) tasks.remove(0);
    }

    private class Worker implements Runnable
    {

        public void run() {
while(!shutdown)
{
    Command r =take();
    r.execute();
}
        }
    }

}
