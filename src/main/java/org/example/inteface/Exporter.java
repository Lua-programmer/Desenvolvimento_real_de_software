package org.example.inteface;

import org.example.domain.SummaryStatistics;

public interface Exporter {
    String export(SummaryStatistics summaryStatistics);
}
