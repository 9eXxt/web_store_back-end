package com.webstore.model.dto;

import com.webstore.model.entity.OrderStatus;
import lombok.Value;

import java.time.LocalDateTime;
@Value
public class OrderReadDto {
    Integer order_id;
    LocalDateTime order_date;
    OrderStatus order_status;
    Integer customer_id;
}

//public record OrderReadDto(Integer order_id,
//                           LocalDateTime order_date,
//                           String order_status,
//                           Integer customer_id) {
//
//}

// !!!!!!!!!!!!!!!!!!!! records are not working with jsp
