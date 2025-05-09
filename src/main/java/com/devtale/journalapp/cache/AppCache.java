package com.devtale.journalapp.cache;

import com.devtale.journalapp.entity.ConfigJournalAppEntity;
import com.devtale.journalapp.repository.ConfigJournalAppRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AppCache {

    public enum keys{
        WEATHER_API;
    }

    @Autowired
    private ConfigJournalAppRepository configJournalAppRepository;

    public Map<String,String> appCache;

    @PostConstruct
    public void init() {
    appCache = new HashMap<>();
    List<ConfigJournalAppEntity> all = configJournalAppRepository.findAll();
    for (ConfigJournalAppEntity entry: all){
        appCache.put(entry.getKey(),entry.getValue());
    }
    }
}
