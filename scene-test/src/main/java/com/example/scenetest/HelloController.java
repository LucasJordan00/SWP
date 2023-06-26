package com.example.scenetest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.File;
import java.util.Random;

public class HelloController {
    private File file;

    @FXML
    private Label welcomeText;

    @FXML
    private Button btnSave;

    @FXML
    private TextArea fldTxtArea;

    @FXML
    private Button btnRandNum;

  

    @FXML
    private Button btnOpen;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void btnPressOpen(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();

        Stage s = (Stage) btnOpen.getScene().getWindow();
        File selectedFile = fileChooser.showOpenDialog(s);
        fldTxtArea.setText(readFileAsString(selectedFile.getAbsolutePath()));
        System.out.println("open");
        this.file = selectedFile;
    }
        public String readFileAsString(String filePath) {
            StringBuilder content = new StringBuilder();

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            } catch (IOException e) {
                // Handle any exceptions here
                e.printStackTrace();
            }

            return content.toString();
        }

        public static void writeRandomNumberToFile(String filePath) {
            Random random = new Random();
            int randomNumber = random.nextInt(99999);

            try (FileWriter writer = new FileWriter(filePath)) {
                writer.write(String.valueOf(randomNumber));
            } catch (IOException e) {
                // Handle any exceptions here
                e.printStackTrace();
            }
        }

            public void btnPressSave(ActionEvent actionEvent) {
    }

    public void btnPressRandNum(ActionEvent actionEvent) {
        String filePath = file.getAbsolutePath();
        writeRandomNumberToFile(filePath);

    }
}