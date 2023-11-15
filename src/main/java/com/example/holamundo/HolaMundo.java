package com.example.holamundo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {
    @RequestMapping("/saludar")
    public String Saludar() {
        String saludo = "<h1>Hola mundo desde <b>Spring Boot</b></h1>";
        String enlaces = "<a href='/'>Volver al inicio</a>";
        saludo += enlaces;

        return saludo;
    }

    @RequestMapping("/misdatos")
    public String MisDatos() {
        String nombres = "Balboa Victor";
        int edad = 20;
        String curso = "Desarrollo Web";
        String foto = "perrito.jpeg";

        String datos = "<table border=1>";
        datos += "<tr><td colspan=2><img src=" + foto +"> <br> <center><h1>¿Porqué JAVA?</h1></center> </td></tr>";
        datos += "<tr><td><h3>Me llamo</h3></td><td>" + nombres +"</td></tr>";
        datos += "<tr><td><h3>Mi edad es</h3></td><td>" + edad +"</td></tr>";
        datos += "<tr><td><h3>Estoy en el curso de</h3></td><td>" + curso +"</td></tr>";
        datos += "</table> <br>";
        String enlaces = "<a href='/'>Volver al inicio</a>";
        datos += enlaces;

        return datos;
    }

    @RequestMapping("/")
    public String Indice() {
        String enlaces = "<a href='/saludar'>Mostrar saludo</a> <br>";
        enlaces += "<a href='/misdatos'>Mostrar mis datos</a>";
        return enlaces;
    }
}
