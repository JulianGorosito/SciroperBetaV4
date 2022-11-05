package sciroper.backend.models;

public class sistema {

    public String Sistema(){
        String[]Eleccion = {"r", "p", "s"};
        int random = (int) Math.floor(Math.random()*3);
        String EleccionSistema = Eleccion[random];
        return EleccionSistema;
    }

}
