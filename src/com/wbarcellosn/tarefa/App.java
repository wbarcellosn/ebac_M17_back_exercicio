/**
 * @author winic
 */
package com.wbarcellosn.tarefa;

import com.wbarcellosn.tarefa.boats.BoatsList;
import com.wbarcellosn.tarefa.boats.IBoatsList;
import com.wbarcellosn.tarefa.cars.FordCarsList;
import com.wbarcellosn.tarefa.cars.HondaCarsList;
import com.wbarcellosn.tarefa.cars.IFordCarsList;
import com.wbarcellosn.tarefa.cars.IHondaCarsList;


public class App {

    private static IHondaCarsList hondaCars = new HondaCarsList();
    private static IFordCarsList fordCars = new FordCarsList();
    private static IBoatsList boats = new BoatsList();

    public static void main (String[] args){
        registerCars();
        printData();
    }

    public static void registerCars(){
        hondaCars.register();
        fordCars.register();
        boats.register();
    }

    public static void printData() {
        hondaCars.show();
        fordCars.show();
        boats.show();
    }
}
