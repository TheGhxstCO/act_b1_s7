package com.example;

public class Main {
    public static void main(String[] args) {
        // Productos Electrónicos
        ProductoElectronico laptop = new ProductoElectronico(
                "Laptop Gamer", 2500000, "PROD-0001", 5, "Electrónico",
                24, "ASUS", 110, true
        );

        ProductoElectronico celular = new ProductoElectronico(
                "Celular", 1200000, "PROD-0002", 10, "Electrónico",
                12, "Samsung", 220, false
        );

        // Productos Alimenticios
        ProductoAlimenticio leche = new ProductoAlimenticio(
                "Leche Entera", 4500, "PROD-0003", 20, "Alimento",
                true, "L001", 5
        );

        ProductoAlimenticio pan = new ProductoAlimenticio(
                "Pan Integral", 2500, "PROD-0004", 15, "Alimento",
                false, "L002", 2
        );

        // Pruebas
        System.out.println("\n--- PRUEBAS ---");
        laptop.vender(2);
        laptop.vender(10);

        leche.vender(5);
        leche.reabastecer(10);

        System.out.println("Precio Laptop con lógica electrónica: " + laptop.calcularPrecioElectronico());
        System.out.println("Precio Leche con lógica alimenticia: " + leche.calcularPrecioAlimenticio());

        System.out.println("Laptop voltaje 110 vs local 120: " + laptop.esCompatibleVoltaje(120));
        System.out.println("Pan estado frescura: " + pan.obtenerEstadoFrescura());
        System.out.println("Pérdida por vencimiento Pan: " + pan.calcularPerdidaPorVencimiento());
    }
}
