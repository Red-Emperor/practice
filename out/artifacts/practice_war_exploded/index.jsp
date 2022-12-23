<%--
  Created by IntelliJ IDEA.
  User: cs
  Date: 2022/12/20
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <title>个人博客</title>
  <link rel="stylesheet" href="css/commom.css">
  <link rel="stylesheet" href="css/base.css">
  <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
</head>

<body>
<div class="page">
  <div class="nav">
    <ul class="fr">
      <a href="#"><li>我的博客</li></a>
    </ul>
    <div class="wi">欢迎来到我的博客!</div>
  </div>
  <div class="mid">
    <div class="banner"><img src="img/preview.jpg" alt=""></div>
    <div class="left fl">
      <p class="title">关于我</p>
      <div class="jj">
        <img src="img/2114465718.jpeg" alt="">
        <p><b>姓名：</b>彭于晏</p>
        <p><b>手机：</b>18649357862</p>
        <p><b>邮箱：</b>3648895185@qq.com</p>
        <p><b>爱好：</b>唱歌、跳舞、篮球</p>
      </div>
      <p class="title">愣着干嘛，登录呀！</p>
      <form action="" class="login" method="post">
        <input type="text" placeholder="请输入用户名" value="" />
        <input type="password" placeholder="请输入密码" name="" />
        <!--						<input type="button" onclick='window.open("bedzhao.aspx")' />-->
        <button onclick="window.location.href='login.html'" type="button" id="add">登录</button>

      </form>
    </div>
    <div class="right fl">
      <p class="title">个人简介</p>
      <div class="wz">
        <img src="img/KXKoYWSWh6.png" alt="彭于晏"  >;
        <p>我的名字叫彭于晏，33岁。住在杜王町东北部的别墅区一带，未婚。我在龟友连锁店服务。每天都要加班到晚上8点才能回家。我不抽烟，酒仅止于浅尝。晚上11点睡，每天要睡足8个小时。睡前，我一定喝一杯温牛奶，然后做20分钟的柔软操，上了床，马上熟睡。一觉到天亮，决不把疲劳和压力，留到第二天。医生都说我很正常</p>
      </div>
    </div>
  </div>
  <div class="foot">Welcome to my website</div>
</div>
</body>
</html>
