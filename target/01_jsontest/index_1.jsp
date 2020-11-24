<%--
  Created by IntelliJ IDEA.
  User: 10643
  Date: 2020/11/20
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function (){
            $("#djbtn").click(function (){
                $.ajax({
                    url:"oneServlet",
                    type:"get",
                    dataType:"json",
                    success:function (data){
                        alert(data.str)
                    }
                })
            })
        })
    </script>
</head>
<body>
<input type="button" value="点击" id="djbtn">
<div id="onediv" style="background-color: aquamarine;"></div>
</body>
</html>
