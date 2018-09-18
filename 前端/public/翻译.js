$(document).ready(function() {
	$("#翻译按钮").click(function() {
		$("#对应中文源码").val("处理中...")
		$.post("http://localhost:8091/", {
			code : $("#英文源码输入").val()
		}, function(结果) {
			$("#对应中文源码").val(结果.内容);
		}, "json");
	});
});
