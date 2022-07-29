package br.dio.desafio.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Course {
    private String title;
    private String description;
    private int hoursLoad;

}
