package by.teachmeskills.lesson39.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
    private Long id;
    private String name;
    private Integer price;
}
