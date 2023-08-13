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

/**
 *
 * @author danu
 */
public class ChannelObservableImplTest {

    public ChannelObservableImplTest() {
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
     * Test of updateTheTimeLine method, of class ChannelObservableImpl.
     */
    @Test
    public void testIfTimeLineUpdate() {
        System.out.println("updateTheTimeLine");
        String content = "";
        ChannelObservableImpl instance = new ChannelObservableImpl();
        instance.updateTheTimeLine(content);
    }

}
