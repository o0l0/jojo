<%@page contentType="text/html; charset=gb2312"%>
<jsp:useBean id="DL" class="mybean.date.DengLu" scope="session"/>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="/favicon.ico" >
<link rel="Shortcut Icon" href="/favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>H-ui.admin v3.1</title>
</head>
<body>

<header class="navbar-wrapper">
	<div class="navbar navbar-fixed-top">
		<div class="container-fluid cl"> <a class="logo navbar-logo f-l mr-10 hidden-xs" href="/aboutHui.shtml">H-ui.admin</a> <a class="logo navbar-logo-m f-l mr-10 visible-xs" href="/aboutHui.shtml">H-ui</a> 
			<span class="logo navbar-slogan f-l mr-10 hidden-xs">v3.1</span> 
			<a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>
			<nav class="nav navbar-nav">
				<ul class="cl">
					<li class="dropDown dropDown_hover"><a href="javascript:;" class="dropDown_A"><i class="Hui-iconfont">&#xe600;</i> ���� <i class="Hui-iconfont">&#xe6d5;</i></a>
						<ul class="dropDown-menu menu radius box-shadow">
							<li><a href="javascript:;" onClick="article_add('�����Ѷ','article-add.html')"><i class="Hui-iconfont">&#xe616;</i> ��Ѷ</a></li>
							<li><a href="javascript:;" onClick="picture_add('�����Ѷ','picture-add.html')"><i class="Hui-iconfont">&#xe613;</i> ͼƬ</a></li>
							<li><a href="javascript:;" onClick="product_add('�����Ѷ','product-add.html')"><i class="Hui-iconfont">&#xe620;</i> ��Ʒ</a></li>
							<li><a href="javascript:;" onClick="member_add('����û�','member-add.html','','510')"><i class="Hui-iconfont">&#xe60d;</i> �û�</a></li>
					</ul>
				</li>
			</ul>
		</nav>
		<nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
			<ul class="cl">
				<li>��������Ա</li>
				<li class="dropDown dropDown_hover">
					<a href="#" class="dropDown_A">22<i class="Hui-iconfont">&#xe6d5;</i></a>
					<ul class="dropDown-menu menu radius box-shadow">
						<li><a href="javascript:;" onClick="myselfinfo()">������Ϣ</a></li>
						<li><a href="login.html">�л��˻�</a></li>
						<li><a href="../Tuic">�˳�</a></li>
				</ul>
			</li>
				<li id="Hui-msg"> <a href="#" title="��Ϣ"><span class="badge badge-danger">1</span><i class="Hui-iconfont" style="font-size:18px">&#xe68a;</i></a> </li>
				<li id="Hui-skin" class="dropDown right dropDown_hover"> <a href="javascript:;" class="dropDown_A" title="����"><i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i></a>
					<ul class="dropDown-menu menu radius box-shadow">
						<li><a href="javascript:;" data-val="default" title="Ĭ�ϣ���ɫ��">Ĭ�ϣ���ɫ��</a></li>
						<li><a href="javascript:;" data-val="blue" title="��ɫ">��ɫ</a></li>
						<li><a href="javascript:;" data-val="green" title="��ɫ">��ɫ</a></li>
						<li><a href="javascript:;" data-val="red" title="��ɫ">��ɫ</a></li>
						<li><a href="javascript:;" data-val="yellow" title="��ɫ">��ɫ</a></li>
						<li><a href="javascript:;" data-val="orange" title="��ɫ">��ɫ</a></li>
					</ul>
				</li>
			</ul>
		</nav>
	</div>
</div>
</header>
<aside class="Hui-aside">
	<div class="menu_dropdown bk_2">
		<dl id="menu-admin">
			<dt><i class="Hui-iconfont">&#xe62d;</i> ����Ա����<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="admin-list.html" data-title="����Ա�б�" href="javascript:void(0)">����Ա�б�</a></li>
					<li><a data-href="admin-list.html" data-title="���ӹ���Ա" href="javascript:void(0)">���ӹ���Ա</a></li>
			</ul>
		</dd>
	</dl>
		<dl id="menu-user">
			<dt><i class="Hui-iconfont">&#xe616;</i> ��Ա����<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="../lookServlet" data-title="��Ա�б�" href="javascript:;">��Ա�б�</a></li>
					<li><a data-href="Zengjia.jsp" data-title="���ӻ�Ա" href="javascript:;">���ӻ�Ա</a></li>
			</ul>
		</dd>
	</dl>
		<dl id="menu-user">
			<dt><i class="Hui-iconfont">&#xe616;</i> �������<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="lookFlServlet" data-title="����б�" href="javascript:;">����б�</a></li>
					<li><a data-href="addfl.jsp" data-title="�������" href="javascript:;">�������</a></li>
			</ul>
		</dd>
	</dl>
	
		<dl id="menu-product">
			<dt><i class="Hui-iconfont">&#xe620;</i> ��Ʒ����<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="lookGoods" data-title="�鿴��Ʒ" href="javascript:void(0)">�鿴��Ʒ</a></li>
					<li><a data-href="addGoods.jsp" data-title="�����Ʒ" href="javascript:void(0)">�����Ʒ</a></li>
			</ul>
		</dd>
	</dl>
		<dl id="menu-orders">
			<dt><i class="Hui-iconfont">&#xe622;</i> ��������<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="http://h-ui.duoshuo.com/admin/" data-title="�鿴" href="javascript:;">�鿴����</a></li>
			</ul>
		</dd>
	</dl>
		<dl id="menu-comments">
			<dt><i class="Hui-iconfont">&#xe622;</i> �������<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="noticeManager.jsp" data-title="�鿴" href="javascript:;">�����б�</a></li>
					<li><a data-href="addnotice.jsp" data-title="�鿴" href="javascript:;">���ӹ���</a></li>
			</ul>
		</dd>
	</dl>
</div>
</aside>
<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
<section class="Hui-article-box">
	<div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
		<div class="Hui-tabNav-wp">
			<ul id="min_title_list" class="acrossTab cl">
				<li class="active">
					<span title="�ҵ�����" data-href="welcome.html">�ҵ�����</span>
					<em></em></li>
		</ul>
	</div>
		<div class="Hui-tabNav-more btn-group"><a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a></div>
</div>
	<div id="iframe_box" class="Hui-article">
		<div class="show_iframe">
			<div style="display:none" class="loading"></div>
			<iframe scrolling="yes" frameborder="0" src="welcome.html"></iframe>
	</div>
</div>
</section>

<div class="contextMenu" id="Huiadminmenu">
	<ul>
		<li id="closethis">�رյ�ǰ </li>
		<li id="closeall">�ر�ȫ�� </li>
</ul>
</div>
<!--_footer ��Ϊ����ģ������ȥ-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer ��Ϊ����ģ������ȥ-->

<!--�����·�д��ҳ��ҵ����صĽű�-->
<script type="text/javascript" src="lib/jquery.contextmenu/jquery.contextmenu.r2.js"></script>
<script type="text/javascript">
$(function(){
	/*$("#min_title_list li").contextMenu('Huiadminmenu', {
		bindings: {
			'closethis': function(t) {
				console.log(t);
				if(t.find("i")){
					t.find("i").trigger("click");
				}		
			},
			'closeall': function(t) {
				alert('Trigger was '+t.id+'\nAction was Email');
			},
		}
	});*/
});
/*������Ϣ*/
function myselfinfo(){
	layer.open({
		type: 1,
		area: ['300px','200px'],
		fix: false, //���̶�
		maxmin: true,
		shade:0.4,
		title: '�鿴��Ϣ',
		content: '<div>����Ա��Ϣ</div>'
	});
}

/*��Ѷ-���*/
function article_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*ͼƬ-���*/
function picture_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*��Ʒ-���*/
function product_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*�û�-���*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}


</script> 


</body>
</html>