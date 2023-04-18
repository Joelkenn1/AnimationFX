package jfx;

import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationFX extends Application{

	public static void main(String[] args) {
		
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Circle c = new Circle(35);
		Rectangle r = new Rectangle(1000, 1);
		Image im = new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSrdCqbtCUgxZwBWnrHCHegSKzhwyxZ4C9vRg&usqp=CAU");
		ImageView iv = new ImageView(im);
		
		PathTransition pt = new PathTransition();
		pt.setNode(iv); // object to move
		pt.setPath(r); // path that object should follow
		pt.setCycleCount(20);
		pt.setDuration(Duration.millis(1000));
		pt.play();
		
		
		/*RotateTransition rt = new RotateTransition();
		rt.setNode(iv);
		rt.setByAngle(90);
		rt.play();*/
		
		
		HBox hb = new HBox();
		
		hb.setAlignment(Pos.CENTER);
		hb.getChildren().addAll(iv);
		
		Scene s = new Scene(hb, 600, 600);
		
		primaryStage.setScene(s);
		primaryStage.setTitle("Animation");
		primaryStage.show();
	
	}

}
