package ru.suleymanovtat.mvpapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by suleymanovtat on 27.02.2018.
 */

public class Model implements IModel {

    void Model(){

    }

    @Override
    public List<Object> getRssFeed(String url) {
        List<Object> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        return list;
    }
}
