package ru.forxy.patterns.creational.builder;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 29.06.11
 * Time: 9:19
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteBuilderA extends AbstractBuilder {

    private final Product mProduct = new Product();

    private static AbstractBuilder mInstance;

    private ConcreteBuilderA () {}

    public static AbstractBuilder getInstance() {
        if (mInstance == null) {
            mInstance = new ConcreteBuilderA();
        }
        return mInstance;
    }

    public void buildPartA() {
        mProduct.addPart("PartA");
    }

    public void buildPartB() {
        mProduct.addPart("PartB");
    }

    public Product getResult() {
        return mProduct;
    }
}
