public class IsEmptyCommand implements ConsoleCommand {
    Calculator calculator = new PerimetrCalculatorFactory().CreateCalculator();

    public IsEmptyCommand (Calculator calculator)
    {
        this.calculator =calculator;
    }


    public void execute() {
        System.out.println(calculator.isEmpty());
    }
    @Override
    public String toString() {
        return "'e'mpty";
    }

    public char getKey() {
        return 'e';
    }
}
