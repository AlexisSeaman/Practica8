package Practica8;

public class Vehiculo {
    private String marca;
    private String modelo;
    private Motor motor;
    private Transmision transmision;
    private Neumatico[] neumaticos;

    public Vehiculo(String marca, String modelo, Motor motor, Transmision transmision, Neumatico[] neumaticos) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.transmision = transmision;
        this.neumaticos = neumaticos;
    }

    public void imprimirDatosVehiculo() {
        System.out.println("Marca del vehiculo: " + marca);
        System.out.println("Modelo del vehiculo: " + modelo);
        System.out.println("Tipo de motor: " + motor.getTipo());
        System.out.println("Potencia del motor: " + motor.getPotencia() + " HP");
        System.out.println("Tipo de transmision: " + transmision.getTipo());
        System.out.println("Numero de marchas: " + transmision.getNumMarchas());

        System.out.println("Neumaticos del vehiculo:");
        for (int i = 0; i < neumaticos.length; i++) {
            System.out.println("Neumatico " + (i + 1) + ": Marca " + neumaticos[i].getMarca() + ", Diametro " + neumaticos[i].getDiametro() + " pulgadas");
        }
    }
    
}
