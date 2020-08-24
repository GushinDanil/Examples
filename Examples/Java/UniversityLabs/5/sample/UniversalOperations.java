package sample;

import java.io.Serializable;

public class UniversalOperations implements Serializable {

    public String binarySystem(int i)
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
     * numberOfOnes int.
     *
     * @param s the s
     * @return the int
     */
    public int numberOfOnes(String s)
    {
        int count1=0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='1')
            {
                ++count1;
            }

        }

        return count1;
    }
}
