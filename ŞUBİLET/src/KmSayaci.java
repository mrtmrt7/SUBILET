

public class KmSayaci extends �lKoordinatlar�{
	
	public double sonuc;

	public void KmHesapla(int x, int y) {
	
	int a=(getKuzeyKoordinat�()[x-1]-getKuzeyKoordinat�()[y-1]);
	int b=(getDoguKoordinat�()[x-1]- getDoguKoordinat�()[y-1]);
    sonuc = Math.sqrt(a*a+b*b);
    sonuc = sonuc*111;
    System.out.println(sonuc+" Km");
	
	}
	



}
