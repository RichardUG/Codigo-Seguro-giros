app= (function (){
    var properties = {};
    var _funcModify = function (variable) {
        if(variable != null){
             document.getElementById("DBSID").value = variable.dbsid;
             document.getElementById("DBIP").value = variable.dbip;
             document.getElementById("DBPort").value = variable.dbport;
             document.getElementById("DBUserName").value = variable.dbuserName;
             document.getElementById("DBPassword").value = variable.dbpassword;
             document.getElementById("PartitionCount").value = variable.partitionCount;
             document.getElementById("MinConnectionsPerPartition").value = variable.minConnectionsPerPartition;
             document.getElementById("MaxConnectionsPerPartition").value = variable.maxConnectionsPerPartition;
             document.getElementById("PDFPath").value = variable.pdfpath;
             document.getElementById("EmailAddress").value = variable.adminEmailAddress;

        }
    };
    var saveBlueprint = function () {
        console.log(document.getElementById("DBSID").value);
        properties.DBSID=document.getElementById("DBSID").value;
        properties.DBIP=document.getElementById("DBIP").value;
        properties.DBPort=document.getElementById("DBPort").value;
        properties.DBUserName=document.getElementById("DBUserName").value;
        properties.DBPassword=document.getElementById("DBPassword").value;
        properties.PartitionCount=document.getElementById("PartitionCount").value;
        properties.MinConnectionsPerPartition=document.getElementById("MinConnectionsPerPartition").value;
        properties.MaxConnectionsPerPartition=document.getElementById("MaxConnectionsPerPartition").value;
        properties.PDFPath=document.getElementById("PDFPath").value;
        properties.adminEmailAddress=document.getElementById("EmailAddress").value;
    };

    return {
        getProperties: function () {
            apiconnect.getProperties(_funcModify);
        },
        putProperties: function() {
            saveBlueprint();
            apiconnect.putProperties(properties);
        }
    };
})();