public class Item implements Comparable<Item>{
    /** Информационное поле */
    private String data;
    /** Инициализирует {@linkplain Item#data}
     * @param data значение для поля {@linkplain Item#data}
     */
    public Item(String data) {
        this.data = data;
    }
    /** Устанавливает поле {@linkplain Item#data}
     * @param data значение для поля {@linkplain Item#data}
     * @return значение поля {@linkplain Item#data}
     */
    public String setData(String data) {
        return this.data = data;
    }
    /** Возвращает поле {@linkplain Item#data}
     * @return значение поля {@linkplain Item#data}
     */
    public String getData() {
        return data;
    }

    public int compareTo(Item o) {
        return data.compareTo(o.data);
    }
    @Override
    public String toString() {
        return data;
    }
}
