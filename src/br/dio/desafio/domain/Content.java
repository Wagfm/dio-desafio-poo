package br.dio.desafio.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class Content {
    protected static final double DEFAULT_XP = 10;
    private final String title;
    private final String description;

    public Content(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public abstract double calculateXP();
}
