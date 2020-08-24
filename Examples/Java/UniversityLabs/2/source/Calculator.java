import java.io.Serializable;

/**
 * The type Calculator.
 */
public class Calculator implements Serializable {
private int count;
private transient int h=0;
private transient int side=0;

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Gets h.
     *
     * @return the h
     */
    public int getH() {
        return h;
    }

    /**
     * Sets h.
     *
     * @param h the h
     */
    public void setH(int h) {
        this.h = h;
    }

    /**
     * Gets side.
     *
     * @return the side
     */
    public int getSide() {
        return side;
    }

    /**
     * Sets side.
     *
     * @param side the side
     */
    public void setSide(int side) {
        this.side = side;
    }

    /**
     * Gets count.
     *
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * Count ones string.
     *
     * @param i the
     * @return the string
     */
    public String CountOnes(int i)
{

    String value="";
    if (i==0)
    {
        return value;
    }
            while(i!=1) {
                if (i % 2 == 0) {
                    value+="0";
                }
                 else {
                    value+="1";
                }
                i/=2;
            }
    value+="1";


    String reverse = new StringBuffer(value).reverse().toString();


return reverse;
}

    /**
     * Count int.
     *
     * @param s the s
     * @return the int
     */
    public int Count(String s)
{
    int count1=0;
    for (int i = 0; i <s.length() ; i++) {
        if (s.charAt(i)=='1')
        {
            ++count1;
        }

    }
    count=count1;
   return count1;
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

    return res ;
}



}
