package com.capslockit.springboot.rest.example.service;

import com.capslockit.springboot.rest.example.help.HelpMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GlobalService {

    @Autowired
    private YoutubeService service;

    public List<HelpMessage> getHelp() {
        return service.getHelp();
    }
}
