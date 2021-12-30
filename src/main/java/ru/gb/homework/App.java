package ru.gb.homework;

import ru.gb.homework.obstacles.Obstacle;
import ru.gb.homework.obstacles.Treadmill;
import ru.gb.homework.obstacles.Wall;
import ru.gb.homework.participants.Cat;
import ru.gb.homework.participants.Human;
import ru.gb.homework.participants.Robot;
import ru.gb.homework.participants.RunJumper;

public class App {
    public static void main(String[] args) {
        RunJumper[] participants = {
                new Cat("Барсик", 150, 500),
                new Robot("Мегатрон", 100, 550),
                new Human("Василий", 90, 450)
        };

        Obstacle[] obstacles = {
                new Wall(80),
                new Wall(100),
                new Treadmill(400),
                new Wall(100),
                new Treadmill(450),
                new Wall(120),
                new Treadmill(500),
                new Wall(170),
                new Treadmill(400),
                new Treadmill(550)
        };

        for (RunJumper participant : participants)
            for (Obstacle obstacle : obstacles)
                obstacle.overcome(participant);
    }
}
