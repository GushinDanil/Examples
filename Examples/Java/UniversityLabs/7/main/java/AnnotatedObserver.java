import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class AnnotatedObserver implements Observer {
    /** Ассоциативный массив обработчиков событий; содержит пары событие-обработчик */
    private Map<Object, Method> handlers = new HashMap<Object, Method>();
    /** Заполняет {@linkplain AnnotatedObserver#handlers} ссылками на методы,
     * отмеченные аннотацией {@linkplain Event}
     */
    public AnnotatedObserver() {
        for (Method m : this.getClass().getMethods()) {
            if (m.isAnnotationPresent(Event.Eventt.class)) {
                handlers.put(m.getAnnotation(Event.Eventt.class).value(), m);
            }
        }
    }

    public void handleEvent(Observable observable, Object event) {
        Method m = handlers.get(event);

        try {
            if (m != null) m.invoke(this, observable);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
