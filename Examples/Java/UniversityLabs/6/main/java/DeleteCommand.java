public class DeleteCommand implements ConsoleCommand {
    Calculator calculator = new PerimetrCalculatorFactory().CreateCalculator();
    private  int a;
    public DeleteCommand (Calculator calculator,int a)
    {
        this.calculator =calculator;
        this.a=a;
    }
    public DeleteCommand (int a)
    {

        this.a=a;
    }

    public void execute() {
        calculator.delete(a);
    }

    @Override
    public String toString() {
        return "'d'elete";
    }

    public char getKey() {
        return 'd';
    }
}
