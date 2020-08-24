public class InsertCommand implements ConsoleCommand {
    Calculator calculator = new PerimetrCalculatorFactory().CreateCalculator();
private  int a;
    public InsertCommand (Calculator calculator, int a)
    {
        this.calculator =calculator;
        this.a=a;
    }
    public InsertCommand (int a)
    {

        this.a=a;
    }


    public void execute() {
calculator.insert(a);
    }

    @Override
    public String toString() {
        return "'i'nsert";
    }

    public char getKey() {
        return 'i';
    }
}
