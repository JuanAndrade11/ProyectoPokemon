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
public class WaterTile extends Tile{
    
    public WaterTile(int x, int y) throws IOException {
        super(x, y,new Loader().Loader2("/me/elAndrade/ProyectoPokemon/res/tiles/water.png"), false, TileType.WATER,false);
    }
    
}
//Clase que extiende a tile, solo visual