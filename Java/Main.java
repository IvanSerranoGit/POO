package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("AMQ123", new Account("Iván Serrano", "CESI900801Q31"));
        car.passegenger = 4;
        car.printDataCar();

        // antes de crear el metodo car y account asi dimo de alta los datos
        // Car car2 = new Car();
        // car2.license = "AMQ456";
        // car2.driver = "Kiara Gomez";
        // car2.passegenger = 4;
        // car2.printDataCar();

        Car car2 = new Car("AMQ456", new Account("Kiara Gomez", "kIGO900801Q31"));
        car2.passegenger = 4;
        car2.printDataCar();
    }
}