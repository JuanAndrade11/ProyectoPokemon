/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.elAndrade.ProyectoPokemon.World;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import me.elAndrade.ProyectoPokemon.Main.Main;
import me.elAndrade.ProyectoPokemon.Player.Player;
import me.elAndrade.ProyectoPokemon.Tiles.DirtTile;
import me.elAndrade.ProyectoPokemon.Tiles.GrassTile;
import me.elAndrade.ProyectoPokemon.Tiles.HighGrassTile;
import me.elAndrade.ProyectoPokemon.Tiles.Tile;
import me.elAndrade.ProyectoPokemon.Tiles.WaterTile;
import me.elAndrade.ProyectoPokemon.Tools.Loader;

/**
 *
 * @author JuanPablo
 */
public class World {
    public static ArrayList<Tile> tiles = new ArrayList<Tile>();
    public static Rectangle tileBounds = new Rectangle(0,0, Main.width, Main.height);
    int worldWidth;
    int worldHeight;
    
    public static int xOffset = 0;
    public static int yOffset = 0;
    
    public Player p;
    
    
    public World(int worldWidth, int worldHeight) throws IOException{
        this.worldWidth = worldWidth;
        this.worldHeight = worldHeight;
        p= new Player(25,25,new Loader().Loader2("/me/elAndrade/ProyectoPokemon/res/ash/ash_FRONT0.png"),5);
        generateWorld();
    }
    public void generateWorld() throws IOException{
        Random r = new Random();
        int index = 0;
        
        for (int x = 0; x < worldWidth; x++) {
            for (int y = 0; y < worldHeight; y++) {
                index = r.nextInt(11);
                if(index == 0){
                    tiles.add(new WaterTile(x*Tile.size,y*Tile.size));
                }else if(index == 1| index == 2){
                    tiles.add(new DirtTile(x*Tile.size,y*Tile.size));
                }else if(index == 10){
                    tiles.add(new HighGrassTile(x*Tile.size,y*Tile.size));    
                }else{
                    tiles.add(new GrassTile(x*Tile.size,y*Tile.size));
                }
            }
            
        }
    }
    
    public void tick(){
        for(Tile t : tiles){
            t.tick();
        }
        p.tick();
    }
    
    public void render(Graphics2D g){
        for(Tile t : tiles){
            t.render(g);
        }
        p.render(g);
    }
}
//Aqui se creó la clase mundo la cual instanciará al jugador y generará el mapa de manera aleatoria    
