/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.elAndrade.ProyectoPokemon.Tiles;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import me.elAndrade.ProyectoPokemon.World.World;

/**
 *
 * @author JuanPablo
 */
public class Tile {
    public static final int size = 64;
    
    public int x;
    public int y;
    
    public BufferedImage image;
    public boolean isSolid;
    public boolean isPokemon;
    
    public Rectangle rect = new Rectangle();
    
    public TileType tileType;
    public Tile(int x, int y, BufferedImage image, boolean isSolid, TileType tileType, boolean isPokemon){
        this.x = x;
        this.y = y;
        
        this.image = image;
        this.isSolid = isSolid;
        this.tileType = tileType;
        this.isPokemon = isPokemon;
    }
    
    public void tick(){
        rect.setBounds( x + World.xOffset, y + World.yOffset,size, size );
       
        
    }
    
    public void render(Graphics2D g){
        g.drawImage(image, x + World.xOffset, y + World.yOffset, size, size, null);
       
    }
}
//Se define la clase Tile que es la clase de la cual se extenderán los otros tiles que son los cuadros que conforman el mapa