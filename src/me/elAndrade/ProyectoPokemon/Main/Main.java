package me.elAndrade.ProyectoPokemon.Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import me.elAndrade.ProyectoPokemon.GameState.GameStateManager;
import me.elAndrade.ProyectoPokemon.Input.KeyManager;
//import me.elAndrade.ProyectoPokemon.input.KeyManager;

@SuppressWarnings("serial")
public class Main extends JPanel {

    static Main game;
    Graphics2D g2d;
    static JFrame frame;
    
    KeyManager km = new KeyManager();

    public static int width = 620, height = 480;
    GameStateManager gsm;
    public static void main(String[] args) {
        frame = new JFrame("Pokémon");
        game = new Main();
        frame.add(game);
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Aquí seteamos el Frame para que se vea el juego

        game.init();
        game.run();
    }

    public void init() {
          gsm = new GameStateManager();
          gsm.init();
          frame.addKeyListener(km);
    }

    public void run() {
        while (true) {
            try {
                tick();
                repaint();
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void tick() {
           gsm.tick();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g2d = (Graphics2D) g;
        g2d.setColor(Color.gray);   //Aquí se pinta el interior del frame
        g2d.fillRect(0, 0, width, height);
        gsm.render(g2d);
    }

    public static JFrame getFrame() {
        return frame;
    }

}
//Clase principal