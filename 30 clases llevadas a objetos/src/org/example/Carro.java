package org.example;

public class Carro {
    String modelo;
    String numeroSerie;
    String marca;

    String mantenerEstado(){
        return "Mantener Estado";
    }
    String moverse(){
        return "Mover";
    }
    String transportarPasajero(){
        return "Transportar Pasajero";
    }
}
