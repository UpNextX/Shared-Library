package org.upnext.sharedlibrary.Events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderCreatedEvent {
    private Long orderId;
    private Long cartId;
    private Long userId;
    private LocalDateTime createdAt;
}
