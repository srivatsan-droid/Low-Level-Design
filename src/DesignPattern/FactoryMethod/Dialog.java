package DesignPattern.FactoryMethod;

public abstract class Dialog {
    public void renderWindow() {
        Button okbutton = createButton();
        okbutton.render();
    }
    public abstract Button createButton();
}
