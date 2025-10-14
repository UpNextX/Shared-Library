package org.upnext.sharedlibrary.Events;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductEvent {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String url;
    private String category;
    private String brand;
}
