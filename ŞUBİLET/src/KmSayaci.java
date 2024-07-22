

public class KmSayaci extends ÝlKoordinatlarý{
	
	public double sonuc;

	public void KmHesapla(int x, int y) {
	
	int a=(getKuzeyKoordinatý()[x-1]-getKuzeyKoordinatý()[y-1]);
	int b=(getDoguKoordinatý()[x-1]- getDoguKoordinatý()[y-1]);
    sonuc = Math.sqrt(a*a+b*b);
    sonuc = sonuc*111;
    System.out.println(sonuc+" Km");
	
	}
	



}
