package org.upnext.sharedlibrary.Events;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MailEvent {
    private String email;
    private String name;
    private String confirmation_url;
}
