package com.gcode.invoicer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class Controller extends Application {
    public static final TextField N2 = new TextField() ;
    public static final TextField N0 = new TextField();
    public static final TextField N1 = new TextField();
    public static final TextField N3 = new TextField();
    public static final TextField N4 = new TextField();
    public AnchorPane AddClient;
    public Button btn11;
    public Button btn12;
    public Button btn;
    public AnchorPane Home;
    public ImageView img1;
    public Label welcomeText1;
    public Label welcomeText;
    public Label AppName;
    public Button btn2;
    public Button btn3;
    public Button btn1;
    public Hyperlink ContactMe;
    public AnchorPane AddArticle;
    public Label articleTitle;
    public TextField articleNumber;
    public TextField articlePrice;
    public TextField articleName;
    public Button cancelbtn;
    public Button savebtn;
    public Button backbtn;
    public AnchorPane createDevis;
    public TextField numFacture;
    public DatePicker dateFacturation;
    public ComboBox <String>clientcbx;
    public TableView<FXML> list1;
    public TableColumn arc1;
    public TableColumn check1;
    public TableColumn txt1;
    public Button clearbtn;
    public Button backbtn6;
    @FXML
    private Label welcomeText2;

    public void clearC(ActionEvent actionEvent) {
    }

    public void comeback(MouseEvent mouseEvent) {
        if(!createDevis.isVisible() || !AddArticle.isVisible()) {
            createDevis.setVisible(false);
            AddArticle.setVisible(false);
            Home.setVisible(true);
        }
    }

    public void loadAddClient(MouseEvent actionEvent) {
        {
            Home.setVisible(false);
            AddClient.setVisible(true);
        }
    }

    public void loadAddDevis(MouseEvent actionEvent) {
        if(!createDevis.isVisible())
        {
            createDevis.setVisible(true);
        }
    }

    public void saveClient(ActionEvent actionEvent) {
    }

    public void back(ActionEvent actionEvent) {
        createDevis.setVisible(false);
        Home.setVisible(true);
    }

    public void loadAddArticles(ActionEvent actionEvent) {
        if (!AddArticle.isVisible()) {
            Home.setVisible(false);
            AddArticle.setVisible(true);
        }
    }

    public void loadAddArticle(MouseEvent mouseEvent) {
    }

    public void clearF(ActionEvent actionEvent) {
    }

    public void Back(MouseEvent mouseEvent) {
        Client client = new Client();
        createDevis.setVisible(false);
        Home.setVisible(true);
    }

    public void save(MouseEvent mouseEvent) {
    }

    public void Save(ActionEvent actionEvent) {
    }

    public void clearM(MouseEvent mouseEvent) {
    }

    public void loadAddClientC(ActionEvent actionEvent) {
    }

    public void loadAddDevisC(ActionEvent actionEvent) {
    }
}