package game;

import java.awt.*;

public class Guard2 {
    private int row;
    private int col;
    private String color;
    private int point;

    public Guard2(int row, int col) {
        this.row = row;
        this.col = col;

    }
    public void render(Graphics g) {

        g.setColor(Color.YELLOW);
        g.fillOval(285, 320, 40, 40);
        g.setColor(Color.YELLOW);
        g.fillOval(220, 320, 40, 40);
        g.setColor(Color.YELLOW);
        g.fillOval(150, 320, 40, 40);
        g.setColor(Color.YELLOW);
        g.fillOval(82, 320, 40, 40);
    }
}
