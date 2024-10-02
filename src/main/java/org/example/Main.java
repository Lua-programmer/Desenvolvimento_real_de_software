package org.example;

import org.example.statement.BankStatementAnalyzer;
import org.example.statement.BankStatementCSVParser;

public class Main {

    public static void main(final String... args) throws Exception {
        BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();
        BankStatementCSVParser bankStatementCSVParser = new BankStatementCSVParser();
        final String fileName = "extrato.csv";

        bankStatementAnalyzer.analyze(fileName, bankStatementCSVParser);

    }
}
