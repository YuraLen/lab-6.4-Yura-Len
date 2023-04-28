public class EngineOfCar {
    static String modelOfEngine;
    static double capacity; // об'єм мотору
    int horsePower; // кінські сили
    int enginePrice;
    double averageConsumption; // середній розхід

    public EngineOfCar(String modelOfEngine, double capacity, int horsePower, int enginePrice, double averageConsumption){
        this.modelOfEngine = modelOfEngine;
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.enginePrice = enginePrice;
        this.averageConsumption = averageConsumption;
    }
    static double distanceOf10Litres(double averageConsumption ,double liters){
        double result;
        result = (liters / averageConsumption) * 100;
        return result;
    }
    static void characteristicsOfMotor(String modelOfEngine, double capacity, int horsePower, double averageConsumption, int enginePrice){
        System.out.println("    ~-~ Характеристики мотору ~-~   ");
        System.out.printf("Модель мотору - %s. Об'єм %.1f та %d кінських сил. Середній розхід %.1fл/100км. Ціна двигуна %d$.\n", modelOfEngine, capacity, horsePower, averageConsumption, enginePrice);
    }
}
