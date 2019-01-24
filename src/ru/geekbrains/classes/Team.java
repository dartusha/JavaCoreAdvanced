package ru.geekbrains.classes;

public class Team{
    private String name;
    private Participant[] participants;

    public Team(String name,  Participant[] participants){
        this.name=name;
        this.participants=participants;
        System.out.println("Создана команда "+name);
    }

    public String getName() {
        return name;
    }

    public void showResults(){
        System.out.println("Результаты прохождения:");
        for (Participant participant:participants){
                System.out.println("Участник "+(participant.isOnDistance() ? participant.getName() + " : " + "прошел дистанцию" : participant.getName() + " : " + "сошел с дистанции")) ;
        }
    }

    public void teamInfo(){
        for (Participant participant:participants){
            System.out.println("Участник "+participant.getName());
        }
    }

    public Participant[] getParticipants() {
        return participants;
    }
}
