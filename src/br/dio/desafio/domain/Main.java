package br.dio.desafio.domain;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Development in Java");
        bootcamp.getContents().add(new Mentoring("Mentoring A", "Intro", LocalDate.now()));
        bootcamp.getContents().add(new Course("Course A", "Basics I", 4));
        bootcamp.getContents().add(new Course("Course B", "Basics II", 6));
        Dev dev = new Dev("Wagner");
        dev.enrollBootcamp(bootcamp);
        System.out.println("Enrolled contents" + dev.getEnrolledContents());
        System.out.println("Finished contents" + dev.getFinishedContents());
        dev.advance();
        System.out.println("Advance...");
        System.out.println("Enrolled contents" + dev.getEnrolledContents());
        System.out.println("Finished contents" + dev.getFinishedContents());
        dev.advance();
        System.out.println("Advance...");
        System.out.println("Enrolled contents" + dev.getEnrolledContents());
        System.out.println("Finished contents" + dev.getFinishedContents());
    }
}
