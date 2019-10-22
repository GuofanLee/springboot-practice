<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>servlet async support</title>

</head>
<body>
<script type="text/javascript" src="assets/js/jquery-3.3.1.js"></script>
<script type="text/javascript">

    /*页面打开就向后台发送请求*/
    deferred();//1

    function deferred(){
        $.get('defer',function(data){
            /*在控制台输出服务端推送的数据*/
            console.log(data); //2
            /*一次请求完成后再向后台发送请求*/
            deferred(); //3
        });
    }
</script>
</body>
</html>