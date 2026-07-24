package com.SystemDesign.SolidPrinciple.LiskovSubstitutionPrinciple;

interface Document1 {
    void open();
    String getData();
}
interface Editable extends Document1 {
    void save(String newData);
}
class EditableDocument implements Editable {
    private String data;

    public EditableDocument(String data) {
        this.data = data;
    }

    @Override
    public void open() {
        System.out.println("Editable Document opened. Data: " + preview());
    }

    @Override
    public void save(String newData) {
        this.data = newData;
        System.out.println("Document saved.");
    }

    @Override
    public String getData() {
        return data;
    }

    private String preview() {
        return data.substring(0, Math.min(data.length(), 20)) + "...";
    }
}
class ReadOnlyDocument1 implements Document1 {
    private final String data;

    public ReadOnlyDocument1(String data) {
        this.data = data;
    }

    @Override
    public void open() {
        System.out.println("Read-Only Document opened. Data: " + preview());
    }

    @Override
    public String getData() {
        return data;
    }

    private String preview() {
        return data.substring(0, Math.min(data.length(), 20)) + "...";
    }
}
class DocumentProcessor1 {
    public void process(Document doc) {
        doc.open();
        System.out.println("Document processed.");
    }

    public void processAndSave(Editable doc, String additionalInfo) {
        doc.open();
        String currentData = doc.getData();
        String newData = currentData + " | Processed: " + additionalInfo;
        doc.save(newData);
        System.out.println("Editable document processed and saved.");
    }
}
public class MainDocument {
    public static void main(String[] args) {
        EditableDocument editable = new EditableDocument("Draft proposal for Q3.");
        ReadOnlyDocument readOnly = new ReadOnlyDocument("Top secret strategy.");

        DocumentProcessor1 processor = new DocumentProcessor1();

        System.out.println("--- Processing Editable Document ---");
        processor.processAndSave(editable, "Reviewed by Alice");

        System.out.println("\n--- Processing Read-Only Document ---");
        processor.process(readOnly); // Works fine

    }
}
