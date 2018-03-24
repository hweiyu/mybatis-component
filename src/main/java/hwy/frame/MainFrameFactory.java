package hwy.frame;

public class MainFrameFactory {

    public static void createMainFrame() {
        new MainFrame(new FrameComponentFactory().create());
    }
}
