package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class Book {
    private String isbn;
    private String title;
    private String author;
    private String catagory;
    private Integer qty;


}
