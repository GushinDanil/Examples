public interface Observer {
    /** Вызывается наблюдаемым объектом для каждого наблюдателя; шаблон Observer
     * @param observable ссылка на наблюдаемый объект
     * @param event информация о событии
     */
    public void handleEvent(Observable observable, Object event);
}
