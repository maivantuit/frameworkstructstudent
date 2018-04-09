package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.NguoiDungBO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.NguoiDungForm;

public class NguoiDungAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		NguoiDungForm nguoidungForm = (NguoiDungForm) form;//Not: new NguoiDungForm();
		NguoiDungBO nguoidungBO = new NguoiDungBO();
		// from request of client:
		String tenDangNhap = nguoidungForm.getTenDangNhap();
		String matKhau = nguoidungForm.getMatKhau();
		if(nguoidungBO.checkLogin(tenDangNhap, matKhau)){
			return mapping.findForward("thanhCong");
		}else{
			return mapping.findForward("thatBai");
		}				
	}
}
