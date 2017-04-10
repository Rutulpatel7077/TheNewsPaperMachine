/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Rutul
 */
public class NewsPaperSystemViewControllerTest {
    
    public NewsPaperSystemViewControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of buttonPressed method, of class NewsPaperSystemViewController.
     */
    @Test
    public void testButtonPressed() {
        System.out.println("buttonPressed");
        ActionEvent event = null;
        NewsPaperSystemViewController instance = new NewsPaperSystemViewController();
        instance.buttonPressed(event);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class NewsPaperSystemViewController.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        NewsPaperSystemViewController instance = new NewsPaperSystemViewController();
        instance.initialize(url, rb);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of totalButtonPushed method, of class NewsPaperSystemViewController.
     */
    @Test
    public void testTotalButtonPushed() {
        System.out.println("totalButtonPushed");
        NewsPaperSystemViewController instance = new NewsPaperSystemViewController();
        instance.totalButtonPushed();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of printButtonPushed method, of class NewsPaperSystemViewController.
     */
    @Test
    public void testPrintButtonPushed() throws Exception {
        System.out.println("printButtonPushed");
        NewsPaperSystemViewController instance = new NewsPaperSystemViewController();
        instance.printButtonPushed();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of cancelButtonPushed method, of class NewsPaperSystemViewController.
     */
    @Test
    public void testCancelButtonPushed() {
        System.out.println("cancelButtonPushed");
        NewsPaperSystemViewController instance = new NewsPaperSystemViewController();
        instance.cancelButtonPushed();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
