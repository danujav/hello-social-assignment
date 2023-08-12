/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.bolton.service.impl;

import uk.ac.bolton.service.IChannelBehaviours;
import uk.ac.bolton.view.UserProfileForm;

/**
 *
 * @author danu
 */
public class ChannelBehaviours implements IChannelBehaviours {

    @Override
    public void addSubscribers(String userName, UserProfileForm userProfile) {
        ChannelObservableImpl.userProfileList.put(userName, userProfile);
    }

    @Override
    public void removeSubscribers(String userName) {
        ChannelObservableImpl.userProfileList.remove(userName);
    }
    
}
