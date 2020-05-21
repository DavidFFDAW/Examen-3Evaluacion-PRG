package com.politecnicomalaga.pizzas;

import com.politecnicomalaga.factory.HacerPizza;

public class PizzaMargarita extends Pizza implements HacerPizza {
    @Override
    public String preparar() {
        return "\n:Pizza Margarita:\n" +
                "  Extender masa\n" +
                "  Agregar salsa de tomate\n" +
                "  Agregar mozzarella\n" +
                " -----------------------------";
    }
}
