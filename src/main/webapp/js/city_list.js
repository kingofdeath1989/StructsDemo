$(function() {
	$.post("EchoAction!list.action", {}, function(data) {
		for (var x = 0; x < data.allCities.length; x++) {
			$("#cityTab").append(
					"<tr><td>" + data.allCities[x].cid + "</td><td>"
							+ data.allCities[x].title + "</td></tr>");
		}
	}, "json");
})