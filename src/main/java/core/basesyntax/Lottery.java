package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int BALL_NUMBER_LIMIT = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(BALL_NUMBER_LIMIT));
    }
}
