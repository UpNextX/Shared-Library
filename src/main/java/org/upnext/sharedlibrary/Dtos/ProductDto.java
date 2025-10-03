package org.upnext.sharedlibrary.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    Long id;
    String name;
    String category;
    String imageUrl;
    Double price;
    Integer stock;

}
