public class Application {

    private static Application application =new Application();

 private  static Calculator calculator = new PerimetrCalculatorFactory().CreateCalculator();
    private Application()
    {

    }

    public static synchronized Application getInstance()
    {

        return  application;
    }
    public void run()
    {

Menu menu =new Menu();
menu.add(new IsEmptyCommand(calculator));
menu.add(new InsertCommand(calculator,12));
menu.add(new InsertCommand(calculator,1));
menu.add(new InsertCommand(calculator,3));
menu.add(new InsertCommand(calculator,37));

menu.add(new ExecuteCommand(calculator));
menu.execute();
    }

}
