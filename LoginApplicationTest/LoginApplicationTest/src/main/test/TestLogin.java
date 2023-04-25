import com.example.loginapplicationtest.core.ModelFactory;
import com.example.loginapplicationtest.core.ViewModelFactory;
import com.example.loginapplicationtest.viewmodels.LoginVM;
import javafx.beans.property.SimpleStringProperty;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLogin
{

  private ViewModelFactory vmf;

  @BeforeEach
  public void setup()
  {
    ModelFactory mf = new ModelFactory();
    vmf = new ViewModelFactory(mf);
  }

  @Test
  public void testStuff()
  {
    //Arrange
    LoginVM loginVM = vmf.getLoginVM();

    SimpleStringProperty username = new SimpleStringProperty();
    SimpleStringProperty password = new SimpleStringProperty();
    SimpleStringProperty resultLabel = new SimpleStringProperty();

    username.bindBidirectional(loginVM.userNameProperty());
    password.bindBidirectional(loginVM.passwordProperty());
    resultLabel.bindBidirectional(loginVM.loginResultProperty());

    //act
    username.setValue("Michael");
    password.setValue("Michael1");
    loginVM.validateLogin();

    //Assert
    assertEquals("OK", resultLabel.getValue());
  }

}
