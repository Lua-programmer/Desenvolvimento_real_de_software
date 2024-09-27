package org.example.statement;

import org.example.domain.BankTransaction;
import org.example.inteface.BankStatementParser;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankStatementCSVParserTest {

    private final BankStatementParser bankStatementParser = new BankStatementCSVParser();

    @Test
    public void shouldParseOneCorrectLine() {
        final String line = "30-01-2017,-50,Tesco";

        final BankTransaction result = bankStatementParser.parseFrom(line);
        final BankTransaction expected = new BankTransaction(LocalDate.of(2017, 1, 30), -50, "Tesco");
        final double tolerance = 0.0d;

        assertEquals(expected.getDate(), result.getDate());
        assertEquals(expected.getAmount(), result.getAmount(), tolerance);
        assertEquals(expected.getDescription(), result.getDescription());
    }

    @Test
    public void shouldParseMultipleLines() {

        final List<String> transactions = List.of(
                "30-01-2017,-50,Tesco",
                "30-01-2017,-50,Tesco",
                "30-01-2017,-50,Tesco"
        );

        final List<BankTransaction> expected = List.of(
                new BankTransaction(LocalDate.of(2017, 1, 30), -50, "Tesco"),
                new BankTransaction(LocalDate.of(2017, 1, 30), -50, "Tesco"),
                new BankTransaction(LocalDate.of(2017, 1, 30), -50, "Tesco")
        );

        final List<BankTransaction> result = bankStatementParser.parseLinesFrom(transactions);

        assertEquals(expected.size(), result.size());
    }

}