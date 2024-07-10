package com.example.connect4.models;

import java.util.ArrayList;
import java.util.List;

//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "games")
public class Gameboard {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    private List<List<Piece>> columns;
    private int numberOfRows;

    public Gameboard() {
    }

    public Gameboard(int numberOfColumns, int numberOfRows) {
        this.columns = new ArrayList<>();
        this.numberOfRows = numberOfRows;

//        add an empty list for the number of columns needed
        for (int i = 0; i < numberOfColumns; i++){
            this.columns.add(new ArrayList<>());
        }
    }

    public List<List<Piece>> getColumns() {
        return columns;
    }

    public void setColumns(List<List<Piece>> columns) {
        this.columns = columns;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }
}
