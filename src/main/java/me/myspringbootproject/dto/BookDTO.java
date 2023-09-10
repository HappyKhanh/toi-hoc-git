package me.myspringbootproject.dto;

import lombok.Data;

@Data
public class BookDTO {
    private Long id;

    private String name;

    private String author;

    private Long price;
}
