/**
 * The type Area calculator factory.
 */
public class AreaCalculatorFactory  implements CalculatorFactory{

    public Calculator CreateCalculator() {

        return new CalculatorArea();

    }

}
