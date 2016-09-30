/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.elAndrade.ProyectoPokemon.GameState ;

import java.awt.Graphics2D;


/**
 *
 * @author JuanPablo
 */
public abstract class GameState {
    
    public abstract void init();
    public abstract void tick();
    public abstract void render (Graphics2D g); 
}
//Esta clase maneja los metodos tick y render que serán usados por otras clases para generar las imagenes en el mapa
