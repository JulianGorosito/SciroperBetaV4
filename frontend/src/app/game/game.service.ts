import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import{Datos} from './../game/interfaces/Datos'

@Injectable({
  providedIn: 'root',
})

export class GameService {
  constructor(private http: HttpClient) {}
  respuesta ="";

  Juego(datos: Datos){
    const path = `http://localhost:8080/${datos.eleccion}`
    return this.http.post<Datos>(path, datos);
  }
}





