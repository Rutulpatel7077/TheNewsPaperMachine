/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.MalformedURLException;
import javax.xml.parsers.ParserConfigurationException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.xml.sax.SAXException;

/**
 *
 * @author Rutul
 */
public class ParserTest {
    
    Parser parser1;
    
    public ParserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws SAXException, IOException, MalformedURLException, ParserConfigurationException {
        parser1 = new Parser("https://raw.githubusercontent.com/Rutulpatel7077/NewsPaperSystem/master/test/theStar.rss?token=AVPVDFB5ruSha_f9yPmZ_LgIY1XF-sA-ks5Y8xJLwA%3D%3D");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDocument method, of class Parser.
     */
    @Test
    public void testGetDocument() {
        System.out.println("getDocument");
        Parser instance = parser1;
        instance.getDocument();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getHeadline method, of class Parser.
     */
    @Test
    public void testGetHeadline() {
        System.out.println("getHeadline");
        Parser instance = parser1;
        String expResult = "Maple Leafs are in on Brown’s tip-in";
        String result = instance.getHeadline();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
