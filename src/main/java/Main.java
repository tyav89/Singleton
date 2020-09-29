import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Logger logger = Logger.getInstance();
        logger.log("Запуск программы");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");
        int theSize = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите верхнюю границу для значений:");
        int maxValue = Integer.parseInt(scanner.nextLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < theSize; i++) {
            list.add(random.nextInt(maxValue));
        }
        logger.log("Создаём и наполняем список");
        System.out.println("Вот случайный список: " + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        int fltr = Integer.parseInt(scanner.nextLine());
        Filter filter = new Filter(fltr);
        list = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + list);
        logger.log("Завершаем программу");
    }
}
