$(document).ready(function() {
	$.post("http://localhost:8091/", {
		code : "public class HelloWorld {}"
	}, function(data) {
		console.log(data.内容);
	}, "json");
});
