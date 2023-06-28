public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 1);
        Car car2 = new Car("BMW", 1);
        System.out.println(car1.equals(car2));
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

//        car2 = car1;
//        car2.setNumber(5);
//        System.out.println(car1.getNumber());
//        String brand = "BMW";
//        System.out.println(car1.getBrand() == brand);
    }
}
