import org.junit.Assert;
import org.junit.Test;

/**
 * The type Test calculator.
 */
public class TestCalculator {
    /**
     * Test mat.
     */

    @Test
    public void TestMatOfPerimetr() {
        int result=0;
       Calculator calculator =new CalculatorPerimetr();


        result =calculator.Matematica(8,12);
        Assert.assertEquals(72,result);


        result =calculator.Matematica(8,6);
        Assert.assertEquals(51,result);


        result =calculator.Matematica(0,0);
        Assert.assertEquals(0,result);


        result =calculator.Matematica(-1,-8);
        Assert.assertEquals(0,result);
    }
    @Test
    public void TestMatOfArea() {
        int result=0;
        Calculator calculator =new CalculatorArea();


        result =calculator.Matematica(8,12);
        Assert.assertEquals(144,result);


        result =calculator.Matematica(8,6);
        Assert.assertEquals(72,result);


        result =calculator.Matematica(0,0);
        Assert.assertEquals(0,result);


        result =calculator.Matematica(-1,-8);
        Assert.assertEquals(0,result);
    }

    /**
     * Test count ones.
     */
    @Test
    public void TestCountOnes() {
       String result;
        UniversalOperations calculator =new CalculatorPerimetr();



       result= calculator.binarySystem(72);
       Assert.assertEquals("1001000",result);



        result= calculator.binarySystem(0);
        Assert.assertEquals("",result);



        result= calculator.binarySystem(1);
        Assert.assertEquals("1",result);


        result= calculator.binarySystem(7);
        Assert.assertEquals("111",result);


        result= calculator.binarySystem(1000);
        Assert.assertEquals("1111101000",result);

        result= calculator.binarySystem(2423);
        Assert.assertEquals("100101110111",result);

    }

    /**
     * Test count.
     */
    @Test
    public void TestCount()
    {
        int result;
        UniversalOperations calculator =new CalculatorPerimetr();


        result =calculator.numberOfOnes("1111");
        Assert.assertEquals(4,result);



        result =calculator.numberOfOnes("1110");
        Assert.assertEquals(3,result);

        result =calculator.numberOfOnes("1010");
        Assert.assertEquals(2,result);

        result =calculator.numberOfOnes("0010");
        Assert.assertEquals(1,result);

        result =calculator.numberOfOnes("0");
        Assert.assertEquals(0,result);

        result =calculator.numberOfOnes("1");
        Assert.assertEquals(1,result);


        result =calculator.numberOfOnes("1-+ 010");
        Assert.assertEquals(2,result);
    }

}
