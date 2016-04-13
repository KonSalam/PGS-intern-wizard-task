package com.pgs.intern.wizard.task;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;


public class Controller {

    Person person;
    ObservableList<String> data = FXCollections.observableArrayList();

    @FXML
    private TabPane tabPane;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField surnameTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private TextField numberTextField;
    @FXML
    private ListView dataList;


    @FXML
    private void nameTextGet() {
        person.setName(nameTextField.getText());
    }

    @FXML
    private void surnameTextGet() {
        person.setSurname(surnameTextField.getText());
    }

    @FXML
    private void addressTextGet() {
        person.setAddress(addressTextField.getText());
    }

    @FXML
    private void numberTextGet() {
        person.setPhoneNumber(numberTextField.getText());
    }


    @FXML
    private void nextPage() {
        tabPane.getSelectionModel().select(tabPane.getSelectionModel().getSelectedIndex() + 1);
    }

    @FXML
    private void nextPageSecond() {
        tabPane.getSelectionModel().select(tabPane.getSelectionModel().getSelectedIndex() + 1);
    }

    @FXML
    private void nextPageThird() {
        tabPane.getSelectionModel().select(tabPane.getSelectionModel().getSelectedIndex() + 1);
    }

    @FXML
    private void nextPageFourth() {
        tabPane.getSelectionModel().select(tabPane.getSelectionModel().getSelectedIndex() + 1);
        setEmptyArguments();
        data.addAll("Imie : " + person.getName(), "Nazwisko : " + person.getSurname(), "Adres : " + person.getAddress(), "Numer : " + person.getPhoneNumber());
    }

    @FXML
    private void backPageSecond() {
        tabPane.getSelectionModel().select(tabPane.getSelectionModel().getSelectedIndex() - 1);
    }

    @FXML
    private void backPageThird() {
        tabPane.getSelectionModel().select(tabPane.getSelectionModel().getSelectedIndex() - 1);
    }

    @FXML
    private void backPageFourth() {
        tabPane.getSelectionModel().select(tabPane.getSelectionModel().getSelectedIndex() - 1);
    }

    private void setEmptyArguments() {
        if (person.getName() == null || person.getName().length() == 0) {
            person.setName("BRAK");
        }
        if (person.getSurname() == null || person.getSurname().length() == 0) {
            person.setSurname("BRAK");
        }
        if (person.getAddress() == null || person.getAddress().length() == 0) {
            person.setAddress("BRAK");
        }
        if (person.getPhoneNumber() == null || person.getPhoneNumber().length() == 0) {
            person.setPhoneNumber("BRAK");
        }
    }

    @FXML
    void initialize() {
        person = new Person();
        dataList.setItems(data);
    }

}
