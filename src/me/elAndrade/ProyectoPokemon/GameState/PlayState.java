/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.elAndrade.ProyectoPokemon.GameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.elAndrade.ProyectoPokemon.World.World;

/**
 *
 * @author JuanPablo
 */
public class PlayState extends GameState {
    World world;
    public static Font myFont;
    
    @Override
    public void init() {
        try {
            world = new World(30,30);
        } catch (IOException ex) {
            Logger.getLogger(PlayState.class.getName()).log(Level.SEVERE, null, ex);
        }
            }

    @Override
    public void tick() {
        world.tick();
     }

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.BLACK);
        if(world != null){
            world.render(g);
        }
        
        
    }
    
}
//Esta clase se encarga de instanciar un objeto de la clase mundo, usando los metodos tick y render de la clase GameState