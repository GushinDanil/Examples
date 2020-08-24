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
        Calculator calculator=new Calculator();

        Serializator serializator=new Serializator(calculator);
       oper=  serializator.serialization();
        Assert.assertEquals(true,oper);
        System.out.println(calculator.Count(calculator.CountOnes(calculator.Matematica(8, 12))));


        Calculator calculator1 =new Calculator();
      calculator1=  serializator.deserialization();
      int i;
     i= calculator1.getCount();
        Assert.assertEquals(2,i);
    }


}
