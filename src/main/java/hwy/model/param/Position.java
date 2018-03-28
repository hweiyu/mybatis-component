package hwy.model.param;

import java.awt.*;

public class Position {

    private int x;

    private int y;

    private int width;

    private int height;

    private int step;

    public Position(int x, int y, int width, int height, int step) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.step = step;
    }

    public Position nextY() {
        setY(getY() + getStep());
        return this;
    }

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
