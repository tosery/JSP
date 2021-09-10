$("#btnUpdate").click(function(){
	var dataParam={
		"email" : $("#email").val(),
		"addr" : $("#addr").val(),
		"memo" : $("#memo").val(),
		"id" :$("#id").val()
	}
	$.ajax({
		type:"PUT",
		url:"/update/",
		data: JSON.stringify(dataParam),
		contentType: "application/json;charset=utf-8"
	})
	.done(function(){
		alert("수정 성공");
		location.href="/list"
	})
	.fail(function(){
		alert("수정실패")
	})
})