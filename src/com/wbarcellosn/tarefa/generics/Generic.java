/**
 * @author winic
 */
package com.wbarcellosn.tarefa.generics;

import java.util.ArrayList;
import java.util.List;

public class Generic<T> implements IGeneric<T> {

    protected List<T> list = new ArrayList<T>();

    @Override
    public void register(){}

    @Override
    public void show() {}

}
