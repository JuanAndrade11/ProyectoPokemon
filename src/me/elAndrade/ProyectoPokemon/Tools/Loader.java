/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.elAndrade.ProyectoPokemon.Tools;

import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author JuanPablo
 */
public class Loader {

   
    public BufferedImage Loader2(String imagen){
        try{
            URL ruta = getClass().getResource(imagen);
            BufferedImage temp_image = ImageIO.read(ruta);
            return temp_image;
        }catch(Exception e){
            System.out.println("No Se Pudo Cargar La Imagen");
            return null;
        }
    }
}
//Cargador de imagenes