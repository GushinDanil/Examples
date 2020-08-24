public class AvgCommand implements Command,Runnable {
    /**
     * Хранит результат обработки коллекции
     */
    private int result = 0;
private int progress=0;
    /**
     * Обслуживает коллекцию объектов
     */
    private Calculator calculator;

    /**
     * Возвращает поле
     *
     * @return значение
     */
    public Calculator getCalculator() {
        return calculator;
    }

    /**
     * Устанавливает поле
     *
     * @param calculator значение для
     * @return новое значение
     */
    public Calculator setCalculator(Calculator calculator) {
        return this.calculator = calculator;
    }

    /**
     * Инициализирует поле
     *
     * @param calculator объект класса
     */
    public AvgCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    /**
     * Возвращает результат
     *
     * @return поле
     */
    public int getResult() {
        return result;
    }



    /**
     * Используется обработчиком потока {@linkplain CommandQueue};
     * шаблон Worker Thread
     */

    public void execute() {

        System.out.println("Average executed...");

        result = 0;

        for (int i = 0; i < calculator.getArray().size(); i++) {
            result+=(Integer) calculator.getArray().get(i);
        }
        result=result/calculator.getArray().size();
        System.out.println(result);
    }

    public void run() {
        execute();
    }
    public boolean running() {
        return progress < 100;
    }
}
