/*
 * Copyright (C) 2019 Kevin Andres Forero Guaitero <https://github.com/kevinandresforero>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package juego.Graficos;

import java.awt.Canvas;


/**
 *
 * @author Kevin Andres Forero Guaitero <https://github.com/kevinandresforero>
 */
public class Dibujo extends Canvas implements Runnable{
    public Dibujo(String ruta){
        
    }

    Dibujo(Dibujo Fondo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Dibujo(Ventana aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void Fps(boolean EstadoJuego, boolean EstadoDeJuego) {
        while(true){
            System.out.println("Fps(true)");

            /*
            *   NsSegundo es la cantidad de nanosegundos por segundos para usar 
            *   System.nanoTime()
            */
            
            final int NsSegundo = 1000000000 ;
            final byte FpsDeseado = 45 ;
            final double NsActualizacion = NsSegundo / FpsDeseado ;
            
            /* 
            *   NsActualizacion es el numero de nanosegundos que debe esperar 
            *   para actualizar
            */
            
            long TempFps = System.nanoTime() ;

            double tiempoEjecucion;
            double delta = 0 ;
            
            Actualizar();
            Mostrar();
        }
    }

    private void Actualizar() {
        
    }

    private void Mostrar() {
        
    }

     @Override
    public void run() {
        Actualizar();
        Mostrar();
    }
    
    private synchronized void iniciar(boolean EstadoDeJuego) {
        EstadoDeJuego = true;
        
        
    }
       
    private synchronized void detener(boolean EstadoDeJuego){
        EstadoDeJuego = false;
        
        
    }
    

}
