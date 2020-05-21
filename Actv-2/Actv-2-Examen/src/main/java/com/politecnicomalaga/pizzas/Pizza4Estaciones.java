package com.politecnicomalaga.pizzas;

import com.politecnicomalaga.factory.HacerPizza;

public class Pizza4Estaciones extends Pizza implements HacerPizza {
    @Override
    public String preparar() {
        return "\n:Pizza 4 Estaciones:\n" +
                "  Extender masa\n" +
                "  Agregar salsa de tomate\n" +
                "  Agregar mozzarella\n" +
                "  Agregar en el primer sector de 90º anchoas\n" +
                "  Agregar en el segundo sector de 90º jamón york\n" +
                "  Agregar en el tercer sector de 90º maíz\n" +
                "  Agregar en el cuarto sector de 90º piña\n" +
                " ------------------------------------------------";
    }
}
