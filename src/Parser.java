/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Rutul
 */
public class Parser {

    private final Document document;
    /**
     * This method connect with url and read the xml file from the Internet and make one documents
     * @param u
     * @throws MalformedURLException
     * @throws SAXException
     * @throws IOException
     * @throws ParserConfigurationException 
     */
    public Parser(String u) throws MalformedURLException, SAXException, IOException, ParserConfigurationException {
        URL url = new URL(u);
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        this.document = documentBuilder.parse(url.openStream());
        this.document.getDocumentElement().normalize();
    }
    /**
     * this method will get the documents from the URL
     */
    public void getDocument() {
        System.out.println(document.getDocumentElement().getNodeName());
    }
   /**
    * This method will get headline from the rss.xml file and select the first item and after that in that item it will 
    * select first child of item which is title of main headline.
    * @return 
    */
    public String getHeadline() {
        NodeList nodeList = document.getElementsByTagName("item");
        Element node = (Element) nodeList.item(0);
        Node title = node.getElementsByTagName("title").item(0);
        return title.getTextContent().trim();
    }
}
