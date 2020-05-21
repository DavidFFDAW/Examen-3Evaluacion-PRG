package com.politecnicomalaga.pizzas;

import com.politecnicomalaga.factory.HacerPizza;

public class PizzaVegana extends Pizza implements HacerPizza {
    @Override
    public String preparar() {
        return "\n:Pizza Vegana:\n" +
                "  Extender masa\n" +
                "  Agregar salsa de tomate\n" +
                "  Agregar mozzarella\n" +
                "  Agregar tomate en rodajas\n" +
                "  Agregar tiras de pimiento verde\n" +
                "  Agregar maíz\n" +
                " -----------------------------------";
    }
}
