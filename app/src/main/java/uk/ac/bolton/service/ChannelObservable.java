/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uk.ac.bolton.service;

/**
 *
 * @author danu
 */
public interface ChannelObservable {
    void addChannel(String name);
    void removeChannel(String name);
    boolean checkChannelName(String name);
    void subscribeToChannel(String channelName,ChannelObserver co);
    void sendMessage(String channelName, String message);
    void unSubscribe(String channelName, ChannelObserver co);   
}
