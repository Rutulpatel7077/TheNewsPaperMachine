
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
 * @author Rutul
 */
public class NewsPaper {
    /**
     * Instance variable
     */
    private String name;
    private int price;
    private String headline;
    private String url;
    private Parser parser;

    public NewsPaper(String name, int price, String url) throws SAXException, IOException, MalformedURLException, ParserConfigurationException {
        this.name = name;
        this.price = price;
        this.url = url;
        parser = new Parser(url);
    }
    /**
     * This method will Set Price
     * @param price 
     */
    public void setPrice(int price) {
        this.price = price;
    }
    /**
     * This Method will return Name of newsPaper
     * @return 
     */
    public String getName() {
        return name;
    }
    /**
     * This method will return price of NewsPaper.
     * @return 
     */
    public int getPrice() {
        return price;
    }
    /**
     * 
     * @return 
     */
    public String getHeadline() {
        return parser.getHeadline();
    }

}
