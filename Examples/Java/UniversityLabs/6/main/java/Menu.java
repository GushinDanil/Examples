import java.util.ArrayList;

public class Menu implements Command {

ArrayList<Command> menu =new ArrayList<Command>();


public Command add(Command command)
{
    menu.add(command);
    return command;
}

    public void execute() {
        for (Command c:menu
             ) {

            c.execute();
        }
    }
}
