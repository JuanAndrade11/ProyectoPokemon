/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.elAndrade.ProyectoPokemon.GameState;

import java.awt.Graphics2D;

/**
 *
 * @author JuanPablo
 */
public class GameStateManager {
    
    public GameState currGameState;
    
    public GameStateManager(){
        currGameState = new PlayState();
    }
    
    public void init(){
        currGameState.init();
    }
    
    public void tick(){
        currGameState.tick();
    }
    
    public void render(Graphics2D g){
        currGameState.render(g);
    }
    
    public void switchState(GameState newState){
        currGameState = newState;
        currGameState.init();
    }
}
//en esta clase se genera el estado de juego, se utiliza para inicializar el mapa y renderizar las imagenes o los tiles dentro del mismo