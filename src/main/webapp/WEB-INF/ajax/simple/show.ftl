<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ajax测试</title>
<script type="text/javascript" src="${rc.getContextPath() }/resources/js/jquery.js"></script>
<script type="text/javascript" src="${rc.getContextPath() }/resources/js/jquery.json.js"></script>
</head>
<body>
${message("info.hello","用户","报表") }
	<ul>
		<li><a id="writeJson" href="json">Write JSON</a>
		</li>
		<li><a id="writeXml" href="xml">Write XML</a>
		</li>
		<li><a id="writeString" href="string.xml">Write XML</a>
		</li>
	</ul>
	<div id="hide">hide me</div>
	<div id="content"></div>
</body>
<script type="text/javascript">
	$(document).ready(function() {
		$("#writeJson").click(function() {
			var link = $(this);
			var type = "json";
			jQuery.ajax({
				url : this.href,
				processData : true,
				dataType : type,
				success : function(json) {
					renderContent(type, json);
				},
				error : function(error) {
					alert("error:" + error);
				}
			});
			return false;
		});
		$("#writeXml").click(function() {
			var link = $(this);
			var type = "xml";
			jQuery.ajax({
				url : this.href,
				processData : true,//contentType为xml时，些值为false
				dataType : type,//json--返回json数据类型；xml--返回xml
				success : function(data) {
					renderContent(type, data);
				},
				error : function(xhr) {
					alert("error:" + xhr);
				}
			});
			return false;
		});
		$("#writeString").click(function() {
			var link = $(this);
			jQuery.ajax({
				url : this.href,
				success : function(data) {
					renderContent('html', data);
				},
				error : function(xhr) {
					alert("error:" + xhr);
				}
			});
			return false;
		});
	});

	function renderContent(dataType, data) {
		var html = '';
		switch (dataType) {
		case 'json':
			html = JSON.stringify(data);
			break;
		case 'html':
			html = data;
			break;
		case 'xml':
			//html = $(data.getElementsByTagName('User'));
			html = $(data).children().text();
		}
		$('#content').empty().html(html);
	}
</script>
</html>
