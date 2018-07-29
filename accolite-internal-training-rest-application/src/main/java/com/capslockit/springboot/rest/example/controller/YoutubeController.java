package com.capslockit.springboot.rest.example.controller;

import com.capslockit.springboot.rest.example.entity.Youtube;
import com.capslockit.springboot.rest.example.help.HelpMessage;
import com.capslockit.springboot.rest.example.service.YoutubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/youtube")
@RestController
public class YoutubeController {

    @Autowired
    private YoutubeService service;

    @GetMapping("/get/count")
    @ResponseBody()
    public Map<String, Long> getRecordsCount() {
        return service.getRecordsCount();
    }

    @GetMapping("/get/id/{number}")
    @ResponseBody()
    public Youtube getbyId(@PathVariable("number") Long number) {
        return service.getById(number);
    }

    @GetMapping("/get/{numberOfRecords}")
    @ResponseBody()
    public List<Youtube> getList(@PathVariable("numberOfRecords") Integer numberOfRecords) {
        return service.getList(numberOfRecords);
    }

    @GetMapping("/getAll")
    @ResponseBody()
    public List<Youtube> getAll() {
        return service.getAll();
    }

    @GetMapping("/help")
    @ResponseBody()
    public List<HelpMessage> getHelp() {
        return service.getHelp();
    }

    @GetMapping("/")
    @ResponseBody()
    public List<HelpMessage> getDefaultHelp() {
        return service.getHelp();
    }

}
