package com.kodilla.rps;

import java.util.Random;

public class RpsPlayer {
    private String name;
    private int playerType;
    private int score;

    public RpsPlayer(String name, int playerType) {
        this.name = name;
        this.playerType = playerType;
    }

    public int shuffle() {
        Random random = new Random();
        //int selection = random.nextInt(3)+1;
        return random.nextInt(3)+1;
    }

    public void addPoint() {
        score++;
        System.out.println("Wygrał " + name + "!");
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "RpsPlayer " +
                "name='" + name + '\'' +
                ", score=" + score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RpsPlayer rpsPlayer = (RpsPlayer) o;

        if (score != rpsPlayer.score) return false;
        return name.equals(rpsPlayer.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + score;
        return result;
    }
}
