package main;

import javax.swing.*;
import java.awt.*;

/*游戏窗体*/

public class GameFrame extends JFrame {
    public GameFrame(){
        setTitle("飞机大战");   /*设置标题*/
        setSize(526,685); /*设置窗体尺寸*/
        setLayout(new BorderLayout());  /*开辟一个新窗体*/
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /*关闭窗体*/
        /*setLocation(null);  *//*设置窗体位置*/
        setResizable(false); /*允许窗体被修改*/
    }
}
