package org.example.inteface;

import org.example.domain.BankTransaction;

import java.util.List;

public interface BankStatementParser {
    BankTransaction parseFrom(final String line);
    List<BankTransaction> parseLinesFrom(final List<String> lines);
}
