/**
 * @author winic
 */
package com.wbarcellosn.tarefa.boats;

public class Boat {

    private String manufacturer;
    private String model;
    private Integer year;
    private String specificity;


    public Boat( String manufacturer, String model, Integer year, String specificity) {

        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.specificity = specificity;
    }

    @Override
    public String toString() {
        return "\nMontadora: " + manufacturer +
                "\nModelo: " + model +
                "\nAno: " + year +
                "\nEspecificidade: " + specificity;
    }
}
