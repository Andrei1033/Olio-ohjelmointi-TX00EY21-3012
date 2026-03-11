import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class LaskinSovellus extends Application {

    private TextField ekaKentta = new TextField();
    private TextField tokaKentta = new TextField();
    private Label tulosLabel = new Label("0");
    private Button plusNappi = new Button("+");

    public void start(Stage ikkuna) {
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.getChildren().addAll(ekaKentta,tokaKentta,plusNappi, tulosLabel);

        plusNappi.setOnAction(e -> laskeSumma());

        Scene nakyma = new Scene(layout, 300, 200);
        ikkuna.setScene(nakyma);
        ikkuna.setTitle("Kakka laskin");
        ikkuna.show();
    }

    private void laskeSumma() {
        try {
            double eka = Double.parseDouble(ekaKentta.getText());
            double toka = Double.parseDouble(tokaKentta.getText());
            double summa = eka+toka;

            tulosLabel.setText(String.valueOf(summa));

        } catch (NumberFormatException e) {
            tulosLabel.setText("Virheellinen syöte");
        }
    }
}