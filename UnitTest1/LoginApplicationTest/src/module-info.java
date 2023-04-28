module com.example.loginapplicationtest {
  requires javafx.controls;
  requires javafx.fxml;
  requires java.desktop;
  requires org.junit.jupiter.api;

  opens com.example.loginapplicationtest to javafx.fxml;
  exports java.com.example.loginapplicationtest;
  exports java.com.example.loginapplicationtest.core;
  exports java.com.example.loginapplicationtest.viewmodels;
}