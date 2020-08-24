import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface Event {
    /** Аннотация времени
     * выполнения для
     * назначения
     * методам наблюдателя
     * конкретных событий
     * @author xone
     */
    @Retention(RetentionPolicy.RUNTIME)
    public  @interface Eventt {
        String value();
    }
}
