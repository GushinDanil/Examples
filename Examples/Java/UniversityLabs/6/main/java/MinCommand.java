import java.util.concurrent.TimeUnit;

public class MinCommand implements Command ,Runnable {
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
    public MinCommand(Calculator calculator) {
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
        progress = 0;

        System.out.println("Min executed...");
        int size = calculator.getArray().size();
        result = 0;
        for (int idx = 1; idx < size; idx++) {
            if ((Integer)calculator.getArray().get(result) >
                    (Integer)calculator.getArray().get(idx)) {
                result = idx;
            }

            progress = idx * 100 / size;
            if (idx % (size / 3) == 0) {

                System.out.println("Min " + progress + "%");
            }
            try {

                TimeUnit.MILLISECONDS.sleep(3000 / size);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
        System.out.println("Min done. Item #" + result +
                " found: " +calculator.getArray().get(result));

        progress = 100;
    }

    public void run() {
        execute();
    }
    public boolean running() {
        return progress < 100;
    }
}