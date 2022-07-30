package br.dio.desafio.domain;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Mentoring extends Content {
    private final LocalDate date;

    public Mentoring(String title, String description, LocalDate date) {
        super(title, description);
        this.date = date;
    }

    @Override
    public double calculateXP() {
        return DEFAULT_XP + 20;
    }
}
