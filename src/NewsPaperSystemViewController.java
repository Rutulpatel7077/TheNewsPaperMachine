/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 * FXML Controller class
 *
 * @author Rutul
 */
public class NewsPaperSystemViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button theStarBtn;

    @FXML
    private Button torontoSunBtn;

    @FXML
    private Button barrieExaminerBtn;

    @FXML
    private Button globeAndMailBtn;

    @FXML
    private Button totalBtn;

    @FXML
    private Label output;

    @FXML
    private Label price;

    @FXML
    private Label headline;

    @FXML
    private Label totalLabel;

    @FXML
    private Label date;

    @FXML
    private Label tax;

    @FXML
    private Label totalAmount;

    @FXML
    private Button printBtn;

    @FXML
    private Button cancelBtn;

    @FXML
    private Button refereshBtn;

    NewsPaper theStar, torontoSun, barrieExaminer, globeAndMail;
    ArrayList<NewsPaper> newsPapers;
    String order = "", pricedisplay = "";
    double total = 0;
    double taxPercentage = 13;
    double taxAmount = 0;

    /**
     * This method will operate the All the NewsPaper button and add newspaper
     * to the arrayList of newspaper
     *
     * @param event
     */
    public void buttonPressed(ActionEvent event) {
        Button button = (Button) event.getSource();
        String buttonId = button.getId();
        newsPapers.add(getNewsPaperFromId(buttonId));
        updateOrder(buttonId);

    }

    /**
     * This is initialize method
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        newsPapers = new ArrayList<>();

        updateRSSFeeds();

    }

    /**
     * This method will update the NewsFeeds from the url documents with try and
     * catch exception
     */
    public void updateRSSFeeds() {
        try {
            theStar = new NewsPaper("The Star     ", 3, "https://raw.githubusercontent.com/Rutulpatel7077/NewsPaperSystem/master/test/theStar.rss?token=AVPVDFB5ruSha_f9yPmZ_LgIY1XF-sA-ks5Y8xJLwA%3D%3D");
            torontoSun = new NewsPaper("Toronto Sun", 4, "http://www.torontosun.com/home/rss.xml");
            barrieExaminer = new LocalNewsPaper("Barrie Examiner", 2, "http://www.thebarrieexaminer.com/news/local/rss.xml", "Barrie");
            globeAndMail = new NewsPaper("Globe And Mail", 5, "http://www.theglobeandmail.com/?service=rss");

            headline.setText(theStar.getName() + "\n" + theStar.getHeadline() + "\n" + "\n"
                    + (torontoSun.getName() + "\n" + torontoSun.getHeadline()) + "\n" + "\n"
                    + (barrieExaminer.getName() + "\n" + barrieExaminer.getHeadline()) + "\n" + "\n"
                    + (globeAndMail.getName() + "\n" + globeAndMail.getHeadline()));

            date.setText(LocalDate.now().getDayOfWeek().toString().toUpperCase());

        } catch (SAXException ex) {
            Logger.getLogger(LaunchNewsPaperSystem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(LaunchNewsPaperSystem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(LaunchNewsPaperSystem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LaunchNewsPaperSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method will add the newspaper name and price into the ArrayList and
     * include tax amount in total payment
     *
     * @param buttonId
     */
    private void updateOrder(String buttonId) {
        order += getNewsPaperFromId(buttonId).getName() + "\n";
        pricedisplay += "$" + getNewsPaperFromId(buttonId).getPrice() + "\n";
        output.setText(order);
        price.setText(pricedisplay);

        total += getNewsPaperFromId(buttonId).getPrice();
        totalLabel.setText("$" + Double.toString(total));

        taxAmount = (((total) * taxPercentage) / 100);
        tax.setText("$" + taxAmount);

    }

    /**
     * This method calculate the total amount with tax
     */
    
    public void totalButtonPushed() {
        totalAmount.setText("$" + (total + taxAmount));
    }

    /**
     * This method will print the text file of the ArrayList
     *
     * @throws IOException
     */
    
    public void printButtonPushed() throws IOException {
        String s = "";
        PrintWriter writer = new PrintWriter("Receipt.txt", "UTF-8");
        for (int n = 0; n < newsPapers.size(); n++) {
            s += newsPapers.get(n).getName() + "\t\t";
            s += newsPapers.get(n).getPrice() + "\n";
        }
        writer.println(s);
        writer.close();
    }

    /**
     * This is method of refresh button and refresh the RSSFeeds
     */
    
    public void refereshButtonPushed() {
        updateRSSFeeds();
    }

    /**
     * This method will exit the programme
     */
    
    public void cancelButtonPushed() {
        System.exit(0);
    }

    /**
     * This method identify the button from button id
     * @param buttonId
     * @return
     */
    
    private NewsPaper getNewsPaperFromId(String buttonId) {
        switch (buttonId) {
            case "theStarBtn":
                return theStar;
            case "torontoSunBtn":
                return torontoSun;
            case "barrieExaminerBtn":
                return barrieExaminer;
            case "globeAndMailBtn":
                return globeAndMail;
            default:
                break;
        }
        return null;
    }
}
