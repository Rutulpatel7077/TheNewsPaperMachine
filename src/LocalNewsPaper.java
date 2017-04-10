
import java.io.IOException;
import java.net.MalformedURLException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rutul This class extends the NewsPaper and set the location of the
 * LocalNews Paper
 *
 */
public class LocalNewsPaper extends NewsPaper {

    private String location; // instance variable of Location

    public LocalNewsPaper(String name, int price, String url, String location) throws SAXException, IOException, MalformedURLException, ParserConfigurationException {
        super(name, price, url);
        setLocation(location);
    }

    /**
     * This method will return location of LocalNews Paper
     *
     * @return
     */
    public String getLocation() {
        return location;
    }

    /**
     * This Method will Set the Location of LocalNews Paper
     *
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

}
