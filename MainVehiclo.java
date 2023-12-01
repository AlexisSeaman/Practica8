package Practica8;

public class MainVehiclo {
    public static void main(String[] args) {
        Motor motor = new Motor("Gasolina", 200);
        Transmision transmision = new Transmision("Automatica", 6);
        Neumatico[] neumaticos = {
            new Neumatico("Goodyear", 17),
            new Neumatico("Goodyear", 17),
            new Neumatico("Goodyear", 17),
            new Neumatico("Goodyear", 17)
        };

        Vehiculo coche = new Vehiculo("Toyota", "Corolla", motor, transmision, neumaticos);

        coche.imprimirDatosVehiculo();
    }
}
