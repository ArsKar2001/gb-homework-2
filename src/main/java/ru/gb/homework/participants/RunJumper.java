package ru.gb.homework.participants;

public interface RunJumper {
    boolean run(int length);

    boolean jump(int weight);

    boolean isParticipates();

    String getName();
}
