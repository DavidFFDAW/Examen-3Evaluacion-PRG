package com.politecnicomalaga;

import com.politecnicomalaga.factory.*;
import com.politecnicomalaga.pizzas.Pizza;

import java.util.Scanner;

public class App {

    private static Scanner lectorTeclado = new Scanner(System.in).useDelimiter("\n");
    private static Pizza pizza = new Pizza();

    public static void main(String[] args){

        System.out.println("Introduce el tipo de pizza que quieres:\n" +
                "1. 4 Estaciones\n" +
                "2. Margarita\n" +
                "3. Prosciutto\n" +
                "4. Vegana\n" +
                "Opción: ");

        int tipoPizza = lectorTeclado.nextInt();
        PizzaFactory factory = new PizzaFactory();

        HacerPizza hacerPizza = factory.crearPizza(tipoPizza);

        System.out.println(hacerPizza.preparar());
        System.out.println(pizza.hornear());
        System.out.println(pizza.cortar());
        System.out.println(pizza.empaquetar());
    }
}
