package sample;

public class GuiCalculatorFactory extends PerimetrCalculatorFactory {
    @Override
    public Calculator CreateCalculator() {
        return new GUICalculatorPerimetr();
    }
}
