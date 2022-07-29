package br.dio.desafio.domain;

public class Main {
    public static void main(String[] args) {
        Course myCourse = new Course();
        myCourse.setTitle("Java #1");
        myCourse.setDescription("Java basics");
        myCourse.setHoursLoad(6);
        System.out.println(myCourse);
    }
}
