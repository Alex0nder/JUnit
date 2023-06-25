public interface CarList {

    //Получение элемента по индексу
    Car get(int index);

    //Добавление автомобиля в систему
    void add(Car car);

    void add(Car car, int index);

    //Удаляет автомобиль из коллекции
    boolean remove(Car car);

    //Удаление элемента по индексу
    boolean removeAt(int index);

    //Возращает количество автомобилей в системе
    int size();

    //Не возвращает значения и удалет все автомобили из коллекции
    void clear();
}
