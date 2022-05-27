var apiconnect=(function () {
    var url="http://"+((window.location.href).split('/')[2])+"/GUIProperties";
    console.log(url);
    return{
        getProperties:function(callback) {
            $.get(url).then(responseJSON=>{
                callback(
                   responseJSON
                )
            })
        },
        putProperties:function(properties){
        console.log(properties)
            $.ajax({
                url: url,
                type: 'PUT',
                data: JSON.stringify(properties),
                contentType: "application/json"
            })
        }
    }
})();