app.service("EmpService",function($http){
	
	this.uploadFile = function(){
		// 向后台传递数据:
		var formData = new FormData();
		// 向formData中添加数据:
		formData.append("uploadfile",file.files[0]);
		
		return $http({
			method:'post',
			url:'../emp/uploadFile.do',
			data:formData,
			headers:{'Content-Type':undefined} ,// Content-Type : text/html  text/plain
			transformRequest: angular.identity
		});
	}
	
	this.findPage=function(page,rows){
		return $http.get('../emp/findPage.do?page='+page+'&rows='+rows)
	}
	
});