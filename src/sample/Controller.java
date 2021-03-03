package sample;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    public TextField textField;
    public TextArea textArea;

    public void addMessage() {
        String message = textField.getText();
        if (message.length() > 0) {
            textArea.appendText(textField.getText() + "\n");
            textField.clear();
        }
    }
}
