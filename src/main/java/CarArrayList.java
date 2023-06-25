import java.util.ArrayList;
import java.util.Arrays;

public class CarArrayList implements CarList {
    // Get element by index - O(1)
    // Insert an element at the end of the list - O(1)
    // Removing an element - O(N)
    // Inserting an element in the middle or beginning of the list - O(N)

    private Car[] array = new Car[10];
    private int size = 0;

    @Override
    public Car get(int index) {
        checkIndex(index);
        // Algorithmic complexity of operations: O(1) - the operation is performed for exact (constant)
        // time, and do not depend on the size of collections - the best algorithmic complexity that
        // only possible (operation is very fast)
        return array[index];
    }

    @Override
    public void add(Car car) {
        increaseArray();
        // Algorithmic complexity of operations: O(1) - the operation is performed for exact (constant)
        // time, and do not depend on the size of collections - the best algorithmic complexity that
        // only possible (operation is very fast)
        array[size] = car;
        size++;

    }

    // Algorithmic complexity of operations: O(N) - the speed of the operation directly depends
    // on the size of the collections. The more elements it contains, the longer the operation will take.
    @Override
    public void add(Car car, int index) {
        increaseArray();
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
//        if (size - index >= 0) {
            // Safe memory
        System.arraycopy(array, index, array, index + 1, size - index);
//        }
//        for (int i = size; i > index; i --) {
//            array[i] = array[i - 1];
//        }
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
