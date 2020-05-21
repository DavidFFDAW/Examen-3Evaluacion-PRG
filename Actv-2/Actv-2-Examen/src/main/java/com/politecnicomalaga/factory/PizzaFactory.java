package com.politecnicomalaga.factory;

public class PizzaFactory {
    public final static int ESTACIONES = 1;
    public final static int MARGARITA = 2;
    public final static int PROSCIUTTO = 3;
    public final static int VEGANA = 4;

    public HacerPizza crearPizza(int tipoDePizza){
        HacerPizza hacerPizza = null;
        if (tipoDePizza == PizzaFactory.ESTACIONES){
            hacerPizza = new Pizza4Estaciones();
        }
        else if (tipoDePizza == PizzaFactory.MARGARITA){
            hacerPizza = new PizzaMargarita();
        }
        else if (tipoDePizza == PizzaFactory.PROSCIUTTO){
            hacerPizza = new PizzaProsciutto();
        }
        else if (tipoDePizza == PizzaFactory.VEGANA){
            hacerPizza = new PizzaVegana();
        }
        return hacerPizza;
    }
}
