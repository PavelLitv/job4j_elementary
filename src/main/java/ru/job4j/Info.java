package ru.job4j;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Info {
    public static void main(String[] args) {
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
    }
}
