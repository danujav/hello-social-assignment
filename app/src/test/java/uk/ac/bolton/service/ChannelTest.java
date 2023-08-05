/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.bolton.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.bolton.service.impl.ChannelObservableImpl;

/**
 *
 * @author danu
 */
public class ChannelTest {
    ChannelObservableImpl channelObservableImpl = null;
    
   @BeforeEach
    public void init() {
        channelObservableImpl = new ChannelObservableImpl();
    }
    
    @Test
    public void testIfUserCanCreateChannel(){
        channelObservableImpl.addChannel("Mr.Beast");
        assertEquals(1,ChannelObservableImpl.channelList.size());
    }
    
    @Test
    public void testIfUserGetExceptionWhenCreatingChannelWithEmptyOrNullChannelName(){
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Channel name can not be null or empty");
        channel.addChannel("");
        channel.addChannel(null);
    }
    
    @Test
    public void testIfUserGetExceptionWhenCreatingChannelWithEmptyOrNullChannelName(){
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Channel name can not be null or empty");
        channel.addChannel("");
        channel.addChannel(null);
    }

    @Test
    public void testIfUseGetExceptionWhenCreatingChannelWithDuplicateChannelName(){
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Channel name already taken!");
        channel.addChannel("Mr.Beast");
        channel.addChannel("Mr.Beast");
    }

    @Test
    public void testIfUserCanRemoveChannel(){
        channel.addChannel("Mr.Beast");
        assertEquals(1,ChannelObservableImpl.channelList.size());
        channel.removeChannel("Mr.Beast");
        assertEquals(0,ChannelObservableImpl.channelList.size());
    }

    @Test
    public void testIfUserGetExceptionWhenRemovingChannelWithEmptyOrNullChannelName(){
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Channel name can not be null or empty");
        channelObservableImpl.addChannel("Mr.Beast");
        System.out.println(ChannelObservableImpl.channelList.size());
        channelObservableImpl.removeChannel("");
        channelObservableImpl.removeChannel(null);
    }

    @Test
    public void testIfUserCanSubscribeToTheChannel() {
        channelObservableImpl.addChannel("Mr.Beast");
        channelObservableImpl.subscribeToChannel("Mr.Beast", new Subscriber());
        assertEquals(1, ChannelObservableImpl.channels.get("a").size());
    }

    @Test
    public void testIfUserGetExceptionWhenSubscribeToChannelWithEmptyOrNullChannelName(){
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Channel name can't be empty");
        channelObservableImpl.subscribeToChannel("",new Subscriber());
        channelObservableImpl.subscribeToChannel(null,new Subscriber());
    }

    @Test
    public void testIfUseGetExceptionWhenSubscribeToSameChannelAgain(){
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("User already subscribed!");
        channelObservableImpl.addChannel("Mr.Beast");
        ChannelObserver subscriber = new Subscriber();
        channelObservableImpl.subscribeToChannel("Mr.Beast",subscriber);
        channelObservableImpl.subscribeToChannel("Mr.Beast",subscriber);
    }

    @Test
    public void testIfUseGetExceptionWhenSubscribeToNonExistingChannel(){
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Channel Not Found!");
        ChannelObserver subscriber = new Subscriber();
        channelObservableImpl.subscribeToChannel("Mr.Beast",subscriber);
    }

    @Test
    public void testIfUserCanUnsubscribeToTheChannel() {
        channelObservableImpl.addChannel("Mr.Beast");
        channelObservableImpl.addChannel("TV Derana");
        ChannelObserver subscriber = new Subscriber();
        channelObservableImpl.subscribeToChannel("a", subscriber);
        channelObservableImpl.subscribeToChannel("b", subscriber);
        channelObservableImpl.unSubscribe("a",subscriber);
        assertEquals(0, ChannelObservableImpl.channels.get("a").size());
    }

    @Test
    public void testIfUserGetExceptionWhenUnsubscribeToChannelWithEmptyOrNullChannelName(){
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Channel Not Found!");
        channelObservableImpl.addChannel("Mr.Beast");
        channelObservableImpl.addChannel("TV Derana");
        ChannelObserver subscriber = new Subscriber();
        channelObservableImpl.subscribeToChannel("Mr.Beast",subscriber);
        channelObservableImpl.unSubscribe("",subscriber);
        channelObservableImpl.unSubscribe(null,subscriber);
    }

    @Test
    public void testIfUseGetExceptionWhenUnsubscribeToSameChannelAgain(){
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("User not subscribed!");
        channelObservableImpl.addChannel("Mr.Beast");
        ChannelObserver subscriber = new Subscriber();
        channelObservableImpl.subscribeToChannel("Mr.Beast",subscriber);
        channelObservableImpl.unSubscribe("Mr.Beast",subscriber);
        channelObservableImpl.unSubscribe("Mr.Beast",subscriber);
    }

    @Test
    public void testIfUseGetExceptionWhenUnsubscribeToNonExistingChannel(){
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Channel Not Found!");
        ChannelObserver subscriber = new Subscriber();
        channelObservableImpl.addChannel("Mr.Beast");
        channelObservableImpl.subscribeToChannel("Mr.Beast",subscriber);
        channelObservableImpl.unSubscribe("TV Derana",subscriber);
    }

    @Test
    public void testIfChannelNameAlreadyTaken(){
        channelObservableImpl.addChannel("Mr.Beast");
        boolean a = channelObservableImpl.checkChannelName("Mr.Beast");
        assertTrue(a);
    }

    @Test
    public void testIfSubscriberReceiveChannelMessage(){
        channelObservableImpl.addChannel("Mr.Beast");
        ChannelObserver subscriber = a -> {
            System.out.println(a);
            assertEquals("Test Message",a);
        };
        channelObservableImpl.subscribeToChannel("Mr.Beast",subscriber);
        channelObservableImpl.sendMessage("Mr.Beast","Test Message");
    }
}
