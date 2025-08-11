/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author aidinfami
 */

public class TestingNode {
    
    public TestingNode() {
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
     * Test of getNode method, of class Node.
     */
    @Test
    public void testGetNode() {
        System.out.println("getNode");
        Node n = new Node();
        int expected = 2; 
        int real = n.getNode();
        assertEquals(expected, real);
    }

    /**
     * Test of toString method, of class Node.
     */
    @Test
    public void testNode() {
        System.out.println("toString");
        Node node1 = new Node();
        Node node2 = new Node();
        node1 = node2;
        assertEquals(node1, node2);
    }
    
}
