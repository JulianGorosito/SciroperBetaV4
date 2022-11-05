import{ Datos } from './interfaces/Datos';
import { GameService } from './game.service';
import { Component, OnInit, NgModule } from '@angular/core';

@Component({
  selector: 'app-game',
  templateUrl: './game.component.html',
  styleUrls: ['./game.component.css']
})
export class GameComponent implements OnInit {
  //variables de la clase (son las que se muestran en html)
  Logo: String = "assets/Img/logo.png";
  NombreJugador: String = "Usuario"; //nombre del jugador

  EleccionJugador : String = ""; //es la eleccion del jugador (solo para utilizar como valor de dato)
  ImgResultado : String = "";  //imagen que muestra el resultado
  PuntosJugador : Number = 0; //puntos del jugador (Default 0)
  PuntosEnemigo : Number = 0; //puntos del enemigo (Default 0)
  imgEleccionJugador : String = "assets/Img/Piedra.png"; //Es la eleccion del jugador en imagen
  imgEleccionEnemigo: String = "assets/Img/Piedra.png"; //Es la eleccion del sistema en imagen

  constructor(private Game: GameService) {}

  ngOnInit(): void {
    console.log(this.PuntosJugador);
  }

  iniciar(EleccionJugador: string) {
    const datos = { //inicializar (valores sin utilidad)
      eleccion: EleccionJugador,
      resultado:"",
      puntosJugador: 0,
      puntosEnemigo: 0,
      imgJugador:"",
      imgEnemigo:""
    }

    this.Game.Juego(datos)
    .subscribe(todo => {
      console.log(todo)
      //cargar las variables de la clase con los resultados obtenidos del pedido.
      this.ImgResultado = todo.resultado;
      this.PuntosJugador = todo.puntosJugador;
      this.PuntosEnemigo = todo.puntosEnemigo;
      this.imgEleccionJugador = todo.imgJugador;
      this.imgEleccionEnemigo = todo.imgEnemigo;
      this.EleccionJugador = todo.eleccion;

      console.log("Puntos del Jugador: "+this.PuntosJugador)
      console.log("Puntos del Enemigo: "+this.PuntosEnemigo)
    });
  }
}
