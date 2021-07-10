package com.example.sampleapp.sampleapp.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class Controller {
    
    @RequestMapping(value="/getdata", method=RequestMethod.GET)
    public Map<String,String> getData()
    {
        Map <String,String> mp1 = new HashMap <> ();
        mp1.put("Name","Vivek");
        mp1.put("Age","21");
        return mp1;
    }
}