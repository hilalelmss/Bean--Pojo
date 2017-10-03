package javaBean;

import java.io.Serializable;

public class Ogrenci implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String adi;
	private String soyadi;
	private int yas;

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

}
