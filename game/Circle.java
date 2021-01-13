package game;

import java.awt.*;

public class Circle {
    private int row;
    private int col;
    private String color;
    private int point;

    public Circle(int row,int col){
        this.row = row;
        this.col = col;

    }

    public void render(Graphics g) {


        g.setColor(Color.GRAY);
        g.fillOval(154, 190, 25, 25);
    }

}
