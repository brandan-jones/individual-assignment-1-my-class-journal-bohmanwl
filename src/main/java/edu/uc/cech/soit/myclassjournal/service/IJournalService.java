package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;

import java.util.List;

/**
 * Journal Service handles business logic for Journal DTOs.
 */
public interface IJournalService {

    /**
     * Save a new Journal Entry
     * @param journalEntry the entry to save.
     */
    void save(JournalEntry journalEntry);

    /**
     * Return all journal entries.
     * @return a collection of all journal entries.
     */
    List<JournalEntry> fetchAll();
}
