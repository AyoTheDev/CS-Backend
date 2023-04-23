package com.scienta.cs.notification.core.models.interfaces;


import com.scienta.cs.notification.core.models.enums.NotificationType;

/**
 * @author Assylkhan
 * on 17.02.2020
 * @project Social
 */
public interface Notifiable {

    NotificationType type();

    String to();

    String title();

    String content();

}
