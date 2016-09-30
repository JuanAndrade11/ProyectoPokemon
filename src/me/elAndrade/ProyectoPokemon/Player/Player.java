/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.elAndrade.ProyectoPokemon.Player;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import me.elAndrade.ProyectoPokemon.Main.Main;
import me.elAndrade.ProyectoPokemon.Tiles.Tile;
import me.elAndrade.ProyectoPokemon.World.World;

/**
 *
 * @author JuanPablo
 */
public class Player {
    public static int x;
    public static int y;
    public static int dx;
    public static int dy;
    public int width;
    public int height;
    public static int pokeballs;
    boolean canMove;
    public static BufferedImage play;
    public static ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    public static Rectangle rect;
    static Scanner sc = new Scanner(System.in);
    
    public Player(int width, int height, BufferedImage play,int pokeballs){
        this.x = (Main.width/2)-(width/2);
        this.y = (Main.height/2)-(height/2);
        this.width = width;
        this.height = height;
        rect = new Rectangle(x,y,width,height);
        this.play = play;
        this.pokeballs = pokeballs;
    }
    
    public void tick(){
        canMove = true;
        for(Tile t : World.tiles){
            if(t.isSolid){
                if(t.rect.intersects(Player.x - dx,Player.y - dy,Player.rect.width,Player.rect.height)){
                    canMove = false;
                }
            }
            else if(t.isPokemon){
            if(t.rect.intersects(Player.x - dx,Player.y - dy,Player.rect.width,Player.rect.height)){
                Random r = new Random();
                int index,ind2,ale,ale2;
                int op,op2,res,sw;
                res=1;
                sw=0;
                index = r.nextInt(10) + 1;
                ind2 = r.nextInt(10) + 1;
                
                
                boolean pik = true;
                Pokemon charmander = new Pokemon(300,5,14,4,index,"charmander");
                Pokemon pikachu = new Pokemon(245,2,4,4,ind2,"Pikachu");
                System.out.println("Batalla Empezada entre Charmander y Pikachu");
                do{
                    System.out.println("Escoja el ataque a realizar (1. Fisico, 2. Especial)");
                    op = sc.nextInt();
                    if(op == 1){
                        pikachu.salud = charmander.ataque_Fisico(pikachu.salud);
                    }else if(op == 2){
                        pikachu.salud = charmander.ataque_Especial(pikachu.salud);
                    }    
                    System.out.println("La vida de pikachu es"+pikachu.salud);
                    System.out.println("Ahora ataca pikachu");
                    ale = r.nextInt(2)+1;
                    if(ale == 1){
                        charmander.salud = pikachu.ataque_Fisico(charmander.salud);
                    }else if(ale == 2){
                        charmander.salud = pikachu.ataque_Especial(charmander.salud);
                    }
                    System.out.println("La vida de charmander es"+charmander.salud);
                    if(charmander.salud <= 0){
                        System.out.println("Juego Terminado");
                        System.exit(0);
                    }
                    if(pikachu.salud <= 5){
                        pik = false;
                        t.isPokemon = false;
                        if(Player.pokeballs >0){
                            System.out.println("Desea atrapar a pikachu?(1.Si, 2. No)");
                            op2 = sc.nextInt();
                            if(op2 == 1){
                                while(res == 1 & sw==0 & Player.pokeballs>0){
                                    
                                    ale2 = r.nextInt(2);
                                    if(ale2 == 0){
                                    System.out.println("Pikachu Capturado!!");
                                    pikachu.salud = 245;
                                    pokemons.add(pikachu);
                                    Player.pokeballs = Player.pokeballs - 1;
                                    sw = 1;
                                    }
                                    else{
                                       System.out.println("No ha podido capturar a pikachu");
                                       System.out.println("Desea volver a intentar capturar a pikachu?(1.Si,2.No)");
                                       res = sc.nextInt(); 
                                    }
                                }
                                if(Player.pokeballs == 0){
                                    System.out.println("Se Acabaron las pokeballs");
                                }
                            }
                        }
                    } 
                }while(pik);
                System.out.println("Quiere ver lista de pokemons?(1.SI,2.NO)");
                res = sc.nextInt();
                if(res == 1){
                    for(Pokemon pokemon : pokemons){
                        System.out.println(Pokemon.nombre);
                    }
                    System.out.println("Pokeballs restantes"+Player.pokeballs);
                }
            }        
        }
    }
        
        if(canMove){
            World.xOffset += dx;
            World.yOffset += dy;
        }
            
    }
    
    public void render(Graphics2D g){
        g.drawImage(play, x-3, y-5, null);
    }
}
//Aqui se crea la clase del Jugador donde se establece el tema de las colisiones, del combate por turnos y el capturar al pokemon 