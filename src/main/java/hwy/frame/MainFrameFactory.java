package hwy.frame;

/**
 * 主窗体程序工厂，用于生成主窗体
 */
public class MainFrameFactory {

    /**
     * 生成主窗体
     */
    public static void createMainFrame() {
        new MainFrame(new FrameComponentFactory().create());
    }
}
