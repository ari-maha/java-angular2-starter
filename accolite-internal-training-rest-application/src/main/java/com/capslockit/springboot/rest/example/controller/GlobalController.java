package com.capslockit.springboot.rest.example.controller;

import com.capslockit.springboot.rest.example.help.HelpMessage;
import com.capslockit.springboot.rest.example.service.GlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/")
@RestController
public class GlobalController {

    @Autowired
    private GlobalService service;

    @GetMapping("/help")
    @ResponseBody()
    public List<HelpMessage> getHelp() {
        return service.getHelp();
    }

    @GetMapping("/")
    @ResponseBody()
    public List<HelpMessage> getGlobalHelp() {
        return service.getHelp();
    }

}
