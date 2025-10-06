import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

class Document {
    private String content;
    public Document(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
}
interface printable{
    void print(Document doc);
}
class PDFPrinter implements printable {

    @Override
    public void print(Document doc) {
        System.out.println("Printing PDF: " +doc.getContent());
    }
}
class InkJetPrinter implements printable {
    @Override
    public void print(Document doc) {
        System.out.println("Injet printer is print the : " +doc.getContent());
    }
}
public class mainInterface {
    public static void main(String[] args) {
        Document Obj = new Document("This is Print option");
        Obj.getContent();
        PDFPrinter obj1 = new PDFPrinter();
        obj1.print(Obj);
        InkJetPrinter obj2 = new InkJetPrinter();
        obj2.print(Obj);
    }
}
