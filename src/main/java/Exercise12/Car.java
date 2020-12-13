package Exercise12;

import java.util.HashMap;

public class Car {

        private int id;
        private String brand;
        private String model;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        HashMap<Integer, Car> carBrand = new HashMap<>();

        public HashMap<Integer, Car> getCarBrand() {
            return carBrand;
        }


    public static void main(String[] args) {
        HashMap<Integer, String> carBrand = new HashMap<>();
        carBrand.put(1, "Saab");
        carBrand.put(2, "Peugeot");
        carBrand.put(3, "BMW");
        carBrand.put(4, "Mazda");
        carBrand.put(5, "Toyota");

        System.out.println(carBrand);
    }

}
