package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.Khoa;
import model.bo.KhoaBO;
import model.bo.SinhVienBO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.SinhVienForm;

public class ThemSinhVienAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("UTF-8");
		// tao doi tuong SinhVienForm:
		SinhVienForm sinhVienForm = (SinhVienForm) form;
		// lay danh sach khoa:
		KhoaBO khoaBO = new KhoaBO();
		ArrayList<Khoa> listKhoa=khoaBO.getListKhoa();
		sinhVienForm.setListKhoa(listKhoa);
		// check them:
		SinhVienBO sinhvienBO= new  SinhVienBO();
		if("submit".equals(sinhVienForm.getSubmit())){
			String maKhoa= sinhVienForm.getMaKhoa();
			String msv= sinhVienForm.getMsv();
			String hoTen = sinhVienForm.getHoTen();
			String gioiTinh = sinhVienForm.getGioiTinh();
			boolean checkThem=sinhvienBO.themSinhVien(msv, hoTen, gioiTinh, maKhoa);
			if(checkThem){
				return mapping.findForward("themThanhCong");
			}else{
				return mapping.findForward("themThatBai");
			}
		}else{
			return mapping.findForward("themThatBai");
		}
		
		
		
	}
}
