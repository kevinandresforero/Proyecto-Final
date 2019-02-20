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

import javax.swing.JFrame;

/**
 *
 * @author Kevin Andres Forero Guaitero <https://github.com/kevinandresforero>
 */
public class Ventana extends JFrame {
    int ancho = 1300 , alto = 425 ;
    private static volatile boolean EstadoDeJuego = false ;
    
    public Ventana(){
        /*
        *   Se crea y setea la ventana Principal
        */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Jump Parcours");
        setSize(ancho, alto);
        setVisible(true);
        setLocationRelativeTo(null);
        
        System.out.println("Ventana()");
        
        String fondo = "1Fondo" ;
        Dibujo Fondo = new Dibujo(fondo);
    }
    
}
