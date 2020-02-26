package io.huna.patterns.factory.method;

import io.huna.patterns.factory.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
