package sciroper.backend.models;
public class datos {
    
    private String Eleccion;
    private String Resultado;
    private Integer puntosJugador = 0;
    private Integer puntosEnemigo = 0;
    private String ImgJugador;
    private String ImgEnemigo;   
    
    //extra
    private int valorAcumuJ = 0; //para que incremente el valor y no se remplace 
    private int valorAcumuE = 0; //para que incremente el valor y no se remplace 
    
    public String getEleccion(){
    return Eleccion;
    }

    public void setEleccion(String dato_eleccion){
        this.Eleccion = dato_eleccion;
    }

    public String getResultado(){
        return Resultado;
    }
    
    public void setResultado(String dato_resultado){
        this.Resultado = dato_resultado;
    }
    
    
    public Integer getPuntosJugador(){
        return puntosJugador;
    }
    
    public void setPuntosJugador(Integer dato_puntos){
        this.valorAcumuJ = valorAcumuJ + dato_puntos;
        this.puntosJugador = valorAcumuJ;
    }

    public Integer getPuntosEnemigo(){
        return puntosEnemigo;
    }
    
    public void setPuntosEnemigo(Integer dato_puntos){
        this.valorAcumuE = valorAcumuE + dato_puntos;
        this.puntosEnemigo =  valorAcumuE;
    }

    public String getImgJugador(){
        return ImgJugador;
    }
    
    public void setImgJugador(String dato_ImgJugador){
        this.ImgJugador = dato_ImgJugador;
    }

    public String getImgEnemigo(){
        return ImgEnemigo;
    }
    
    public void setImgEnemigo(String dato_ImgEnemigo){
        this.ImgEnemigo = dato_ImgEnemigo;
    }








}
