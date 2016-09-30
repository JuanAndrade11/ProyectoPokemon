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
public class DirtTile extends Tile{
    
    public DirtTile(int x, int y) throws IOException {
        super(x, y,new Loader().Loader2("/me/elAndrade/ProyectoPokemon/res/tiles/dirt.png"), true, TileType.DIRT,false);
    }
    
}
//Hereda a tile y genera un tile de barro sobre el cual no se puede pasar