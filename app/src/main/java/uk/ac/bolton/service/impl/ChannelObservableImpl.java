/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.bolton.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import uk.ac.bolton.service.ChannelObservable;
import uk.ac.bolton.view.UserProfileForm;

/**
 *
 * @author danu
 */
public class ChannelObservableImpl implements ChannelObservable {
    
    public static Map<String, UserProfileForm> userProfileList = new HashMap<>();

    @Override
    public void updateTheTimeLine(String content) {
        Set<String> keySet = userProfileList.keySet();
        
        for (String userName : keySet) {
            userProfileList.get(userName).getTxtAreaTimeLine().setText(content);
        }
    }

}
