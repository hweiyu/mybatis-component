package hwy.frame;

import javax.swing.*;

/**
 * 主窗体程序
 */
public class MainFrame extends JFrame {

    /**
     * 组件的集合对象
     */
    private FrameComponent component;

    public MainFrame(FrameComponent component) {
        this.component = component;
        //初始化窗体
        initBase();
        //初始化窗体中的所有组件
        initComponents();
        //设置窗体可见性
        setVisible();
    }

    private void initBase() {
        this.setTitle("mybatis逆向工程组件(JDK 1.8)");
        this.setSize(700, 350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * 设置窗体可见性。必须要放到最后设置，否则某些组件显示不全
     */
    private void setVisible() {
        this.setVisible(true);
    }

    /**
     * 初始化窗体中的所有组件
     */
    private void initComponents() {
        this.add(this.component.getPanel());
    }

}
