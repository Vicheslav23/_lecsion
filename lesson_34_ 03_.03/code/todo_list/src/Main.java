import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Список дел");
        // TODO LIST - список дел
        // Меню:
        // - добавить запись
        // - посмотреть записи
        // - удалить запись (по номеру)
        // - выйти
        enum Menu {
            ADD,
            PRINT,
            DELETE,
            EXIT,
        }
        List<String> todoList = new ArrayList<>(); // инициируем лист для списка задач

        while (true){ // начало цикла работы с пользователем

            // печатаем меню

            for (Menu myMenu: Menu.values()) {
                System.out.print(myMenu + " | ");
            }
            System.out.println();
            System.out.println("Выберите, что надо сделать: нажмите 1, 2, 3 или 4");

            int choice = readMenuChoice(); // что выбрал пользователь считаем в методе readMenuChoice
                                           // метод прописан внизу - public static int readMenuChoice()
            Menu myMenu = Menu.ADD; // начальное значение выбора меню

            // выбор пользователя опции из меню
            switch (choice) {
                case 1: {
                    myMenu = Menu.ADD;
                    add_task(todoList); // вызов метода, который добавляет задачу в список
                                        // метод прописан внизу - public static void add_task
                    print_tasks (todoList);
                    break;
                }
                case 2: {
                    myMenu = Menu.PRINT; // вызов метода, который печатает список задач
                                         // метод прописан внизу - public static void print_tasks
                    print_tasks (todoList); // вызываем метод
                    break;
                }
                case 3: {
                    myMenu = Menu.DELETE; // вызов метода, который удаляет задачу из списка
                                          // метод прописан внизу - public static void remove_task
                    remove_task(todoList); // вызываем метод
                    break;
                }
                case 4: {
                    myMenu = Menu.EXIT;
                    System.out.println("До свидания!");
                    return;
                    }
                default: {
                        System.out.println("Введите число 1, 2, 3 или 4");
                }
            }
        }
    }
    // метод добавляет задачу в список
    public static void add_task (List<String> tasks) {
        System.out.println("Введите задачу: ");
        Scanner sc = new Scanner(System.in);
        String task = sc.nextLine(); // считали строку с задачей
        tasks.add(task); // в список tasks вносим методом add новое значение
    }
    // метод печатает список задач
    public static void print_tasks(List<String> tasks) {
        for (int i = 0; i < tasks.size(); i++) { // пока не закончится размер массива
            int n = i + 1; // задаем номер задачи в списке
            System.out.println(n + ". " + tasks.get(i)); // печатаем номер n и текст задачи tasks.get(i)
                                                         // берем по одному элементу (i)
        }
        if (tasks.size() == 0) {
            System.out.println("Задач нет, начните их добавлять.");
        }
    }
    // метод удаляет задачу из списка по ее номеру
    public static void remove_task(List<String> tasks) {
        System.out.println("Выберите номер задачи для удаления: ");
        Scanner sc = new Scanner(System.in);
        int task_num = sc.nextInt();
//        --------------------------------------------------------------------------
        // защита от неверного ввода числа
        if (task_num < 1 || task_num > tasks.size()) {
            System.out.println("Неверный номер задачи для удаления.");
            return;
        } else {
            int n = task_num - 1; // вычисляем индекс удаляемой задачи
            tasks.remove(n); // удаляем задачу из списка с индексом n
        }
//        --------------------------------------------------------------------------
    }

    // метод считывает выбор пользователя из меню
    public static int readMenuChoice() {
        Scanner sc = new Scanner(System.in);
        int menu_choice = 0;
//        защита от неверного ввода символа а не числа
        try {
            menu_choice = sc.nextInt();
        } catch (InputMismatchException e) { // ввели символ а не число
            System.out.println("Нужно вводить числа, а не символы");
        }
        return menu_choice;
    }
}