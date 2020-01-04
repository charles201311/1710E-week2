<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<!-- 引入 css -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/bootstrap.css">
<!-- 引入js -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
</head>
<body>
   <div>
    <form action="/selects" method="post" id="form1">
     价格:<input type="text" name="startPrice" value="${goodsVO.startPrice }" >--<input type="text" name="endPrice" value="${goodsVO.endPrice }"  ><br>
     百分比:<input type="text" name="startSales" value="${goodsVO.startSales}"  >--<input type="text" name="endSales"  value="${goodsVO.endSales }" ><br>
    排序：<select name="orderColum">
     <option value="price" ${goodsVO.orderColum=="price"?"selected":"" }>价格</option>
     <option value="sales" ${goodsVO.orderColum=="sales"?"selected":"" }>百分比</option>
    </select>
    <select name="orderMethod">
     <option value="desc" ${goodsVO.orderColum=="desc"?"selected":"" }>倒序</option>
     <option value="asc" ${goodsVO.orderColum=="asc"?"selected":"" }>正序</option>
    
    </select>
    
    <button type="submit" >查询</button>
    </form>
   
   </div>


	<table class="table table-hover">

		<tr>
			<td>商品ID</td>
			<td>名称</td>
			<td>价格</td>
			<td>销售比</td>
			<td>地区</td>
			<td>审核状态</td>
		</tr>
		<c:forEach items="${info.list}" var="g">
		
		 <tr>
		  <td>${g.id }</td>
		  <td>${g.name }</td>
		  <td>${g.price }</td>
		  <td>${g.sales }</td>
		  <td>${g.areaEnum.name}</td>
		  <td>${g.statusEnum.name}</td>
		 </tr>
		
		</c:forEach>
		 <tr>
		 <td colspan="10"><jsp:include page="/WEB-INF/view/pages.jsp"/> </td>
		 </tr>

	</table>

</body>
<script type="text/javascript">
function goPage(page){
	//带条件的分页
	location.href="/selects?page="+page+"&"+$("#form1").serialize()
}

</script>
</html>