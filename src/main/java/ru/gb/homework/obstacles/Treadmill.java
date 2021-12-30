package ru.gb.homework.obstacles;

import ru.gb.homework.participants.RunJumper;

public class Treadmill implements Obstacle {
    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public void overcome(RunJumper runJumper) {
        if (runJumper.isParticipates() && runJumper.run(length)) {
            System.out.println(runJumper.getName() + " пробежал " + length);
        }
    }
}
