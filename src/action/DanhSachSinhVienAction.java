package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.Khoa;
import model.bean.SinhVien;
import model.bo.KhoaBO;
import model.bo.SinhVienBO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.DanhSachSinhVienForm;

public class DanhSachSinhVienAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		DanhSachSinhVienForm danhsachsinhvienForm = (DanhSachSinhVienForm)form;
		
		// lay danh sach cac khoa:
		KhoaBO khoaBO = new KhoaBO();
		ArrayList<Khoa> listKhoa=khoaBO.getListKhoa();
		danhsachsinhvienForm.setListKhoa(listKhoa);
		
		// lay danh sach sinh vien:
		SinhVienBO sinhvienBO = new SinhVienBO();
		String maKhoa = danhsachsinhvienForm.getMaKhoa();
		ArrayList<SinhVien> listSinhVien=null;
		if(maKhoa==null || maKhoa.length()==0){
			listSinhVien=sinhvienBO.getListSinhVien();
		}else{		
			listSinhVien=sinhvienBO.getListSinhVien(maKhoa);
		}
		danhsachsinhvienForm.setListSinhVien(listSinhVien);// set vao trong formDanhSáchinhVien				
		return mapping.findForward("dsSinhVien");
	}
}
