package com.prueba.GUIProperties.service;

import com.prueba.GUIProperties.model.Properties;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface GUIPropertiesService {
    Properties getAll();
    Object putProperties(Properties properties) throws IOException;
}
