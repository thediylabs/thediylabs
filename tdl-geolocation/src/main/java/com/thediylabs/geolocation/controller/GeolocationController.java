package com.thediylabs.geolocation.controller;

import com.thediylabs.geolocation.service.GeolocationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class GeolocationController {

    @Autowired
    private GeolocationService geolocationService;

    
    @RequestMapping(path = "/api/geolocation/", method = RequestMethod.GET)
    public void a(@RequestParam (value = "geolocation") String lat) {
        
    }

    @RequestMapping(path = "/api/geolocation/", method = RequestMethod.GET)
    public void b(@RequestParam (value = "geolocation") String lat) {

    }

}