package com.capslockit.springboot.rest.example.service;

import com.capslockit.springboot.rest.example.entity.Youtube;
import com.capslockit.springboot.rest.example.help.HelpMessage;
import com.capslockit.springboot.rest.example.repo.YoutubeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class YoutubeService {

    @Autowired
    private YoutubeRepository repository;

    public List<Youtube> getList(Integer numberOfRecords) {
        return repository.getList(numberOfRecords);
    }

    public Youtube getById(Long id) {
        return repository.getById(id);
    }
    public List<Youtube> getAll() {
        return repository.getAll();
    }

    public List<HelpMessage> getHelp() {
        HelpMessage[] hMessage = {
                HelpMessage.getInstance()
                .setRequestMapping("/youtube/getAll")
                .setMessage("fetch all the records from DB and returns"),
                HelpMessage.getInstance()
                        .setRequestMapping("/youtube/get/{numberOfRecords}")
                        .setMessage("Returns X records from DB, where X is numberOfRecords"),
                HelpMessage.getInstance()
                        .setRequestMapping("/youtube/get/id/{number}")
                        .setMessage("Returns the record by id = number"),
                HelpMessage.getInstance()
                        .setRequestMapping("/youtube/get/count")
                        .setMessage("Returns the count of records present in DB")
        };
        return new ArrayList(Arrays.asList(hMessage));
    }

    public Map<String, Long> getRecordsCount() {
        return repository.getRecordsCount();
    }
}
