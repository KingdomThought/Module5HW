package application;

	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PipedInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import javafx.application.Application;
import javafx.collections.*;
import javafx.scene.Scene;
import javafx.scene.chart.Axis;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 * 
 * @author DD
 *
 */
public class Main extends Application {
	@Override
	 public void start(Stage stage) {
        stage.setTitle("Recursive Vs Iterative");
        //defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Number Operated on");
        yAxis.setLabel("Operation Time in MiliSeconds");
        
        //creating the chart
        final LineChart<Number,Number> lineChart = 
                new LineChart<Number,Number>(xAxis,yAxis);
       
        lineChart.setTitle("Recursive Vs Iterative");
                          
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Iterative");
        
          
        series1.getData().add(new XYChart.Data(00, 0));
        series1.getData().add(new XYChart.Data(05, 0));
	      series1.getData().add(new XYChart.Data(10, 0));
	      series1.getData().add(new XYChart.Data(15, 0));
	      series1.getData().add(new XYChart.Data(20, 0));
	      series1.getData().add(new XYChart.Data(25, 0));
	      series1.getData().add(new XYChart.Data(30, 0));
	      series1.getData().add(new XYChart.Data(35, 0));
	      series1.getData().add(new XYChart.Data(40, 0));
	      
        
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Recursive");
        series2.getData().add(new XYChart.Data(00, 0));
        series2.getData().add(new XYChart.Data(05, 0));
	      series2.getData().add(new XYChart.Data(10, 0));
	      series2.getData().add(new XYChart.Data(15, 0));
	      series2.getData().add(new XYChart.Data(20, 0));
	      series2.getData().add(new XYChart.Data(25, 0));
	      series2.getData().add(new XYChart.Data(30, 4));
	      series2.getData().add(new XYChart.Data(35, 38));
	      series2.getData().add(new XYChart.Data(40, 421));

    
        
        Scene scene  = new Scene(lineChart,800,600);       
        lineChart.getData().addAll(series1, series2 );
       
        stage.setScene(scene);
        stage.show();
    }
	
/**
 * This is the Main Method
 * @param args main method
 */
	public static void main(String[] args)
	{
	
	 launch(args);
	
	
		  int i,n=40,f1,f2;
	        System.out.print("n\tIterative\tRecursive\n");
	        System.out.print("==\t=========\t=========\n");
	        long start_time,end_time;
	        int difference,difference2;
	        for(i=1;i<=n;i++) 
	        {
	            start_time  = System.nanoTime();            
	            f1 = fibonaccii(i);         
	            end_time  = System.nanoTime();                       
	            difference  = (int)((end_time - start_time) / 1e6);     
	            start_time = System.nanoTime();              
	            f2 = fibonaccir(i);         
	            end_time = System.nanoTime();                       
	            difference2 = (int)((end_time - start_time) / 1e6);        
	            System.out.print(i+"\t\t"+difference+"\t\t\t"+difference2 +"\t\n");           
		
		
		
	        }}
	        
	     
	/**
	 * This Method implements the Fibonacci sequence by means of recursion
	 * 
	 * 
	 * 
	 *
	 * @param num is passed into fibonaccir method.
	 * @return returns fibonacci function performed on parameter using recursive method 
	 */
	
	
		   public static int fibonaccir(int num) {          //function for finding fibonacci using recursive method
		        //use recursion
		        if (num == 0) {

		            return 0;

		        } else if (num == 1) {

		            return 1;
		        }   
		     return fibonaccir(num - 1) + fibonaccir(num - 2);
		    }
		    
		   /**
		    * This Method implements the Fibonacci sequence by means of iteration
		    * @param nthNumber is the value fibonacci method is to be performed upon
		    * @return currentNumber returns fibonacci function performed on parameter using iterative method 
		    */
		   
		    public static int fibonaccii(int nthNumber) {          //function for finding fibonacci using iterative method
		           //use iterative
		        int ppn, pNumber = 0, currentNumber = 1;

		        for (int i = 1; i < nthNumber ; i++) {

		            ppn = pNumber;

		            pNumber = currentNumber;

		            currentNumber = ppn + pNumber;

		        }
		        return currentNumber;
		    
		   
		}
		    
}


