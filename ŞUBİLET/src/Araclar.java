import java.security.DomainCombiner;

public class Araclar extends KmSayaci {
	int fiyat;
    KmSayaci n3 = new KmSayaci();
    
    
  public int  sehir1;   public int sehir2;
	
	public void ucak() {
		n3.KmHesapla(sehir1,sehir2);
		
		if(n3.sonuc<500) {
			System.out.println("U�ak Yolculu�unu Se�emezsiniz.");
			
		}
		else {
			System.out.println("Yolculuk Tutar�: " + n3.sonuc*1.6 +" TL" );
			
		}


	}
	public void otobus() {
		n3.KmHesapla(sehir1,sehir2);
		
		if(n3.sonuc<100) {
			System.out.println("Otob�s Yolculu�unu Se�emezsiniz,Dolmu�la Yolculu�u Tercih Edebilirsiniz.");
		}
		else if(n3.sonuc>=100 && n3.sonuc<300){
			System.out.println("Yolculuk Tutar�:200 TL");
		}
		else if(n3.sonuc>=300 && n3.sonuc<500) {
			System.out.println("Yolculuk Tutar�:300 TL");
		}
		else if(n3.sonuc>=500 && n3.sonuc<700){
			System.out.println("Yolculuk Tutar�:400 TL");
			
		}
		
		else if(n3.sonuc>=700 && n3.sonuc<900){
			System.out.println("Yolculuk Tutar�:500 TL");
			
		}
		
		else if(n3.sonuc>=900 && n3.sonuc<1100){
			System.out.println("Yolculuk Tutar�:600 TL");
			
		}
		
		else if(n3.sonuc>=1100 && n3.sonuc<1300){
			System.out.println("Yolculuk Tutar�:700 TL");
			
		}
		else if(n3.sonuc>=1300 && n3.sonuc<1500){
			System.out.println("Yolculuk Tutar�:800 TL");
			
		}
		
		else {
			System.out.println("Yolculuk Tutar�:900 TL");
		}
		
		
	}
		
	public void tren() {
		int [] yasak= {n3.getA�r�(),n3.getAntalya(),n3.getArtvin(),n3.getBolu(),n3.get�anakkale(),n3.get�orum(),n3.getGiresun(),n3.getG�m��hane(),
		n3.getHakkari(),n3.getKastamonu(),n3.getMu�la(),n3.getOrdu(),n3.getRize(),n3.getSinop(),n3.getTrabzon(),n3.getAksaray(),n3.getBayburt(),n3.get��rnak(),
		n3.getBart�n(),n3.getArdahan(),n3.getI�d�r(),n3.getYalova(),n3.getD�zce(),n3.getBursa(),n3.getNev�ehir()};
		boolean varMi=false;
		n3.KmHesapla(sehir1,sehir2);
		for(int bul:yasak) {
			if(bul==sehir1 || bul==sehir2) {
			System.out.println("Se�ti�iniz �ehirlerde Demiryolu Hatt� Bulunmamaktad�r.");
		    if(bul==sehir1 || bul==sehir2) {
		    	varMi=true;
		    }
				break;
			}
		
		}  if(varMi==false) {
			
		
			
				
						
					
				
			
		
			
		
		
			if(n3.sonuc<100) {
					System.out.println("Se�ti�iniz �stikamete Tren Yolculu�u Yapamazs�n�z");
					
				}
				else if(n3.sonuc>=100 && n3.sonuc<300) {
					System.out.println("Yolculuk Tutar�:30 TL");
					
					
				}
				else if(n3.sonuc>=300 && n3.sonuc<500) {
					System.out.println("Yolculuk Tutar�:60 TL");
					
					
				}
				
				else if(n3.sonuc>=500 && n3.sonuc<700) {
					System.out.println("Yolculuk Tutar�:90 TL");
				
					
				}
				
				else if(n3.sonuc>=900 && n3.sonuc<1100) {
					System.out.println("Yolculuk Tutar�:120 TL");
					
					
				}
				
				else if(n3.sonuc>=1100 && n3.sonuc<1300) {
					System.out.println("Yolculuk Tutar�:150 TL");
				
					
				}
				
				else if(n3.sonuc>=1300 && n3.sonuc<1500) {
					System.out.println("Yolculuk Tutar�:180 TL");
					
					
				}
				else {
					System.out.println("Yolculuk Tutar�:210 TL");
				
				}
				
				
				
				
			}
			
		

			
		
				
		
		





		
	}
	public int getSehir1() {
		return sehir1;
	}
	public void setSehir1(int sehir1) {
		this.sehir1 = sehir1;
	}
	public int getSehir2() {
		return sehir2;
	}
	public void setSehir2(int sehir2) {
		this.sehir2 = sehir2;
	}	
	


}
