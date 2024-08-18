import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        int[] sizes = {100, 1000, 10000, 100000, 1000000};

        for (int size : sizes) {
            System.out.println("Размер коллекции: " + size);

            // Вставка в начало
            testInsertBeginning(new ArrayList<>(), size, "ArrayList");
            testInsertBeginning(new LinkedList<>(), size, "LinkedList");

            // Вставка в конец
            testInsertEnd(new ArrayList<>(), size, "ArrayList");
            testInsertEnd(new LinkedList<>(), size, "LinkedList");

            // Вставка в середину
            testInsertMiddle(new ArrayList<>(), size, "ArrayList");
            testInsertMiddle(new LinkedList<>(), size, "LinkedList");

            System.out.println();
        }

        for (int size : sizes) {
            System.out.println("Размер коллекции: " + size);

            // Удаление из начала
            testDeleteBeginning(new ArrayList<>(), size, "ArrayList");
            testDeleteBeginning(new LinkedList<>(), size, "LinkedList");

            // Удаление из конца
            testDeleteEnd(new ArrayList<>(), size, "ArrayList");
            testDeleteEnd(new LinkedList<>(), size, "LinkedList");

            // Удаление из середины
            testDeleteMiddle(new ArrayList<>(), size, "ArrayList");
            testDeleteMiddle(new LinkedList<>(), size, "LinkedList");

            System.out.println();
        }

        for (int size : sizes) {
            System.out.println("Размер коллекции: " + size);

            // Замена элемента в середине
            testReplaceElement(new ArrayList<>(), size, "ArrayList");
            testReplaceElement(new LinkedList<>(), size, "LinkedList");

            System.out.println();
        }
    }

    public static void testInsertBeginning(java.util.List<Integer> list, int size, String type) {
        // Заполнение списка
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        long startTime = System.nanoTime();
        list.add(0, -1);  // Вставка в начало
        long endTime = System.nanoTime();
        System.out.println(type + " - Вставка в начало: " + (endTime - startTime) + " нс");
    }

    public static void testInsertEnd(java.util.List<Integer> list, int size, String type) {
        // Заполнение списка
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        long startTime = System.nanoTime();
        list.add(size);  // Вставка в конец
        long endTime = System.nanoTime();
        System.out.println(type + " - Вставка в конец: " + (endTime - startTime) + " нс");
    }

    public static void testInsertMiddle(java.util.List<Integer> list, int size, String type) {
        // Заполнение списка
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        long startTime = System.nanoTime();
        list.add(size / 2, -1);  // Вставка в середину
        long endTime = System.nanoTime();
        System.out.println(type + " - Вставка в середину: " + (endTime - startTime) + " нс");
    }

    // удаление

    public static void testDeleteBeginning(java.util.List<Integer> list, int size, String type) {
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        long startTime = System.nanoTime();
        list.remove(0);  // Удаление из начала
        long endTime = System.nanoTime();
        System.out.println(type + " - Удаление из начала: " + (endTime - startTime) + " нс");
    }

    public static void testDeleteEnd(java.util.List<Integer> list, int size, String type) {
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        long startTime = System.nanoTime();
        list.remove(size - 1);  // Удаление из конца
        long endTime = System.nanoTime();
        System.out.println(type + " - Удаление из конца: " + (endTime - startTime) + " нс");
    }

    public static void testDeleteMiddle(java.util.List<Integer> list, int size, String type) {
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        long startTime = System.nanoTime();
        list.remove(size / 2);  // Удаление из середины
        long endTime = System.nanoTime();
        System.out.println(type + " - Удаление из середины: " + (endTime - startTime) + " нс");
    }
    public static void testReplaceElement(java.util.List<Integer> list, int size, String type) {
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        // Замена элемента в середине списка
        long startTime = System.nanoTime();
        list.set(size / 2, -1);  // Замена элемента в середине
        long endTime = System.nanoTime();

        System.out.println(type + " - Замена элемента в середине: " + (endTime - startTime) + " нс");
    }
}
