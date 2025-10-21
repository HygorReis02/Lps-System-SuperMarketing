package com.hygor.erick.security;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static String formatar(LocalDate data) {
        return data != null ? data.format(FORMATTER) : "";
    }

    public static LocalDate parse(String data) {
        return data != null ? LocalDate.parse(data, FORMATTER) : null;
    }
}

