

public class KmSayaci extends İlKoordinatları{
	
	public double sonuc;

	public void KmHesapla(int x, int y) {
	
	int a=(getKuzeyKoordinatı()[x-1]-getKuzeyKoordinatı()[y-1]);
	int b=(getDoguKoordinatı()[x-1]- getDoguKoordinatı()[y-1]);
    sonuc = Math.sqrt(a*a+b*b);
    sonuc = sonuc*111;
    System.out.println(sonuc+" Km");
	
	}
	



}
