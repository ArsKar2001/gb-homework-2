package ru.gb.homework.obstacles;

import ru.gb.homework.participants.RunJumper;

public class Wall implements Obstacle {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(RunJumper runJumper) {
        if (runJumper.isParticipates() && runJumper.jump(height)) {
            System.out.println(runJumper.getName() + " преодалел стену высотой " + height);
        }
    }
}
