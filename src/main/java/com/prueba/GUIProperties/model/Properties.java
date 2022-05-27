package com.prueba.GUIProperties.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component(value = "properties")
public class Properties {
    private String DBSID;
    private String DBIP;
    private Integer DBPort;
    private String DBUserName;
    private String DBPassword;
    private Integer PartitionCount;
    private Integer MinConnectionsPerPartition;
    private Integer MaxConnectionsPerPartition;
    private String PDFPath;
    private String adminEmailAddress;

   public Properties(@Value("${Application.seguroGirosDBSID:0}") String DBSID,@Value("${Application.seguroGirosDBIP:0}") String DBIP, @Value("${Application.seguroGirosDBPort:0}") Integer DBPort,@Value("${Application.seguroGirosDBUserName:0}") String DBUserName,@Value("${Application.seguroGirosDBPassword:0}") String DBPassword, @Value("${Application.seguroGirosPartitionCount:0}") Integer PartitionCount, @Value("${Application.seguroGirosMinConnectionsPerPartition:0}") Integer MinConnectionsPerPartition, @Value("${Application.seguroGirosMaxConnectionsPerPartition:0}") Integer MaxConnectionsPerPartition, @Value("${Application.seguroGirosPDFPath:0}") String PDFPath, @Value("${Application.AdminEmailAddress:0}") String adminEmailAddress) {
        this.DBSID = DBSID;
        this.DBIP = DBIP;
        this.DBPort = DBPort;
        this.DBUserName = DBUserName;
        this.DBPassword = DBPassword;
        this.PartitionCount = PartitionCount;
        this.MinConnectionsPerPartition = MinConnectionsPerPartition;
        this.MaxConnectionsPerPartition = MaxConnectionsPerPartition;
        this.PDFPath = PDFPath;
        this.adminEmailAddress = adminEmailAddress;
    }

    public String getDBSID() {
        return DBSID;
    }

    public void setDBSID(String DBSID) {
        this.DBSID = DBSID;
    }

    public String getDBIP() {
        return DBIP;
    }

    public void setDBIP(String DBIP) {
        this.DBIP = DBIP;
    }

    public Integer getDBPort() {
        return DBPort;
    }

    public void setDBPort(Integer DBPort) {
        this.DBPort = DBPort;
    }

    public String getDBUserName() {
        return DBUserName;
    }

    public void setDBUserName(String DBUserName) {
        this.DBUserName = DBUserName;
    }

    public String getDBPassword() {
        return DBPassword;
    }

    public void setDBPassword(String DBPassword) {
        this.DBPassword = DBPassword;
    }

    public Integer getPartitionCount() {
        return PartitionCount;
    }

    public void setPartitionCount(Integer partitionCount) {
        PartitionCount = partitionCount;
    }

    public Integer getMinConnectionsPerPartition() {
        return MinConnectionsPerPartition;
    }

    public void setMinConnectionsPerPartition(Integer minConnectionsPerPartition) {
        MinConnectionsPerPartition = minConnectionsPerPartition;
    }

    public Integer getMaxConnectionsPerPartition() {
        return MaxConnectionsPerPartition;
    }

    public void setMaxConnectionsPerPartition(Integer maxConnectionsPerPartition) {
        MaxConnectionsPerPartition = maxConnectionsPerPartition;
    }

    public String getPDFPath() {
        return PDFPath;
    }

    public void setPDFPath(String PDFPath) {
        this.PDFPath = PDFPath;
    }

    public String getAdminEmailAddress() {
        return adminEmailAddress;
    }

    public void setEmail(String adminEmailAddress) {
        this.adminEmailAddress = adminEmailAddress;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "DBSID='" + DBSID + '\'' +
                ", DBIP='" + DBIP + '\'' +
                ", DBPort=" + DBPort +
                ", DBUserName='" + DBUserName + '\'' +
                ", DBPassword='" + DBPassword + '\'' +
                ", PartitionCount=" + PartitionCount +
                ", MinConnectionsPerPartition=" + MinConnectionsPerPartition +
                ", MaxConnectionsPerPartition=" + MaxConnectionsPerPartition +
                ", PDFPath='" + PDFPath + '\'' +
                ", AdminEmailAddress=" + adminEmailAddress +
                '}';
    }
}
