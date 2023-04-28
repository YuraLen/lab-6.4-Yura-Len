public class ModelOfCar {
    String brand;
    String model;

    public ModelOfCar(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    static void modelInfo(String brand, String model){
        System.out.printf("Марка автомобіля - %s. Модель - %s\n", brand, model);
    }

    static int priceOfCar(int a, int b){
        return a + b;
    }
}
