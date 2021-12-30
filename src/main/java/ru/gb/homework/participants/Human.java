package ru.gb.homework.participants;

public class Human implements RunJumper {
    private final String name;
    private final int jumpHeight;
    private final int runLength;

    private boolean participates;

    public Human(String name, int jumpHeight, int runLength) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
        this.participates = true;
    }

    @Override
    public boolean run(int length) {
        participates = runLength >= length;
        return participates;
    }

    @Override
    public boolean jump(int weight) {
        participates = jumpHeight >= weight;
        return participates;
    }

    @Override
    public String getName() {
        return "Человек " + name;
    }

    @Override
    public boolean isParticipates() {
        return participates;
    }
}
