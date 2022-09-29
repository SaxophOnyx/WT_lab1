package tasks.task_2;

import tasks.components.Point;

public class PointPositionChecker {
    private Point a1;
    private Point b1;
    private Point a2;
    private Point b2;

    public PointPositionChecker()
    {
        a1 = new Point(-4, 5);
        b1 = new Point(4, 0);
        a2 = new Point(-6, 0);
        b2 = new Point(6, -3);
    }

    public boolean contains(int x, int y) {
        return inRectangle(x, y, a1, b1) || inRectangle(x, y, a2, b2);
    }

    private boolean inRectangle(int x, int y, Point topLeft, Point bottomRight) {
        return (x >= topLeft.getX()) && (x <= bottomRight.getX()) &&
               (y <= topLeft.getY()) && (y >= bottomRight.getY());
    }
}
