/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uk.ac.bolton.service;

import uk.ac.bolton.view.UserProfileForm;

/**
 *
 * @author danu
 */
public interface IChannelBehaviours {
    
    void addSubscribers(String userName, UserProfileForm userProfile);
    
    void removeSubscribers(String userName);
}
