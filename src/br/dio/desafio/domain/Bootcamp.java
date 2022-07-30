package br.dio.desafio.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@EqualsAndHashCode
@ToString
public class Bootcamp {
    private final String name;
    private final String description;
    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate finalDate = initialDate.plusDays(45);
    private final Set<Dev> enrolledDevs = new HashSet<>();
    private final Set<Content> contents = new LinkedHashSet<>();

    public Bootcamp(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
