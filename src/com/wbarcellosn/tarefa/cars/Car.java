/**
 * @author winic
 */
package com.wbarcellosn.tarefa.cars;

public class Car {


    private String manufacturer;
    private String model;
    private Integer year;
    private String color;
    private Double gasTank;
    private String style;

    public Car( String manufacturer, String model, Integer year, String color, Double gasTank, String style) {

        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.color = color;
        this.gasTank = gasTank;
        this.style = style;
    }

    @Override
    public String toString() {
        return "\nMontadora: " + manufacturer +
                "\nModelo: " + model +
                "\nAno: " + year +
                "\nCor: " + color +
                "\nTanque: " + gasTank +
                "\nEstilo: " + style;
    }
}
