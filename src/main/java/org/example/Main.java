package org.example;

import org.example.statement.BankStatementAnalyzer;

public class Main {

    public static void main(final String... args) throws Exception {
        BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();
        final String fileName = "extrato.csv";

        bankStatementAnalyzer.analyze(fileName);
    }
}
