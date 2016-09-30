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
public class GrassTile extends Tile{
     
    public GrassTile(int x, int y) throws IOException {
       
        super(x, y,new Loader().Loader2("/me/elAndrade/ProyectoPokemon/res/tiles/grass.png"), false, TileType.GRASS,false);
    }

    
}
//Clase que extiende a tile genera hierba normal