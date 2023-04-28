public class SalonEquipment {
    String classOfEquipment;
    int priceOfEquipment;
    String transmision;

    public SalonEquipment(String classOfEquipment, int priceOfEquipment, String transmision){
        this.classOfEquipment = classOfEquipment;
        this.priceOfEquipment = priceOfEquipment;
        this.transmision = transmision;
    }

    int fullPriceEquipment(int priceOfEquipment, String transmision){
        if (transmision.equalsIgnoreCase("МКПП")) {
            return priceOfEquipment + 1000;
        } else if (transmision.equalsIgnoreCase("АКПП")) {
            return priceOfEquipment + 3000;
        } return priceOfEquipment;
    }

    static void salonInfo(String classOfEquipment, String transmision, int fullPriceEquipment){
        System.out.printf("Автомобіль %s та на %s. Вартість комплектації - %d$.\n", classOfEquipment, transmision, fullPriceEquipment);
    }
}
