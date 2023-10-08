package edu.uc.cech.soit.myclassjournal.dto;

import lombok.Data;

@Data
public class JournalEntry {
    private int id;
    private String date;
    private String notes;
}
