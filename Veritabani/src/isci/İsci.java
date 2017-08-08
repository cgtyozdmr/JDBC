package isci;

public class Ýsci {
	
	private String TC,ad,soyad,sehir,cinsiyet;
	private int maas;
	
	


	public Ýsci(String TC, String ad, String soyad, String sehir, String cinsiyet, int maas) {
		super();
		this.setTC(TC);
		this.setAd(ad);
		this.setSoyad(soyad);
		this.setSehir(sehir);
		this.setCinsiyet(cinsiyet);
		this.setMaas(maas);
	}




	public String getTC() {
		return TC;
	}




	public void setTC(String tC) {
		TC = tC;
	}




	public int getMaas() {
		return maas;
	}




	public void setMaas(int maas) {
		this.maas = maas;
	}




	public String getSehir() {
		return sehir;
	}




	public void setSehir(String sehir) {
		this.sehir = sehir;
	}




	public String getCinsiyet() {
		return cinsiyet;
	}




	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}




	public String getAd() {
		return ad;
	}




	public void setAd(String ad) {
		this.ad = ad;
	}




	public String getSoyad() {
		return soyad;
	}




	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

}
