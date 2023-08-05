/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package uk.ac.bolton;

import uk.ac.bolton.service.ChannelObservable;
import uk.ac.bolton.service.impl.ChannelObservableImpl;
import uk.ac.bolton.view.Dashboard;

public class Launcher {

    public static void main(String[] args) {
        ChannelObservable co = new ChannelObservableImpl();
        new Dashboard(co).setVisible(true);
    }
}
