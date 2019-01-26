import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MakingButton  extends Application{

    public static void main(String arg[]){
        launch(arg);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
    
        Button button = new Button("click me");
        
        TextField textField = new TextField();
        textField.setMaxWidth(200);
        
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setMinHeight(300);
        vbox.setMinWidth(500);
        vbox.setSpacing(10);
        
        Label label = new Label();
        button.setOnAction(e->buttonAction(label,textField));
        vbox.getChildren().addAll(textField,button,label);
        
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void buttonAction(Label label, TextField textField) {
    
        label.setText(textField.getText());
    }
    
}
