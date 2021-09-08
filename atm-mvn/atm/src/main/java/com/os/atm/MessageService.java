package com.os.atm;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.HashMap;

@Component
public class MessageService {
    private static final HashMap<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("bank.name", "XYZ BANK");
        dictionary.put("welcomePage.title","WELCOME TO "+ dictionary.get("bank.name"));
        dictionary.put("welcomePage.click.continue","Please Click Continue");
        dictionary.put("welcomePage.continue", "Continue");
        dictionary.put("validation.message", "Your input value:{} is incorrect.");
    }

    //MessageFormat
    public String getMsg(String key) {
        MessageFormat.format(dictionary.get("validation.message"), 89);
        return dictionary.get(key);
    }
}
