package com.davidFF.operaciones;

import java.util.List;

public class Concatenacion {

    public String concatenar(List<String> palabras){
        String res = "";
        for (int i=0; i<palabras.size(); i++){
            res += palabras.get(i);
        }
        return res;
    }
}
