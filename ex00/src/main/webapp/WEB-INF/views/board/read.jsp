<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>

<!-- Main content -->
<section class="content">
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title">READ BOARD</h3>
				</div>
				<!-- /.box-header -->

				<form role="form" method="post">
					<input type='hidden' name='bno' value="${boardVO.bno}">
					<!--상세보기 화면의 경우 나중에 수정이나 삭제 작업에서 사용되기 때문에 반드시 원래 게시물 번호인 bno를 가지고 있어야만 한다. 
					그래서 hidden처리를 했다. -->
				</form>

				<div class="box-body">
					<div class="form-group">
						<label for="exampleInputEmail1">Title</label> 
						<input type="text" name='title' class="form-control" value="${boardVO.title}"
							readonly="readonly">	<!--아예 수정할 수 없도록 readonly  -->
					</div>
				
					<div class="form-group">
						<label for="exampleInputPassword1">Content</label>
						<textarea class="form-control" name="content" rows="3"
							readonly="readonly">${boardVO.content}</textarea>
					</div>
	
					<div class="form-group">
						<label for="exampleInputEmail1">Writer</label> 
						<input type="text" name="writer" class="form-control" value="${boardVO.writer}"
							readonly="readonly">
					</div>
				</div>
	
				<!-- /.box-body -->
				<div class="box-footer">
					<button type="submit" class="btn btn-warning">Modify</button>
					<button type="submit" class="btn btn-danger">REMOVE</button>
					<button type="submit" class="btn btn-primary">LIST ALL</button>
				</div>

<script>
$(document).ready(function(){
	
	var formObj = $("form[role='form']");		//이렇게 써서 입력되어 있는 내용을 보내는 거 같다.
	
	console.log("formObj가 뭐야?"+formObj);
	
	$(".btn-warning").on("click", function(){		//.btn-warning로 클릭하면 처리되게 했다.
		formObj.attr("action", "/board/modify");
		formObj.attr("method", "get");		
		formObj.submit();
	});
	
	$(".btn-danger").on("click", function(){
		formObj.attr("action", "/board/remove");
		formObj.submit();
	});
	
	$(".btn-primary").on("click", function(){
		self.location = "/board/listAll";
	});
	
});
</script>
	
			</div>
			<!-- /.box -->
		</div>
		<!--/.col (left) -->
	</div>
	<!-- /.row -->
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<%@include file="../include/footer.jsp"%>
