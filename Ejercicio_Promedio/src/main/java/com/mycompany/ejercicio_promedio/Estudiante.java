/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_promedio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Estudiante {

    private String nombre;
    private int id;
    private int edad;
    private double notaMate;
    private double notaCien;
    private double notaIngles;
    private double prom;

    public Estudiante() {
    }

    public Estudiante(String nombre, int id, int edad, double notaMate, double notaCien, double notaIngles, double prom) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.notaMate = notaMate;
        this.notaCien = notaCien;
        this.notaIngles = notaIngles;
        this.prom = prom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaMate() {
        return notaMate;
    }

    public void setNotaMate(double notaMate) {
        this.notaMate = notaMate;
    }

    public double getNotaCien() {
        return notaCien;
    }

    public void setNotaCien(double notaCien) {
        this.notaCien = notaCien;
    }

    public double getNotaIngles() {
        return notaIngles;
    }

    public void setNotaIngles(double notaIngles) {
        this.notaIngles = notaIngles;
    }

    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }
    Estudiante[] est = new Estudiante[3];

    public void agregarEs() {
        for (int i = 0; i <= 2; i++) {

            this.nombre = JOptionPane.showInputDialog("Digite el Nombre");

            this.id = Integer.parseInt(JOptionPane.showInputDialog("Digite su id"));

            this.edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
            this.notaMate = Double.parseDouble(JOptionPane.showInputDialog("Digite su nota de Matematicas"));

            this.notaIngles = Double.parseDouble(JOptionPane.showInputDialog("Digite su nota de Ingles"));

            this.notaCien = Double.parseDouble(JOptionPane.showInputDialog("Digite su nota de Ciencias"));
            this.prom = (this.notaCien + this.notaIngles + this.notaMate) / 3;
            est[i] = new Estudiante(nombre, id, edad, notaMate, notaIngles, notaCien, prom);
        }

    }

    public void imprimir() {
        for (int i = 0; i <= 2; i++) {
            JOptionPane.showMessageDialog(null, "Estudiante " + (i + 1) + ":\nNombre: " + est[i].getNombre() + "\nID: " + est[i].getId() + "\n Edad: " + est[i].getEdad() + "\n Promedio: " + est[i].getProm());

        }
    }

    public void organiEdad() {
        JOptionPane.showMessageDialog(null, "Estudiantes organizados por edad " + ":");
        Arrays.sort(est, Comparator.comparingInt(Estudiante::getEdad));
        imprimir();
    }

    public void organiNota() {
        JOptionPane.showMessageDialog(null, "Estudiantes organizados por Promedio " + ":");
        Arrays.sort(est, Comparator.comparingDouble(Estudiante::getProm).reversed());
        imprimir();
    }
}
