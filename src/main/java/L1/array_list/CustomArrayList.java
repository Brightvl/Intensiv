package L1.array_list;


import java.util.Arrays;

/**
 * Своя реализация ArrayList
 *
 * @param <E>
 */
public class CustomArrayList<E> {

    /**
     * Начальный размер списка
     */
    private final int DEFAULT_CAPACITY = 10;
    /**
     * Объекты списка
     */
    private Object[] array;
    /**
     * Размер списка
     */
    private int size;

    public CustomArrayList() {
        array = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Метод расширяющий размер массива
     */
    private void increaseCapacity() {
        array = Arrays.copyOf(array, array.length * 2);
    }

    /**
     *Возвращает текущий размер списка
     * @return число
     */
    public int size() {
        return size;
    }

    /**
     * Добавление элемента в список
     * Если места в списке уже нет увеличиваем массив в 2 раза
     *
     * @param elementOfList элемент
     */
    public void add(E elementOfList) {
        if (size == array.length) {
            increaseCapacity();
        }
        array[size++] = elementOfList;
    }


    /**
     * Метод для получения значения по индексу
     *
     * @param index индекс
     * @return Объект списка
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) array[index];
    }

    /**
     * Удаляет элемент из списка по указанному индексу
     * @param index индекс элемента в списке
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        int newSize = size - 1;
        System.arraycopy(array, index + 1, array, index, newSize - index);
        array[size = newSize] = null;
    }
}
