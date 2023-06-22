import java.util.ArrayList;
import java.util.Arrays;

public class CarArrayList implements CarList {
    // Получение элемента по индексу - О(1)
    // Вставка элемента в конце списка - О(1)
    // Удаление элемента - О(N)
    // Вставка элемента в середину или начало списка - О(N)

    private Car[] array = new Car[10];
    private int size = 0;

    @Override
    public Car get(int index) {
        checkIndex(index);
        // Алгоритмическая сложность операций: O(1) - операция выполняется за точное (константное)
        // время, и не зависи от размера коллекций - лучшая алгоритмическая сложность, которая
        // только возможна (операция происходит очень быстро)
        return array[index];
    }

    @Override
    public void add(Car car) {
        increaseArray();
        // Алгоритмическая сложность операций: O(1) - операция выполняется за точное (константное)
        // время, и не зависи от размера коллекций - лучшая алгоритмическая сложность, которая
        // только возможна (операция происходит очень быстро)
        array[size] = car;
        size++;

    }

    // Алгоритмическая сложность операций: O(N) - скорость выполнения операции напрямую зависит
    // от размера коллекций. Чем больше элементов она содержит, тем дольше будет выполняться операция
    @Override
    public void add(Car car, int index) {
        increaseArray();
        for (int i = size; i > index; i --) {
            array[i] = array[i - 1];
        }
        array[index] = car;
        size++;
    }

    @Override
    public boolean remove(Car car) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(car)) {
                return removeAt(i);
            }
        }
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        array = new Car[10];
        size = 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void increaseArray() {
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }
}
