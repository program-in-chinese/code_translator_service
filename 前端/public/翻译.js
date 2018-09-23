$(document).ready(function() {
	$("#翻译按钮").click(function() {
		输出.setValue("处理中...");
		$.post("http://74.91.17.250:8091/", {
			code : 输入.getValue()
		}, function(结果) {
			输出.setValue(结果.内容);
		}, "json");
	});
});
