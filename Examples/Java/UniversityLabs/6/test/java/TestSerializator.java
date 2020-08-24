import org.junit.Assert;
import org.junit.Test;

/**
 * The type Test serializator.
 */
public class TestSerializator {

    /**
     * Test serialization.
     */
    @Test
    public void TestSerialization()
    {
        boolean oper;
        CalculatorPerimetr calculator=new CalculatorPerimetr();

        Serializator serializator=new Serializator(calculator);
       oper=  serializator.serialization();
        Assert.assertEquals(true,oper);
        System.out.println(calculator.numberOfOnes(calculator.binarySystem(calculator.Matematica(8, 12))));


//        CalculatorPerimetr calculator1 =new CalculatorPerimetr();
//      calculator1=  serializator.deserialization();
//      int i;
//     i= calculator1.getCount();
//        Assert.assertEquals(2,i);
    }


}
