package com.prueba.GUIProperties.controllers;


import com.prueba.GUIProperties.model.Properties;
import com.prueba.GUIProperties.service.GUIPropertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.PropertySources;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(value = "/GUIProperties")
public class GUIPropertiesController {

    @Autowired
    private final GUIPropertiesService guiPropertiesService;


    public GUIPropertiesController(GUIPropertiesService guiPropertiesService){
        this.guiPropertiesService = guiPropertiesService;

    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(guiPropertiesService.getAll());
    }

    @PutMapping
    @ResponseBody
    public ResponseEntity<?> putProperties(@RequestBody Properties properties) throws IOException {
        return ResponseEntity.status(HttpStatus.OK).body(guiPropertiesService.putProperties(properties));
    }
}
