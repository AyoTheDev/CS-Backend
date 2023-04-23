package com.scienta.cs.notification.queue.models.messages;

import com.scienta.cs.notification.core.models.enums.NotificationType;
import lombok.*;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationWrapperMessage {

    /**
     * Put all fields of all notification objects, with purpose
     * of partial mapping for specific notification type
     */

    private String to;
    private String title;
    private String content;
    private boolean common;
    private NotificationType type;

    private List<String> attachmentFilesUrl;

}
