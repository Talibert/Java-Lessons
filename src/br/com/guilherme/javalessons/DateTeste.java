package br.com.guilherme.javalessons;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTeste {
    public static void main(String[] args) throws Exception {
        // Atribui a data atual em um objeto to tipo LocalDate
        LocalDate date = LocalDate.now();
        System.out.println(date);

        // Atribui a data atual com hora em um objeto do tipo LocalDateTime
        LocalDateTime date1 = LocalDateTime.now();
        System.out.println(date1);

        // Atribui a data global atual em um objeto do tipo Instant
        Instant date2 = Instant.now();
        System.out.println(date2);

        // Converte uma String de data em um objeto do tipo LocalDate
        LocalDate d01 = LocalDate.parse("2022-07-20");
        System.out.println(d01);

        // Converte uma String de Data com hora em um objeto do tipo LocalDateTime
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        System.out.println(d02);

        // Converte uma String de Data Global em um objeto do tipo instant. O Z no final indica que é o horário de Greenwich (Londres)
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
        System.out.println(d03);

        // Define um objeto do tipo DateTimeFormatter que irá armazenar um padrão de formatação
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(date.format(fmt1));
        // Podemos passar a instancia do objeto diretamente como argumento
        System.out.println(date1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

        // Define um objeto DateTimeFormatter com fuso horário, pegando o fuso horário do sistema da máquina do usuário
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        // O instant não tem acesso ao método format, portanto, podemos aplicar a formatação dessa forma
        System.out.println(fmt2.format(date2));

        // Converte um Instant para um LocalDate do fuso horário da máquina do usuário
        LocalDate d04 = LocalDate.ofInstant(date2, ZoneId.systemDefault());
        System.out.println(d04);

        // Converte um Instant para um LocalDateTime do fuso horário da zona informada
        LocalDateTime d05 = LocalDateTime.ofInstant(date2, ZoneId.of("America/Sao_Paulo"));
        System.out.println(d05);

        // Pegando a hora de uma data
        System.out.println(d05.getHour());
        // Pegando o dia da semana de uma data
        System.out.println(d05.getDayOfWeek());
        // Pegando o mes de uma data
        System.out.println(d05.getMonth());

        // Subtraindo um dia de uma data
        LocalDate pastDayDate = date.minusDays(1);
        System.out.println(pastDayDate);
        // Subtraindo uma semana de uma data
        LocalDate pastWeekDate = date.minusWeeks(1);
        System.out.println(pastWeekDate);
        // Subtraindo um mês de uma data
        LocalDate pastMonthDate = date.minusMonths(1);
        System.out.println(pastMonthDate);

        // Subtraindo 7 dias de um Instant. Ele não tem acesso aos métodos minusWeeks, minusDays e minusMonths, por isso devemos usar o método minus, passando o ChronoUnit
        Instant pastWeekInstant = date2.minus(7, ChronoUnit.DAYS);
        System.out.println(pastWeekInstant);

        // Calculando o periodo entre dois objetos LocalDate
        Period period = Period.between(pastWeekDate, date);
        System.out.println(period.getDays());

        // Calculando o periodo entre dois objetos LocalDateTime
        Duration duration = Duration.between(d02, date1);
        System.out.println(duration.toDays());
    }
}
