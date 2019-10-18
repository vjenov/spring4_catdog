"use strict";
var auth = auth || {};
auth = (()=>{
    let _, js, auth_vuejs

    let init = ()=>{
        _ = $.ctx()
        js = $.js()
        auth_vuejs = $.js() + '/vue/auth_vue.js'
    }
    
    let onCreate =()=>{
        init()
        $('#a_go_join').click(()=>{
            alert('회원가입 클릭!!')
            $.when(
			$.getScript(auth_vuejs)
		)
		.done(()=>{
			 $('head')
		        .html(auth_vue.join_head())
		            $('body')
		        .html(auth_vue.join_body())
			}
		)
		.fail(()=>{
			alert(WHEN_ERR)
			}			
		)
           
            $('<button>',{
                text : 'Continue to checkout',
                href : '#',
                click : e=>{
                	e.preventDefault();
                	let data = {aid : $('#aid').val(), pwd : $('#pwd').val()}
                	alert('전송아이디: '+data.aid)
                    $.ajax({
                    	url : _+'/admin/join',
                    	type : 'POST',
                    	dataType : 'json',
                    	data : JSON.stringify(data),
                    	contentType : 'application/json',
                    	success : d => {
                    		alert('AJAX 성공 아이디: '+d.aid+', 성공비번: '+d.pwd);
                    	},
                    	error : e => {
                    		alert('AJAX 실패');
                    	}
                    })
                }
            })
            .addClass('btn btn-primary btn-lg btn-block')
            .appendTo('#btn_join')
            
          
            
        });
    }
    return {onCreate : onCreate}
})();