/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package uk.ac.bolton.service.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import uk.ac.bolton.view.UserProfileForm;

/**
 *
 * @author danu
 */
public class ChannelBehavioursTest {
    
    public ChannelBehavioursTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addSubscribers method, of class ChannelBehaviours.
     */
    @Test
    public void testAddSubscribers() {
        System.out.println("addSubscribers");
        String userName = "";
        UserProfileForm userProfile = null;
        ChannelBehaviours instance = new ChannelBehaviours();
        instance.addSubscribers(userName, userProfile);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeSubscribers method, of class ChannelBehaviours.
     */
    @Test
    public void testRemoveSubscribers() {
        System.out.println("removeSubscribers");
        String userName = "";
        ChannelBehaviours instance = new ChannelBehaviours();
        instance.removeSubscribers(userName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
