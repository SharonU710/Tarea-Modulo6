/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4.Main;

/**
 *
 * @author s0733
 */
public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Juan Avila", 50, "Pediatria");
        Deportista deportista1 = new Deportista("Lucia Gamez", 20, "Natacion");

        doctor1.mostrarInfo();
        deportista1.mostrarInfo();
    }
}