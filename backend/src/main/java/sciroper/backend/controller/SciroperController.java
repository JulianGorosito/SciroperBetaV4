package sciroper.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sciroper.backend.models.datos;
import sciroper.backend.models.sistema;

@RestController
public class SciroperController {
    
    sistema Sistema = new sistema();
    datos Datos = new datos();
    
    String EleccionJugador = ""; //la eleccion del Jugador (r / p / s)
    String EleccionSistema = ""; //la eleccion del Sistema (r / p / s)
    String play; //union entre ambas elecciones (ej: rp o ps)

    @RequestMapping(value = "/r")
    public datos eleccion_rock() { 
        EleccionJugador = "r";
        EleccionSistema = Sistema.Sistema();
        play = EleccionJugador + EleccionSistema;

        switch (play) {

            //Gana el Jugador
            case "rs":
                Datos.setEleccion("r");
                Datos.setResultado("assets/Img/GanasteImagen.png");
                Datos.setPuntosJugador(1); 
                Datos.setPuntosEnemigo(0);   
                Datos.setImgJugador("assets/Img/Piedra.png");   
                Datos.setImgEnemigo("assets/Img/Tijeras.png");
                break;

            //Gana el PC
            case "rp":
                Datos.setEleccion("r");
                Datos.setResultado("assets/Img/PerdisteImagen.png");
                Datos.setPuntosJugador(0);  
                Datos.setPuntosEnemigo(1);  
                Datos.setImgJugador("assets/Img/Piedra.png");   
                Datos.setImgEnemigo("assets/Img/Papel.png");     
                break;

            //Empate
            case "rr":
                Datos.setEleccion("r");
                Datos.setResultado("assets/Img/EmpatasteImagen.png");
                Datos.setPuntosJugador(0); 
                Datos.setPuntosEnemigo(0);   
                Datos.setImgJugador("assets/Img/Piedra.png");   
                Datos.setImgEnemigo("assets/Img/Piedra.png"); 
                break;

            default:
                break;
        }
        return Datos;
    }

    @RequestMapping(value = "/p")
    public datos eleccion_paper() {
        EleccionJugador = "p";
        EleccionSistema = Sistema.Sistema();
        play = EleccionJugador + EleccionSistema; 

        switch (play) {

            //Gana el Jugador
            case "pr":
                Datos.setEleccion("p");
                Datos.setResultado("assets/Img/GanasteImagen.png");
                Datos.setPuntosJugador(1);
                Datos.setPuntosEnemigo(0);   
                Datos.setImgJugador("assets/Img/Papel.png");   
                Datos.setImgEnemigo("assets/Img/Piedra.png");  
                break;

            //Gana el PC
            case "ps":
                Datos.setEleccion("p");
                Datos.setResultado("assets/Img/PerdisteImagen.png");
                Datos.setPuntosJugador(0);   
                Datos.setPuntosEnemigo(1);  
                Datos.setImgJugador("assets/Img/Papel.png");   
                Datos.setImgEnemigo("assets/Img/Tijeras.png");   
                break;

            //Empate
            case "pp":
                Datos.setEleccion("p");
                Datos.setResultado("assets/Img/EmpatasteImagen.png");
                Datos.setPuntosJugador(0); 
                Datos.setPuntosEnemigo(0);  
                Datos.setImgJugador("assets/Img/Papel.png");   
                Datos.setImgEnemigo("assets/Img/Papel.png");        
                break;

            default:
                break;
        }
        return Datos;
    }

    @RequestMapping(value = "/s")
    public datos eleccion_scissor() {
        EleccionJugador = "s";
        EleccionSistema = Sistema.Sistema();
        play = EleccionJugador + EleccionSistema;

        switch (play) {

            //Gana el Jugador
            case "sp":
                Datos.setEleccion("s");
                Datos.setResultado("assets/Img/GanasteImagen.png");
                Datos.setPuntosJugador(1);    
                Datos.setPuntosEnemigo(0);  
                Datos.setImgJugador("assets/Img/Tijeras.png");   
                Datos.setImgEnemigo("assets/Img/Papel.png");  
                break;

            //Gana el PC
            case "sr":
                Datos.setEleccion("s");
                Datos.setResultado("assets/Img/PerdisteImagen.png");
                Datos.setPuntosJugador(0);  
                Datos.setPuntosEnemigo(1); 
                Datos.setImgJugador("assets/Img/Tijeras.png");   
                Datos.setImgEnemigo("assets/Img/Piedra.png");
                break;

            //Empate
            case "ss":
                Datos.setEleccion("s");
                Datos.setResultado("assets/Img/EmpatasteImagen.png");
                Datos.setPuntosJugador(0);   
                Datos.setPuntosEnemigo(0); 
                Datos.setImgJugador("assets/Img/Tijeras.png");   
                Datos.setImgEnemigo("assets/Img/Tijeras.png");  
                break;

            default:
                break;
        }
        return Datos;
    }

}
