package com.arfaoui.alemniapi.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class CourseItemDto {
    private Long id;

    private String title ;
    private byte[] video ;

}
