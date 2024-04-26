/**
 * @author winic
 */
package com.wbarcellosn.tarefa.cars;

import com.wbarcellosn.tarefa.generics.Generic;
import com.wbarcellosn.tarefa.generics.IGeneric;

public class HondaCarsList extends Generic<Car> implements IHondaCarsList {

    Car civicCar = new Car(

            "Honda",
            "Civic 1.8",
            2024,
            "Preto",
            58.0,
            "Sedan");

    Car etiosCar = new Car(

            "Honda",
            "Honda Etios 1.4",
            2024,
            "Prata",
            50.0,
            "Hatch");


    @Override
    public void register() {
        list.add(civicCar);
        list.add(etiosCar);
    }

    @Override
    public void show() {
        System.out.println("\nLISTA DE VEÍCULOS HONDA:");
        for (Car item : list){
            System.out.println(item);
        }
    }
}
