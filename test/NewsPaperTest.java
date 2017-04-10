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
public class NewsPaperTest {
    NewsPaper newsPaper1;
    public NewsPaperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws IllegalArgumentException, SAXException, IOException, MalformedURLException, ParserConfigurationException {
       newsPaper1 = new NewsPaper ("The Star", 3, "https://raw.githubusercontent.com/Rutulpatel7077/NewsPaperSystem/master/test/theStar.rss?token=AVPVDFB5ruSha_f9yPmZ_LgIY1XF-sA-ks5Y8xJLwA%3D%3D");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class NewsPaper.
     */
    @Test
    public void testGetName() {
        System.out.println("The Star");
        NewsPaper newsPaper1 = this.newsPaper1;
        String expResult = "The Star";
        String result = newsPaper1.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class NewsPaper.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        NewsPaper newsPaper1 = this.newsPaper1;
        int expResult = 3;
        int result = newsPaper1.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getHeadline method, of class NewsPaper.
     */
    @Test
    public void testGetHeadline() {
        System.out.println("getHeadline");
        NewsPaper instance = newsPaper1;
        String expResult = "Maple Leafs are in on Brown’s tip-in";
        String result = newsPaper1.getHeadline();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

   
    
}
