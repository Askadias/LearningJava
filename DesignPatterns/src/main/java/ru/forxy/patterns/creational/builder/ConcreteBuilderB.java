package ru.forxy.patterns.creational.builder;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 29.06.11
 * Time: 9:19
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteBuilderB extends AbstractBuilder {

    private final Product mProduct = new Product();

    private static AbstractBuilder mInstance;

    private ConcreteBuilderB () {}

    public static AbstractBuilder getInstance() {
        if (mInstance == null) {
            mInstance = new ConcreteBuilderB();
        }
        return mInstance;
    }

    public void buildPartA() {
        mProduct.addPart("PartX");
    }

    public void buildPartB() {
        mProduct.addPart("PartY");
    }

    public Product getResult() {
        return mProduct;
    }
}
