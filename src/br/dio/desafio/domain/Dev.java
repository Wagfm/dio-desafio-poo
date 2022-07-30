package br.dio.desafio.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Getter
@EqualsAndHashCode
@ToString
public class Dev {
    private final String name;
    private final Set<Content> enrolledContents = new LinkedHashSet<>();
    private final Set<Content> finishedContents = new LinkedHashSet<>();

    public Dev(String name) {
        this.name = name;
    }

    public void enrollBootcamp(Bootcamp bootcamp) {
        this.enrolledContents.addAll(bootcamp.getContents());
    }

    public void advance() {
        Optional<Content> content = this.enrolledContents.stream().findFirst();
        if (content.isPresent()) {
            this.finishedContents.add(content.get());
            this.enrolledContents.remove(content.get());
        } else {
            throw new RuntimeException("You're not enrolled in any content!");
        }
    }

    public double calculateTotalXp() {
        return this.finishedContents.stream().mapToDouble(Content::calculateXP).sum();
    }
}
