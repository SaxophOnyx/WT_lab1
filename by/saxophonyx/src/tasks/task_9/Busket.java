package tasks.task_9;

import tasks.components.Color;

import java.util.ArrayList;

public class Busket {
    private ArrayList<Ball> balls;

    public Busket() {
        balls = new ArrayList<Ball>();
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public int getTotalWeight() {
        int res = 0;
        for (Ball ball : balls)
            res += ball.getWeight();

        return res;
    }

    public int getBallsAmount(Color targetColor) {
        int res = 0;
        for (Ball ball : balls)
            if (ball.getColor() == targetColor)
                ++res;

        return  res;
    }
}
