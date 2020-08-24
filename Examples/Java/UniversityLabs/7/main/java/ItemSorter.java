import java.util.Collections;

public class ItemSorter extends AnnotatedObserver{
    public static final String ITEMS_SORTED = "ITEMS_SORTED";
    /** Обработчик события {@linkplain Items#ITEMS_CHANGED};
     * извещает наблюдателей; шаблон Observer
     * @param observable наблюдаемый объект класса {@linkplain Items}
     * @see Observable
     */
    //@Event(Items.ITEMS_CHANGED  )
    public void itemsChanged(Items observable) {
        Collections.sort(observable.getItems());
        observable.call(ITEMS_SORTED);
    }

    /** Обработчик события {@linkplain Items}; шаблон Observer
     * @see Observable
     */
   // @Event(ITEMS_SORTED)
    public void itemsSorted() {
        itemsSorted();
    }

    /** Обработчик события {@linkplain Items}; шаблон Observer
     * @param observable наблюдаемый объект класса {@linkplain Items}
     * @see Observable
     */
   // @Event(ITEMS_SORTED)
    public void itemsSorted(Items observable) {
        System.out.println(observable.getItems());
    }
    /** Обработчик события {@linkplain Items#ITEMS_REMOVED}; шаблон Observer
     * @param observable наблюдаемый объект класса {@linkplain Items}
     * @see Observable
     */
   // @Event(Items.ITEMS_REMOVED)
    public void itemsRemoved(Items observable) {
        System.out.println(observable.getItems());
    }
}
