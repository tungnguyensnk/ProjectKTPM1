package com.project1.Main;

import com.project1.Case1.Change1;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Objects;
import java.util.ResourceBundle;

public class Menu implements Initializable {
    @FXML
    public Label name;
    public AnchorPane contentRoot;
    public AnchorPane root;
    public Button hoKhau;
    public Button thuPhi;
    public Button nhaVanHoa;
    public Button lichSinhHoat;
    public Button logOut;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        hoKhau.setOnMouseEntered(e -> hoKhau.setStyle("-fx-background-color: white; -fx-text-fill: #27c73c;"));
        hoKhau.setOnMouseExited(e -> hoKhau.setStyle("-fx-background-color: #1a6dd7; -fx-text-fill: white;"));
        thuPhi.setOnMouseEntered(e -> thuPhi.setStyle("-fx-background-color: white; -fx-text-fill: #27c73c; "));
        thuPhi.setOnMouseExited(e -> thuPhi.setStyle("-fx-background-color: #1a6dd7; -fx-text-fill: white;"));
        nhaVanHoa.setOnMouseEntered(e -> nhaVanHoa.setStyle("-fx-background-color: white; -fx-text-fill: #27c73c;"));
        nhaVanHoa.setOnMouseExited(e -> nhaVanHoa.setStyle("-fx-background-color: #1a6dd7; -fx-text-fill: white;"));
        lichSinhHoat.setOnMouseEntered(e -> lichSinhHoat.setStyle("-fx-background-color: white; -fx-text-fill: #27c73c;"));
        lichSinhHoat.setOnMouseExited(e -> lichSinhHoat.setStyle("-fx-background-color: #1a6dd7; -fx-text-fill: white;"));
        name.setText(GiaoTiep.getUserName().toUpperCase());
        try {
            change1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void change1() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../Case1/change1.fxml"));
        Parent pr = loader.load();
        Change1 controller = loader.getController();
        controller.setMenu(this);
        contentRoot.getChildren().clear();
        contentRoot.getChildren().add(pr);
    }

    public void change2() {
    }

    public void change3() {
    }

    public void change4() {
    }

    public void logOut() throws IOException {
        Stage st1 = (Stage) name.getScene().getWindow();
        st1.close();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login.fxml")));
        Stage sc2 = new Stage();
        sc2.setScene(new Scene(root, 711, 400));
        sc2.initStyle(StageStyle.TRANSPARENT);
        sc2.show();
    }

}
