package com.SystemDesign.SolidPrinciple.LiskovSubstitutionPrinciple;

class Document {
    protected String data;
    public Document(String data) {
        this.data = data;
    }
    public void open() {
        System.out.println("Document opened. Data: " + data.substring(0, Math.min(data.length(), 20)) + "...");
    }
    public void save(String newData) {
        this.data = newData;
        System.out.println("Document Saved");
    }
    public String getData() {
        return data;
    }
}
class ReadOnlyDocument extends Document {
    public ReadOnlyDocument(String data) {
        super(data);
    }
    @Override
    public void save(String newData) {
        throw new UnsupportedOperationException("Cannot save a Read only Document");
    }
}
class DocumentProcessor {
    public void processAndSave(Document doc, String additionalInfo) {
        doc.open();
        String currentData = doc.getData();
        String newData = currentData + " | Processed: " + additionalInfo;
        doc.save(newData); // Critical assumption: all Documents are savable
        System.out.println("Document processing complete.");
    }

    public static void main(String[] args) {
        Document regularDoc = new Document("Initial project proposal content.");
        ReadOnlyDocument confidentialReport = new ReadOnlyDocument("Top secret government data.");

        DocumentProcessor processor = new DocumentProcessor();

        System.out.println("--- Processing Regular Document ---");
        processor.processAndSave(regularDoc, "Reviewed by Alice");

        System.out.println("\n--- Processing ReadOnly Document ---");
        try {
            processor.processAndSave(confidentialReport, "Reviewed by Bob");
        } catch (UnsupportedOperationException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}