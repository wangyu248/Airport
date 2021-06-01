package main;

import java.awt.Graphics;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
 * 画布类
 */
public class GamePanel extends JPanel{
    GamePanel gamePanel=this;
    private JFrame mainFrame=null;
    //构造里面初始化相关参数
    public GamePanel(JFrame frame){
        this.setLayout(null);
        mainFrame = frame;

        mainFrame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {

    }
}
