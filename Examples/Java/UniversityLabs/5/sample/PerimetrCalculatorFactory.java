package sample;

public class PerimetrCalculatorFactory implements CalculatorFactory {

    public Calculator CreateCalculator() {

        return new CalculatorPerimetr();

    }

}
