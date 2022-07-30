package br.dio.desafio.domain;

import lombok.Getter;

@Getter
public class Course extends Content {
    private final int hoursLoad;

    public Course(String title, String description, int hoursLoad) {
        super(title, description);
        this.hoursLoad = hoursLoad;
    }

    @Override
    public double calculateXP() {
        return DEFAULT_XP * this.hoursLoad;
    }
}
