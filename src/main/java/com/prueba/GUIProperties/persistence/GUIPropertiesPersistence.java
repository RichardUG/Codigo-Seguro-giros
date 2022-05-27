package com.prueba.GUIProperties.persistence;

import com.prueba.GUIProperties.model.Properties;
import com.prueba.GUIProperties.service.GUIPropertiesService;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
@PropertySource("classpath:config.properties")
public class GUIPropertiesPersistence implements GUIPropertiesService {

    public final Properties properties;

    public GUIPropertiesPersistence(Properties properties) {
        this.properties = properties;
    }


    @Override
    public Properties getAll() {
        return properties;
    }

    @Override
    public Object putProperties(Properties properties1) throws IOException {
        System.out.println(properties1.toString());

        properties.setDBIP(properties1.getDBIP());
        properties.setDBSID(properties1.getDBSID());
        properties.setDBPassword(properties1.getDBPassword());
        properties.setDBPort(properties1.getDBPort());
        properties.setEmail(properties1.getAdminEmailAddress());
        properties.setPDFPath(properties1.getPDFPath());
        properties.setDBUserName(properties1.getDBUserName());
        properties.setMaxConnectionsPerPartition(properties1.getMaxConnectionsPerPartition());
        properties.setMinConnectionsPerPartition(properties1.getMinConnectionsPerPartition());
        properties.setPartitionCount(properties1.getPartitionCount());

        /*java.util.Properties p = new java.util.Properties();
        InputStream propertiesStream = ClassLoader.getSystemResourceAsStream("config.properties");
        p.load(propertiesStream);
        Enumeration<Object> keys = p.keys();
        while (keys.hasMoreElements()){
            Object key = keys.nextElement();
            System.out.println(key + " = "+ p.get(key));
            p.put(key,"aaaa");
            p.setProperty((String) key,"aaa");
        }
        System.out.println("Sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");

        p.replace("Application.seguroGirosDBSID",properties1.getDBSID());
        p.put("Application.seguroGirosDBIP",properties1.getDBIP());
        p.put("Application.seguroGirosDBPort", String.valueOf(properties1.getDBPort()));
        p.put("Application.seguroGirosDBUserName",properties1.getDBUserName());
        p.put("Application.seguroGirosDBPassword",properties1.getDBPassword());
        p.put("Application.seguroGirosPartitionCount", String.valueOf(properties1.getPartitionCount()));
        p.put("Application.seguroGirosMinConnectionsPerPartition", String.valueOf(properties1.getMinConnectionsPerPartition()));
        p.put("Application.seguroGirosMaxConnectionsPerPartition", String.valueOf(properties1.getMaxConnectionsPerPartition()));
        p.put("Application.seguroGirosPDFPath",properties1.getPDFPath());
        p.put("Application.AdminEmailAddress",properties1.getAdminEmailAddress());
        p.store(new FileWriter("config.properties"),"");*/
        return null;
    }
}
