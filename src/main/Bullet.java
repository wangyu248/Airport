package main;

import java.awt.image.BufferedImage;
import java.util.HashMap;

public class Bullet {
    private int x = 0;
    private int y = 0;
    private int width = 0;
    private int height = 0;
    private BufferedImage image = null;
    private GamePanel panel = null;
    private HashMap imageMap = null;
    private boolean alive = true;

    private boolean canMove = false;
    private int speed = 20;

    public Bullet(int x, int y, int width, int height, GamePanel panel){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.panel = panel;

    }
}
