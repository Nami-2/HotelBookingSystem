package com.example.hotelbookingsystem;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class kingRoomController {

    @FXML
    ImageView MainView;

    @FXML
    Image kingBedroom = new Image(Application.class.getResourceAsStream("/Images/KingBedroom.jpg"));
    Image kingBathroom = new Image(Application.class.getResourceAsStream("/Images/KingBathroom.jpg"));
    Image kingDining = new Image(Application.class.getResourceAsStream("/Images/KingDining.jpg"));
    Image kingView = new Image(Application.class.getResourceAsStream("/Images/KingView.jpg"));

    @FXML
    public void displayKingBedroom(){
        MainView.setImage(kingBedroom);
    }
    @FXML
    public void displayKingBathroom(){
        MainView.setImage(kingBathroom);
    }
    @FXML
    public void displayKingDining(){
        MainView.setImage(kingDining);
    }
    @FXML
    public void displayKingView(){
        MainView.setImage(kingView);
    }
}
