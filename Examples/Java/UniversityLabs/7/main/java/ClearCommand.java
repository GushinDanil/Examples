public class ClearCommand implements ConsoleCommand{



    Calculator calculator = new PerimetrCalculatorFactory().CreateCalculator();

    public ClearCommand (Calculator calculator)
    {
        this.calculator =calculator;
    }


    public void execute() {
        calculator.clear();
    }
    @Override
    public String toString() {
        return "'c'lear";
    }

    public char getKey() {
        return 'c';
    }
}
