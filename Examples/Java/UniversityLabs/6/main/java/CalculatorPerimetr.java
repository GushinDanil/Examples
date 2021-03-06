import java.io.Serializable;
import java.util.ArrayList;

/**
 * The type Calculator.
 */
public class CalculatorPerimetr extends UniversalOperations implements Serializable ,Calculator{
public ArrayList<Integer> arrayList=new ArrayList<Integer>();
    public int insert(int a){
        arrayList.add(a);
        return arrayList.size();
    }
    public int delete(int index){
      return   arrayList.remove(index);
    }
    public boolean clear()
    {
       arrayList.clear();
        return  arrayList.isEmpty();
    }
    public boolean isEmpty(){
        return arrayList.isEmpty();
    }
    public int length()

    {
      return   arrayList.size();

    }
    /**
     * Matematica int.
     *
     * @param h    the h
     * @param side the side
     * @return the int
     */
    public int  Matematica( int h,int side)
{
    if (h<0||side<0)
    {
        h=0;
        side=0;
    }



double rectangular=(h*2)+(side*2);
double triangle=(Math.sqrt(Math.pow((side/2),2)+Math.pow(h,2)))*2+side;
   double sum= rectangular+triangle;


    String s=Double.toString(sum);

    s=  s.substring(0,s.indexOf('.'));
    Integer res=Integer.parseInt(s);
arrayList.add(res);
    return res ;
}

    public ArrayList getArray() {
        return arrayList;
    }


}
