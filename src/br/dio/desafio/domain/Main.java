package br.dio.desafio.domain;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Development in Java");
        bootcamp.getContents().add(new Course("Course A", "Basics", 6));
        bootcamp.getContents().add(new Mentoring("Mentoring A", "Intro", LocalDate.now()));
        Dev dev = new Dev("Wagner");
        dev.enrollBootcamp(bootcamp);
        dev.advance();
        System.out.println("Enrolled contents" + dev.getEnrolledContents());
        System.out.println("Enrolled contents" + dev.getFinishedContents());

    }
}
