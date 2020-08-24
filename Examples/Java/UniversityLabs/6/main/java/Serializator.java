import java.io.*;

/**
 * The type Serializator.
 */
public class Serializator {
  private Calculator calculator;

    /**
     * Instantiates a new Serializator.
     *
     * @param calculator the calculator
     */
    public Serializator(Calculator calculator)
   {
       this.calculator=calculator;
   }

    /**
     * Serialization boolean.
     *
     * @return the boolean
     */
    public boolean serialization()
    {
        boolean operation=false;
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("Calculator.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(calculator);

            if (objectOutputStream!=null) {

                objectOutputStream.close();
                operation=true;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return operation;
        }

    /**
     * Deserialization calculator.
     *
     * @return the calculator
     */
    public Calculator deserialization()
    {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("Calculator.txt");
            ObjectInputStream objectInputStream =new ObjectInputStream(fileInputStream);
            Calculator calculat= (Calculator) objectInputStream.readObject();
            objectInputStream.close();

            return calculat;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

return null;
    }
}
