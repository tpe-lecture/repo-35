package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;

public class AnalogControllerImpl implements AnalogController {

    private double deltaX;
    private double deltaY;

    public void up(double percentage) {
        deltaY-=percentage;
    }

    @Override
    public void down(double percentage) {
        deltaY+=percentage;
    }

    @Override
    public void left(double percentage) {
        deltaX-=percentage;
    }

    @Override
    public void right(double percentage) {
        deltaX+=percentage;
    }

    @Override
    public Point getPosition() {
        return (Point) new Point((int)deltaX, (int) deltaY).clone();
    }

}
