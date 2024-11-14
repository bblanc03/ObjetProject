module Mediatheque {
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.controls;
	
	
	opens application to javafx.graphics, javafx.fxml;
	opens controller to javafx.graphics, javafx.fxml;
}