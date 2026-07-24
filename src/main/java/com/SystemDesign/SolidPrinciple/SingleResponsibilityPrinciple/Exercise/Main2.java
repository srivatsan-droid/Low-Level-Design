package com.SystemDesign.SolidPrinciple.SingleResponsibilityPrinciple.Exercise;

import java.util.*;


class ReportGenerator {
    public List<String[]> generate() {
        List<String[]> data = new ArrayList<>();
        data.add(new String[]{"Name", "Sales", "Region"});
        data.add(new String[]{"Alice", "15000", "North"});
        data.add(new String[]{"Bob", "22000", "South"});
        data.add(new String[]{"Charlie", "18000", "East"});
        return data;
    }
}
class ReportFormatter {
    public String formatAsCsv(List<String[]> data) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.size(); i++) {
            sb.append(String.join(",", data.get(i)));
            if (i < data.size() - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
class ReportDistributor {
    public static void distribute(String recipient,String formatReport) {
        System.out.println("Sending report to: " + recipient);
        System.out.println(formatReport);
        System.out.println("Report sent successfully.");
    }
}
public class Main2 {
    public static void main(String[] args) {
        // After refactoring, usage should look like:
        ReportGenerator generator = new ReportGenerator();
        ReportFormatter formatter = new ReportFormatter();
        ReportDistributor distributor = new ReportDistributor();
        List<String[]> data = generator.generate();
        String formatted = formatter.formatAsCsv(data);
        distributor.distribute("manager@company.com", formatted);
    }
}
