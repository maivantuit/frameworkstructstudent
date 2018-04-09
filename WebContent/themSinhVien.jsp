
<%@page import="model.bean.Khoa"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>Thêm sinh viên</title>
		<title>Insert title here</title>
	</head>
	<body>
		<div class="container">
			<h3>Thêm mới sinh viên</h3>
			<br>
			<html:form action="/themSV" method="post"> <!--/themSV: Đường dẫn -->
				<div class="row form-group">
					<label>Mã SV</label>
					<div>
						<html:text property="msv"></html:text>
					</div>
				</div>
				<div>
					<label>Họ tên</label>
					<div>
						<html:text property="hoTen"></html:text>
					</div>
				</div>
				<div>
					<label>Giới tính</label>
					<div>
						<html:text property="gioiTinh"></html:text>
					</div>
				</div>
				<div>
					<label>Khoa</label>
					<div>
						<html:select property="maKhoa">
							<option value="">--Chọn khoa--</option>
							<html:optionsCollection name="sinhVienForm" property="listKhoa" label="tenKhoa" value="maKhoa"/>
						</html:select>
					</div>
				</div>
				<div>
					<div>
						<html:submit property="submit" value="submit"></html:submit>
						<html:button property="" value="Quay lại"></html:button>
					</div>
				</div>
			</html:form>
		</div>
	
	</body>
</html>