package com.java.practice.abstraction;


abstract class ReportGenerator {
    // Concrete methods
    void fetchData() {
        System.out.println("Fetching raw records from database...");
    }

    void closeConnection() {
        System.out.println("Database connection closed.\n");
    }

    // Abstract methods
    abstract void formatReport();
    abstract void exportReport();
}

class PdfReportGenerator extends ReportGenerator {
    @Override
    void formatReport() {
        System.out.println("Formatting records into PDF layout.");
    }

    @Override
    void exportReport() {
        System.out.println("Exporting report as summary.pdf.");
    }
}

public class P8_PartialAbstractionDemo {
	public static void main(String[] args) {
        ReportGenerator report = new PdfReportGenerator();
        report.fetchData();
        report.formatReport();
        report.exportReport();
        report.closeConnection();
    }
}
