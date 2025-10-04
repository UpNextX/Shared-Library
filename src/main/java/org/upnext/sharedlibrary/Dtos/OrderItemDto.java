package org.upnext.sharedlibrary.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDto {
    Long id;

    Long orderId;

    ProductDto product;

    Integer quantity;

    Integer price;
}
