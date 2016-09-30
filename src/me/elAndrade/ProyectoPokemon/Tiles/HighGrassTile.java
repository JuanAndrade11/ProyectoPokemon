/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.elAndrade.ProyectoPokemon.Tiles;

import java.io.IOException;
import me.elAndrade.ProyectoPokemon.Tools.Loader;

/**
 *
 * @author JuanPablo
 */
public class HighGrassTile extends Tile{
     
    public HighGrassTile(int x, int y) throws IOException {
       
        super(x, y,new Loader().Loader2("/me/elAndrade/ProyectoPokemon/res/tiles/highgrass.png"), false, TileType.HIGHGRASS,true);
    }

    
}
//Clase que extiende a tile donde al tocarla se iniciará una batalla pokemon