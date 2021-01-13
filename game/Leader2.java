package game;

import java.awt.*;

public class Leader2 {
    private int row;
    private int col;
    private int point;

    public Leader2(int row, int col) {
        this.row = row;
        this.col = col;



    }
    public void render(Graphics g) {

        g.setColor(Color.GREEN);
        g.fillRect(17, 323, 35, 35);
    }

}
