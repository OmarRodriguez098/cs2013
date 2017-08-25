package application;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			
			GridPane grid = new GridPane();
			Scene scene1 = new Scene(grid,500,500);
			grid.setGridLinesVisible(true);
			//grid.addRow(0, null);
			//grid.getColumnConstraints().add(new ColumnConstraints(500));
			//grid.getRowConstraints().add(new RowConstraints(500));
			grid.setPrefSize(450,450);
			
		
			Label l1 = new Label("*");
			Label l2 = new Label("*");
			Label l3 = new Label("*");
			Label l4 = new Label("*");
			Label l5 = new Label("*");
			Label l6 = new Label("*");
			Label l7 = new Label("*");
			Label l8 = new Label("*");
			Label l9 = new Label("*");
			Label l10 = new Label("*");
			Label l11 = new Label("*");
			Label l12 = new Label("*");
			Label l13 = new Label("*");
			Label l14 = new Label("*");
			Label l15 = new Label("*");
			Label l16 = new Label("*");
			Label l17 = new Label("*");
			Label l18 = new Label("*");
			Label l19 = new Label("*");
			Label l20 = new Label("*");
			Label l21 = new Label("*");
			Label l22 = new Label("*");
			Label l23 = new Label("*");
			Label l24 = new Label("*");
			Label l25 = new Label("*");
			
			ArrayList<Label> arrayListOne = new ArrayList<Label>();
			arrayListOne.add(l1);
			arrayListOne.add(l2);
			arrayListOne.add(l3);
			arrayListOne.add(l4);
			arrayListOne.add(l5);
			arrayListOne.add(l6);
			arrayListOne.add(l7);
			arrayListOne.add(l8);
			arrayListOne.add(l9);
			arrayListOne.add(l10);
			arrayListOne.add(l11);
			arrayListOne.add(l12);
			arrayListOne.add(l13);
			arrayListOne.add(l14);
			arrayListOne.add(l15);
			arrayListOne.add(l16);
			arrayListOne.add(l17);
			arrayListOne.add(l18);
			arrayListOne.add(l19);
			arrayListOne.add(l20);
			arrayListOne.add(l21);
			arrayListOne.add(l22);
			arrayListOne.add(l23);
			arrayListOne.add(l24);
			arrayListOne.add(l25);
//			//Label name = new Label("*");
//			String name = "l";
//			for(int i = 0; i < 25; i++) {
////				Label l = new Label("*");
//				name += (i+1);
//				arrayListOne.add(name);
//			}
	
			
			int column = 5, row = 5, count = 0;
			for(int i = 0; i < row; i++) {
				RowConstraints rc = new RowConstraints();
				rc.setFillHeight(true);
				rc.setVgrow(Priority.ALWAYS);
				grid.getRowConstraints().add(rc);
			}
			for(int i = 0; i < column; i++) {
				ColumnConstraints cc = new ColumnConstraints();
				cc.setFillWidth(true);
				cc.setHgrow(Priority.ALWAYS);
				grid.getColumnConstraints().add(cc);
			}
			for (int i = 0; i < row; i++)
			{
				for(int j = 0; j < column; j++)
				{
					//Label l = new Label("*");
					grid.add(arrayListOne.get(count), column, row);
					//grid.add(l, column, row);
					count++;
				}
			}
			
//			grid.add(arrayListOne.get(0), 0, 0);
//			grid.add(arrayListOne.get(1), 0, 1);
//			grid.add(arrayListOne.get(2), 1, 0);
//			grid.add(arrayListOne.get(3), 1, 1);
			
			//Label label = new Label("*");
			//grid.add(label, 0, 0);//top of grid.
		/*	grid.add(label, 0, 1);//top of grid.
			grid.add(label, 0, 2);//top of grid.
			grid.add(label, 0, 3);//top of grid.
			grid.add(label, 0, 4);//top of grid.
			grid.add(label, 1, 0);//top of grid.
			grid.add(label, 1, 1);//top of grid.
			grid.add(label, 1, 2);//top of grid.
			grid.add(label, 1, 3);//top of grid.
*/
			
			
			
			primaryStage.setScene(scene1);
			primaryStage.show();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
