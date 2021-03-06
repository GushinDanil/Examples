import java.io.Serializable;
import java.util.ArrayList;

public class CalculatorArea extends UniversalOperations implements Calculator, Serializable {

    public ArrayList<Integer> arrayList=new ArrayList<Integer>();
    public int insert(int a){
        arrayList.add(a);
        return arrayList.size();
    }
    public int delete(int index){
       return arrayList.remove(index);
    }
    public boolean clear()
    {
        arrayList.clear();
        return  arrayList.isEmpty();
    }
    public boolean isEmpty(){
        return arrayList.isEmpty();
    }


    public int length() {
        return arrayList.size();
    }

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

    public ArrayList getArray() {
        return arrayList;
    }


}
