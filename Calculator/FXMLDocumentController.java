import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuBar;

/**
 *
 * @author Małgorzata Kowalczyk
 */
public class FXMLDocumentController implements Initializable {

    Float result = 0f;
    int state = 0;
    int lastOperation = 0;
    int error = 0;
    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button zero;

    @FXML
    private Button sign;

    @FXML
    private Button comma;

    @FXML
    private Button divide;

    @FXML
    private Button multiply;

    @FXML
    private Button minus;

    @FXML
    private Button plus;

    @FXML
    private Button mod;

    @FXML
    private Button or;

    @FXML
    private Button lsh;

    @FXML
    private Button equal;

    @FXML
    private Button a;

    @FXML
    private Button b;

    @FXML
    private Button c;

    @FXML
    private Button d;

    @FXML
    private Button e;

    @FXML
    private Button and;

    @FXML
    private Button xor;

    @FXML
    private Button not;

    @FXML
    private Button intt;

    @FXML
    private Button f;

    @FXML
    private TextField text;

    @FXML
    private MenuBar menu;

    @FXML
    private RadioButton stopnie;

    @FXML
    private RadioButton radiany;

    @FXML
    private RadioButton gradusy;

    @FXML
    private RadioButton hex;

    @FXML
    private RadioButton dec;

    @FXML
    private RadioButton oct;

    @FXML
    private RadioButton bin;

    @FXML
    private Button backspace;

    @FXML
    private Button ce;

    @FXML
    private CheckBox inv;

    @FXML
    private CheckBox hyp;

    @FXML
    private TextField field1;

    @FXML
    private TextField field2;

    @FXML
    private Button mc;

    @FXML
    private Button mr;

    @FXML
    private Button ms;

    @FXML
    private Button mplus;

    @FXML
    private Button pi;

    @FXML
    private Button fe;

    @FXML
    private Button dms;

    @FXML
    private Button sin;

    @FXML
    private Button con;

    @FXML
    private Button nawias1;

    @FXML
    private Button exp;

    @FXML
    private Button potega1;

    @FXML
    private Button potega2;

    @FXML
    private Button tan;

    @FXML
    private Button potega3;

    @FXML
    private Button nawias2;

    @FXML
    private Button ln;

    @FXML
    private Button log;

    @FXML
    private Button silnia;

    @FXML
    private Button ulamek;

    @FXML
    private Button sta;

    @FXML
    private Button ave;

    @FXML
    private Button sum;

    @FXML
    private Button s;

    @FXML
    private Button dat;

    @FXML
    private void handleButtonAction(ActionEvent event) {
    }

    @FXML
    void print(ActionEvent event) {
        if (lastOperation != 0 && state == 1) {
            Float d = Float.parseFloat(text.getText());
            if (state == 6) {
                d = d * (-1);
            }
            if (lastOperation == 2) {
                result += d;
            } else if (lastOperation == 3) {
                result -= d;
            } else if (lastOperation == 4) {
                result *= d;
            } else if (lastOperation == 5) {
                if (d != 0) {
                    result /= d;
                } else {
                    text.setText("Nie mozna dzielic przez zero");
                    error = 1;
                }
            } else if (lastOperation == 7) {
                result %= d;
            }
        }
        Button btn = (Button) event.getSource();
        switch (btn.getId()) {
            case "zero":
                if (state == 6) {
                    break;
                }
                if (state != 1) {
                    text.setText("");
                }
                text.setText(text.getText() + "0");
                state = 1;
                break;
            case "one":
                if (state == 6) {
                    break;
                }
                if (state != 1) {
                    text.setText("");
                }
                text.setText(text.getText() + "1");
                state = 1;
                break;
            case "two":
                if (state == 6) {
                    break;
                }
                if (state != 1) {
                    text.setText("");
                }
                text.setText(text.getText() + "2");
                state = 1;
                break;
            case "three":
                if (state == 6) {
                    break;
                }
                if (state != 1) {
                    text.setText("");
                }
                text.setText(text.getText() + "3");
                state = 1;
                break;
            case "four":
                if (state == 6) {
                    break;
                }
                if (state != 1) {
                    text.setText("");
                }
                text.setText(text.getText() + "4");
                state = 1;
                break;
            case "five":
                if (state == 6) {
                    break;
                }
                if (state != 1) {
                    text.setText("");
                }
                text.setText(text.getText() + "5");
                state = 1;
                break;
            case "six":
                if (state == 6) {
                    break;
                }
                if (state != 1) {
                    text.setText("");
                }
                text.setText(text.getText() + "6");
                state = 1;
                break;
            case "seven":
                if (state == 6) {
                    break;
                }
                if (state != 1) {
                    text.setText("");
                }
                text.setText(text.getText() + "7");
                state = 1;
                break;
            case "eight":
                if (state == 6) {
                    break;
                }
                if (state != 1) {
                    text.setText("");
                }
                text.setText(text.getText() + "8");
                state = 1;
                break;
            case "nine":
                if (state == 6) {
                    break;
                }
                if (state != 1) {
                    text.setText("");
                }
                text.setText(text.getText() + "9");
                state = 1;
                break;
            case "comma":
                if (state == 6) {
                    break;
                }
                if (state == 1) {
                    text.setText(text.getText() + ".");
                }
                break;
            case "plus":
                if (lastOperation == 0 && state != 6) {
                    result = Float.parseFloat(text.getText());
                }
                text.setText("+");
                lastOperation = 2;
                state = 2;
                break;
            case "minus":
                if (lastOperation == 0 && state != 6) {
                    result = Float.parseFloat(text.getText());
                }
                text.setText("-");
                lastOperation = 3;
                state = 3;
                break;
            case "multiply":
                if (lastOperation == 0 && state != 6) {
                    result = Float.parseFloat(text.getText());
                }
                text.setText("*");
                lastOperation = 4;
                state = 4;
                break;
            case "divide":
                if (lastOperation == 0 && state != 6) {
                    result = Float.parseFloat(text.getText());
                }
                text.setText("/");
                lastOperation = 5;
                state = 5;
                break;
            case "c":
                text.setText("");
                result = 0f;
                lastOperation = 0;
                state = 0;
                break;
            case "ce":
                state = 0;
                text.setText("");
                break;
            case "equal":
                if (error == 0) {
                    text.setText(String.valueOf(result));
                }
                lastOperation = 0;
                break;
            case "sign":
                if (lastOperation == 0) {
                    result = Float.parseFloat(text.getText()) * (-1);
                } else {
                    Float lastNum = Float.parseFloat(text.getText());
                    if (lastOperation == 2) {
                        lastNum = lastNum * 2;
                        result = result - lastNum;
                    } else if (lastOperation == 3) {
                        result = result + (lastNum * 2);
                    } else if (lastOperation == 4 || lastOperation == 5) {
                        result = result * (-1);
                    }
                }
                state = 6;
                lastOperation = 0;
                break;
            case "mod": {
                if (lastOperation == 0 && state != 6) {
                    result = Float.parseFloat(text.getText());
                }
                text.setText("%");
                lastOperation = 7;
                state = 7;
            }
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
