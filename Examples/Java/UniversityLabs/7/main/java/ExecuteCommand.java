import java.util.concurrent.TimeUnit;


public class ExecuteCommand implements Command{

        /** Объект, реализующий интерфейс
         *  * обслуживает коллекцию объектов        */
        private Calculator calculator;
        /** Возвращает поле {@linkplain
         *  * @return значение {@linkplain        */
        public Calculator getView() {
            return calculator;
        }
        /** Устанавливает поле {@linkplaiw}

         * @return новое значение {@linkpview}
         */
        public Calculator setCalculator(Calculator calculator) {
            return this.calculator = calculator;
        }
/** Инициализирует поле
 * @param calculator объект, реализующий
 */
public ExecuteCommand(Calculator calculator) {
    this.calculator = calculator;
}

    public char getKey() {
        return 'e';
    }
    @Override
    public String toString() {
        return "'e'xecute";
    }

    public void execute() {

        CommandQueue queue1 = new CommandQueue();
        CommandQueue queue2 = new CommandQueue();

/**

 ExecutorService exec1 = Executors.newSingleThreadExecutor();
 ExecutorService exec2 = Executors.newSingleThreadExecutor();
 /**/
        MaxCommand maxCommand = new MaxCommand((CalculatorPerimetr) calculator);
        AvgCommand avgCommand = new AvgCommand((CalculatorPerimetr)calculator);
        MinCommand minCommand = new MinCommand((CalculatorPerimetr)calculator);
        System.out.println("Execute all threads...");

/**

 exec1.execute(minMaxCommand);
 exec2.execute(maxCommand);
 exec2.execute(avgCommand);
 /**/
        queue1.put(minCommand);
        queue2.put(maxCommand);
        queue2.put(avgCommand);

        /**/
        try {
            while (
                    maxCommand.running() ||
                    minCommand.running()) {
                TimeUnit.MILLISECONDS.sleep(100);
            }
/**

 exec1.shutdown();
 exec2.shutdown();
 /**/

            queue1.shutDown();
            queue2.shutDown();

            /**/

            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        System.out.println("All done.");
    }
}
