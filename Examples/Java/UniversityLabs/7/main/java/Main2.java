public class Main2 {

    abstract class ConsoleCmd implements ConsoleCommand {
        /** Коллекция объектов {@linkplain Items} */
        protected Items items;
        /** Отображаемое название команды */
        private String name;
        /** Символ горячей клавиши команды */
        private char key;
        /** Инициализирует поля консольной команды
         * @param items {@linkplain ConsoleCmd#items}
         * @param name {@linkplain ConsoleCmd#name}
         * @param key {@linkplain ConsoleCmd#key}
         */
        ConsoleCmd(Items items, String name, char key) {
            this.items = items;
            this.name = name;
            this.key = key;
        }
        @Override
        public char getKey() {
            return key;
        }
        @Override
        public String toString() {
            return name;
        }
    }
    /** Устанавливает связь наблюдателей с наблюдаемыми объектами;
     * реализует диалог с пользователем
     */
    public  void run() {
        Items items = new Items();
        ItemsGenerator generator = new ItemsGenerator();
        ItemSorter sorter = new ItemSorter();
        items.addObserver( generator);
        items.addObserver(sorter);
        Menu menu = new Menu();
        menu.add(new ConsoleCmd(items, "'v'iew", 'v') {
            @Override
            public void execute() {

                System.out.println(items.getItems());
            }
        });
        menu.add(new ConsoleCmd(items, "'a'dd", 'a') {
            @Override
            public void execute() {
                items.add("hello");
            }
        });
        menu.add(new ConsoleCmd(items, "'a'dd", 'a') {
            @Override
            public void execute() {
                items.add("hello1");
            }
        });
        menu.add(new ConsoleCmd(items, "'a'dd", 'a') {
            @Override
            public void execute() {
                items.add("hello2");
            }
        });
                menu.add(new ConsoleCmd(items, "'d'el", 'd') {
            @Override
            public void execute() {
                items.del((int)Math.round(Math.random()*(items.getItems().size()-1)));
            }
        });
        menu.add(new ConsoleCmd(items, "'v'iew", 'v') {
            @Override
            public void execute() {

                System.out.println(items.getItems());
            }
        });

        menu.execute();
    }
    /** Выполняется при запуске программы
     * @param args параметры запуска программы
     */
    public static void main(String[] args) {
         Main2 m=new Main2();
        m.run();
    }
}
