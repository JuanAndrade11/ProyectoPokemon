/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.elAndrade.ProyectoPokemon.Player;

import java.util.Random;

/**
 *
 * @author JuanPablo
 */
public class Pokemon {

    public int salud;
    public int fisico;
    public int especial;
    public int ph;
    public int nivel;
    public static String nombre;
    public Random ran= new Random(System.nanoTime());

    
    
    public Pokemon(int salud,int fisico, int especial, int ph, int nivel, String nombre) {
        this.salud = salud;
        this.fisico = fisico;
        this.especial = especial;
        this.ph = ph;
        this.nivel = nivel;
        this.nombre = nombre;
    }

    public int ataque_Fisico(int salud){
        int aleatorio = ran.nextInt(2);
        if(aleatorio == 0){
            System.out.println("No es efectivo");
        }else
        if(aleatorio == 1){
            System.out.println("Es efectivo");
        }else
        if(aleatorio == 2){
            System.out.println("Es Muy Efectivo");
        }
        return salud - nivel*fisico*aleatorio;
    }
    
    public int ataque_Especial(int salud){
        if(ph>0){
            ph= ph-1;
            return salud - nivel*especial;
        }else{
            System.out.println("No quedan ph");
            return salud;
        }
    }
}
//Este es el molde de los pokemones utilizados  
