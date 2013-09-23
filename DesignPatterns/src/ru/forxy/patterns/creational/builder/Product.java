package ru.forxy.patterns.creational.builder;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 29.06.11
 * Time: 1:26
 * To change this template use File | Settings | File Templates.
 */
public class Product {

    private ArrayList<String> mParts = new ArrayList<String>();

    public void addPart(String part) {
        mParts.add(part);
    }

    public ArrayList<String> getParts() {
        return mParts;
    }
}
