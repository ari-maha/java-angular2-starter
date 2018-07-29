package com.capslockit.springboot.rest.example.help;

public class HelpMessage {

    private String requestMapping;
    private String message;

    public static HelpMessage getInstance() {
        return new HelpMessage();
    }

    public String getRequestMapping() {
        return requestMapping;
    }

    public String getMessage() {
        return message;
    }

    public HelpMessage setRequestMapping(String requestMapping) {
        this.requestMapping = requestMapping;
        return this;
    }

    public HelpMessage setMessage(String message) {
        this.message = message;
        return this;
    }
}
