module com.example.loginapplicationtest {
  requires javafx.controls;
  requires javafx.fxml;
  requires java.desktop;

  opens com.example.loginapplicationtest to javafx.fxml;
  exports com.example.loginapplicationtest;
  exports com.example.loginapplicationtest.core;
  exports com.example.loginapplicationtest.viewmodels;
}