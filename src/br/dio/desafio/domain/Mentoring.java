package br.dio.desafio.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Mentoring {
    private String title;
    private String description;
    private LocalDate date;
}
