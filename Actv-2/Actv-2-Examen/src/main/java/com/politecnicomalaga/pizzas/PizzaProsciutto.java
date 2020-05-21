package com.politecnicomalaga.pizzas;

import com.politecnicomalaga.factory.HacerPizza;

public class PizzaProsciutto extends Pizza implements HacerPizza {
    @Override
    public String preparar() {
        return "\n:Pizza Prosciutto\n" +
                "  Extender masa\n" +
                "  Agregar salsa de tomate\n" +
                "  Agregar mozzarella\n" +
                "  Agregar jamón york\n" +
                " -----------------------------";
    }
}
