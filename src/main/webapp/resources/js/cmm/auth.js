"use strict"
var auth = auth || {};
auth = (()=>{
	let _, js;
	let init =()=>{
		_ = $.ctx();
		js = $.js();
	}
	let onCreate =()=>{
		init();
		$('#a_go_join').dblclick(()=>{
			alert('회원가입 클릭');
		}); 
	};
	return {onCreate : onCreate};
})();