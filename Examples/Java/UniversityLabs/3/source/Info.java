import java.util.Scanner;

/**
 * The type Info.
 */
public class Info {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */




    public static void main(String[] args) {
        Specialty specialty = Specialty.Area;

        CalculatorFactory calculatorFactory = createCalculatorFactoryBySpecialty(specialty);
        Calculator calculator =calculatorFactory.CreateCalculator();



       Serializator serializator = new Serializator(calculator);
        Scanner sc=new Scanner(System.in);
        String exit;
        int item;

        System.out.println("1.Serialization");
        System.out.println("2.Deserialization");
        System.out.println("Input number or 'q' for exit.");
        while (!(exit = sc.next()).equals("q")) {
            try {
                item = Integer.parseInt(exit);

                switch (item) {
                    case 1:
                     int res=   calculator.Matematica(8, 12);
                     String binary=binarySystem(res);
                     int number=numberOfOnes(binary);




                        System.out.println(serializator.serialization());
                    break;






                    case 2:
                        if (specialty==Specialty.Perimetr)
                        {
                            CalculatorPerimetr calculatorPerimetr;

                            calculatorPerimetr = (CalculatorPerimetr) serializator.deserialization();
                            System.out.println(calculatorPerimetr.arrayList);
                        }
                        else if (specialty==Specialty.Area)
                        {
                            CalculatorArea calculatorArea;
                            calculatorArea=(CalculatorArea) serializator.deserialization();
                            System.out.println(calculatorArea.arrayList);
                        }




                    break;
                }
            } catch (NumberFormatException e) {
            System.out.println("Input number or 'q' for exit.");
        }
        }
    }

    public static CalculatorFactory createCalculatorFactoryBySpecialty(Specialty specialty)
    {
        if (specialty==Specialty.Perimetr)
        {
            return new PerimetrCalculatorFactory();
        }else if (specialty==Specialty.Area)
        {
            return new AreaCalculatorFactory();
        }

        return null;
    }
    enum Specialty
    {Perimetr,Area}
    public static String binarySystem(int i)
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
    public static int numberOfOnes(String s)
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