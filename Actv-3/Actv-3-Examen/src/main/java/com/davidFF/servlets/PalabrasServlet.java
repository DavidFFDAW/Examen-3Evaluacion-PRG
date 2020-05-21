package com.davidFF.servlets;

import com.davidFF.operaciones.Concatenacion;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PalabrasServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cadenaResultado = "";
        String cadenaRecibida = req.getReader().lines().collect(Collectors.joining());
        List<String> listaDePalabras = new ArrayList<>();
        Concatenacion concatenacion = new Concatenacion();
        JSONParser parser = new JSONParser();
        try {
            JSONObject json = (JSONObject) parser.parse(cadenaRecibida);
            String pal1 = (String) json.get("palabra1");
            String pal2 = (String) json.get("palabra2");
            String pal3 = (String) json.get("palabra3");
            listaDePalabras.add(pal1);
            listaDePalabras.add(pal2);
            listaDePalabras.add(pal3);
            String concatenado = concatenacion.concatenar(listaDePalabras);

            cadenaResultado = "{\"status\":\"OK\",\"plb1\":\""+pal1+"\",\"plb2\":\""+pal2+"\",\"plb3\":\""+pal3+"\",\"concatenation\":\""+concatenado+"\"}";

        } catch (Exception e){
            cadenaResultado = "{\"status\":\"KO\",\"excepcion\":\""+e.toString()+"\"}";
            e.printStackTrace();
        }

        PrintWriter out = resp.getWriter();
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        out.print(cadenaResultado);
    }
}
