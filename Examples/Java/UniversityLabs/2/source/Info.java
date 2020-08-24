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
        Calculator calculator = new Calculator();
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

                        System.out.println(calculator.Matematica(8, 12));
                        System.out.println(calculator.CountOnes(calculator.Matematica(8, 12)));
                        System.out.println(calculator.Count(calculator.CountOnes(calculator.Matematica(8, 12))));


                        System.out.println(serializator.serialization());
                    break;






                    case 2:
                        Calculator d = serializator.deserialization();
                        System.out.println(d.getCount());

                    break;
                }
            } catch (NumberFormatException e) {
            System.out.println("Input number or 'q' for exit.");
        }
        }
    }
}