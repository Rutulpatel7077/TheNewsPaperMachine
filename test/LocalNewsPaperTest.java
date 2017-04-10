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
public class LocalNewsPaperTest {
    LocalNewsPaper newsPaper1;
    public LocalNewsPaperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws SAXException, IOException, MalformedURLException, ParserConfigurationException {
        newsPaper1 = new LocalNewsPaper ("The Star", 3, "https://raw.githubusercontent.com/Rutulpatel7077/NewsPaperSystem/master/test/theStar.rss?token=AVPVDFB5ruSha_f9yPmZ_LgIY1XF-sA-ks5Y8xJLwA%3D%3D","Barrie");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getLocation method, of class LocalNewsPaper.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        LocalNewsPaper instance = newsPaper1;
        String expResult = "Barrie";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class LocalNewsPaper.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        String location = "Barrie";
        LocalNewsPaper instance = newsPaper1;
        instance.setLocation(location);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
