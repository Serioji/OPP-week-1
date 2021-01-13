package game;

import java.awt.*;

public class Leader {
    private int row;
    private int col;
    private String color;
    private int point;

    public Leader(int row, int col) {
        this.row = row;
        this.col = col;


    }
    public void render(Graphics g) {

        g.setColor(Color.YELLOW);
        g.fillRect(287, 50, 35, 35);
    }
}
