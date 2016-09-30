/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.elAndrade.ProyectoPokemon.Input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import me.elAndrade.ProyectoPokemon.Player.Player;
import me.elAndrade.ProyectoPokemon.Tiles.Tile;
import me.elAndrade.ProyectoPokemon.Tools.Loader;
import me.elAndrade.ProyectoPokemon.World.World;

/**
 *
 * @author JuanPablo
 */
public class KeyManager implements KeyListener{

    boolean canMove = false;
    @Override
    public void keyTyped(KeyEvent e) {
    
    }

    @Override
    public void keyPressed(KeyEvent e) {
        Random r = new Random();
        int index = 0;
        Player.dx = 0;
        Player.dy = 0;
        
        if(e.getKeyCode() == KeyEvent.VK_UP){
            Player.dy +=2;
            index = r.nextInt(2) + 1;
            Player.play = new Loader().Loader2("/me/elAndrade/ProyectoPokemon/res/ash/ash_BACK" + index + ".png");
        }else
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            Player.dy -=2;
            index = r.nextInt(2) + 1;
            Player.play = new Loader().Loader2("/me/elAndrade/ProyectoPokemon/res/ash/ash_FRONT" + index + ".png");
        }else
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            Player.dx +=2;
            index = r.nextInt(2) + 1;
            Player.play = new Loader().Loader2("/me/elAndrade/ProyectoPokemon/res/ash/ash_LEFT" + index + ".png");
        }else
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            Player.dx -=2;
            index = r.nextInt(2) + 1;
            Player.play = new Loader().Loader2("/me/elAndrade/ProyectoPokemon/res/ash/ash_RIGHT" + index + ".png");
        }
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP){
            Player.dy = 0;
            Player.play = new Loader().Loader2("/me/elAndrade/ProyectoPokemon/res/ash/ash_BACK0.png");
        }else
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            Player.dy = 0;
            Player.play = new Loader().Loader2("/me/elAndrade/ProyectoPokemon/res/ash/ash_FRONT0.png");
        }else
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            Player.dx = 0;
            Player.play = new Loader().Loader2("/me/elAndrade/ProyectoPokemon/res/ash/ash_LEFT0.png");
        }else
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            Player.dx = 0;
            Player.play = new Loader().Loader2("/me/elAndrade/ProyectoPokemon/res/ash/ash_RIGHT0.png");
        }
    }
    
}
//Simplemente un manager para mover al mapa con el teclado