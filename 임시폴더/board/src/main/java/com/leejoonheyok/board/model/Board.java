package com.leejoonheyok.board.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    private String content;
    private String writer;
}