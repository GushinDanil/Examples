import java.io.Serializable;
import java.util.ArrayList;

/**
 * The type Calculator area.
 */
public class CalculatorArea extends UniversalOperations implements Calculator, Serializable {

    /**
     * The Array list.
     */
    public ArrayList<Integer> arrayList=new ArrayList<Integer>();


    public int Matematica(int h, int side) {
        if (h<0||side<0)
        {
            h=0;
            side=0;
        }



        double rectangular=h*side;
        double triangle=(h*side)/2;
        double sum= rectangular+triangle;


        String s=Double.toString(sum);

        s=  s.substring(0,s.indexOf('.'));
        Integer res=Integer.parseInt(s);
arrayList.add(res);
        return res ;
    }
}
