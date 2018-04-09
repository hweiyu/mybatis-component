package hwy.model.param;

import java.awt.*;

/**
 * swing组件坐标
 */
public class Position {

    /**
     * x坐标
     */
    private int x;

    /**
     * y坐标
     */
    private int y;

    /**
     * 宽度
     */
    private int width;

    /**
     * 高度
     */
    private int height;

    /**
     * 步长
     */
    private int step;

    public Position(int x, int y, int width, int height, int step) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.step = step;
    }

    /**
     * 下一个组件坐标
     * @return
     */
    public Position nextY() {
        setY(getY() + getStep());
        return this;
    }

    /**
     * 转换成swing组件对应的坐标实体
     * @return
     */
    public Rectangle convertToRect() {
        return new Rectangle(getX(), getY(), getWidth(), getHeight());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
}
