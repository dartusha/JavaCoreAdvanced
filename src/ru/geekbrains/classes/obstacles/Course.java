package ru.geekbrains.classes.obstacles;

import ru.geekbrains.classes.Participant;
import ru.geekbrains.classes.Team;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle[] obstacles){
        this.obstacles=obstacles;
        System.out.println("Создана полоса препятствий");
    }

    public void doIt(Team team){
        System.out.println("Запущено прохождение полосы препятствий для команды "+team.getName());
        for (Participant participant : team.getParticipants()) {

            for (Obstacle obstacle : obstacles) {
                obstacle.doIt(participant);
                if (!participant.isOnDistance()) {
                    break;
                }
            }
        }
    }

}
