/**
 * @author winic
 */
package com.wbarcellosn.tarefa.boats;

import com.wbarcellosn.tarefa.cars.Car;
import com.wbarcellosn.tarefa.generics.Generic;
import com.wbarcellosn.tarefa.generics.IGeneric;

public class BoatsList extends Generic<Boat> implements IBoatsList {

    Boat boat1 = new Boat(
            "Ocean Kings",
            "Pesqueiro Pequeno",
            2019,
            "Rios");

    Boat boat2 = new Boat(
            "Ocean Adventuries",
            "Navio para Cruzeiro",
            2023,
            "Alto Mar");


    @Override
    public void register() {
        list.add(boat1);
        list.add(boat2);
    }

    @Override
    public void show() {
        System.out.println("\nLISTA DE BARCOS:");
        for (Boat item : list){
            System.out.println(item);
        }
    }
}
