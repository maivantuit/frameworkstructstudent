package form;

import org.apache.struts.action.ActionForm;

public class NguoiDungForm extends ActionForm{
	private String tenDangNhap;
	private String matKhau;
	private String thongBao;
	/**
	 * @return the tenDangNhap
	 */
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	/**
	 * @param tenDangNhap the tenDangNhap to set
	 */
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	/**
	 * @return the matKhau
	 */
	public String getMatKhau() {
		return matKhau;
	}
	/**
	 * @param matKhau the matKhau to set
	 */
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	/**
	 * @return the thongBao
	 */
	public String getThongBao() {
		return thongBao;
	}
	/**
	 * @param thongBao the thongBao to set
	 */
	public void setThongBao(String thongBao) {
		this.thongBao = thongBao;
	}
	
	
}
