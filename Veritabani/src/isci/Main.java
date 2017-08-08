package isci;

public class Main {

	public static void main(String[] args) {
		
		Ekleme e=new Ekleme();
		
		Ýsci i1=new Ýsci("13049333534","cagatay","ozdemir","erkek","ankara",255);
		//e.ekle(i1);
		
		MaasArtir m=new MaasArtir();
		m.guncelle(i1);

	}

}
