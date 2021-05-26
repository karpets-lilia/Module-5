package calendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*Создать класс Календарь с внутренним классом, с помощью обьектов которого можно хранить
* информацию о выходных и праздничных днях.*/

public class Main {
    public static void main(String[] args) {
        int year = 2021;
        Calendar calendar = new Calendar(year);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        calendar.addHoliday(LocalDate.parse("01.01." + year, dtf), "New Year");
        calendar.addHoliday(LocalDate.parse("07.01." + year, dtf), "Orthodox Christmas");
        calendar.addHoliday(LocalDate.parse("08.03." + year, dtf), "Women’s Day");
        calendar.addHoliday(LocalDate.parse("01.05." + year, dtf), "Labour Day");
        calendar.addHoliday(LocalDate.parse("09.05." + year, dtf), "Victory Day");

        calendar.printHolidays();
    }
}