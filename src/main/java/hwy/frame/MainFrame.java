package hwy.frame;

import javax.swing.*;

public class MainFrame extends JFrame {

    private FrameComponent component;

    public MainFrame(FrameComponent component) {
        this.component = component;
        initBase();
        initComponents();
        setVisible();
    }

    private void initBase() {
        this.setTitle("mybatis逆向工程组件");
        this.setSize(700, 350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    //必须要放到最后设置，否则某些组件显示不全
    private void setVisible() {
        this.setVisible(true);
    }

    private void initComponents() {
        this.add(this.component.getPanel());
    }

}
