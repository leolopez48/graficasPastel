
package graficaspastel;

import com.dao.DaoLenguaje;
import com.modelo.Lenguaje;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *  Nombre de la clase: GraficasPastel
 *  Fecha: 11/6/2020
 *  Versión: 1.0
 * Copyright: Leonel López
 * @author Leonel
 */
public class GraficasPastel extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        DaoLenguaje daoL = new DaoLenguaje();
        List<Lenguaje> lenguajes = daoL.mostrarLenguajes();
        
        ObservableList<PieChart.Data> data = FXCollections.observableArrayList();
        
        for(Lenguaje l: lenguajes){
            data.add(new PieChart.Data(l.getNombre(), l.getValor()));
        }
        
        PieChart pie = new PieChart(data);
        pie.setTitle("Gráficas de pastel en JAVA FX");
        pie.setLabelsVisible(true);
        
        StackPane root = new StackPane(pie);
        
        Scene scene = new Scene(root, 800, 600);
        
        primaryStage.setTitle("Gráficas JAVA FX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
