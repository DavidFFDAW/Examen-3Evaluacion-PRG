package com.politecnicomalaga.factory;

public class PizzaMargarita extends Pizza implements HacerPizza{
    @Override
    public String preparar() {
        return "Extender masa\n" +
                "Agregar salsa de tomate\n" +
                "Agregar mozzarella";
    }
}
