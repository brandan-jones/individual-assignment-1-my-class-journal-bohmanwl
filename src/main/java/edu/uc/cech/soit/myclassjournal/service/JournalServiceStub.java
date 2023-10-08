package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class JournalServiceStub implements IJournalService{

    @Override
    public void save(JournalEntry journalEntry) {

    }

    @Override
    public List<JournalEntry> fetchAll() {

        return null;
    }
}
