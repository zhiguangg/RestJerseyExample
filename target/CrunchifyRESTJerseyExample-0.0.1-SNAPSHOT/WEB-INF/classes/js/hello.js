$(document).ready(function() {
	alert("entering js");
    $.ajax({
        url: "http://127.0.0.1:8180/CrunchifyRESTJerseyExample-0.0.1-SNAPSHOT/crunchify/ftocservice/"
    }).then(function(data) {
    	alert('data.C_Value');
       $('.greeting-id').append(data.C_Value);
       $('.greeting-content').append(data.F_Value);
    });

    alert("leaving js");
});

