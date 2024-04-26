/**
 * @author winic
 */
package com.wbarcellosn.tarefa.cars;

import com.wbarcellosn.tarefa.generics.Generic;
import com.wbarcellosn.tarefa.generics.IGeneric;

public class FordCarsList extends Generic<Car> implements IFordCarsList {

    Car fusionCar = new Car(

            "Ford",
            "Ford Fusion",
            2017,
            "Branco",
            58.0,
            "Sedan");

    Car rangerCar = new Car(

            "Ford",
            "Ford Ranger 2.8",
            2024,
            "Vermelho",
            80.0,
            "OffRoad");


    @Override
    public void register() {
        list.add(fusionCar);
        list.add(rangerCar);
    }

    @Override
    public void show() {
        System.out.println("\nLISTA DE VEÍCULOS FORD:");
        for (Car item : list){
            System.out.println(item);
        }
    }
}
