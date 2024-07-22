import java.security.DomainCombiner;

public class Araclar extends KmSayaci {
	int fiyat;
    KmSayaci n3 = new KmSayaci();
    
    
  public int  sehir1;   public int sehir2;
	
	public void ucak() {
		n3.KmHesapla(sehir1,sehir2);
		
		if(n3.sonuc<500) {
			System.out.println("Uçak Yolculuðunu Seçemezsiniz.");
			
		}
		else {
			System.out.println("Yolculuk Tutarý: " + n3.sonuc*1.6 +" TL" );
			
		}


	}
	public void otobus() {
		n3.KmHesapla(sehir1,sehir2);
		
		if(n3.sonuc<100) {
			System.out.println("Otobüs Yolculuðunu Seçemezsiniz,Dolmuþla Yolculuðu Tercih Edebilirsiniz.");
		}
		else if(n3.sonuc>=100 && n3.sonuc<300){
			System.out.println("Yolculuk Tutarý:200 TL");
		}
		else if(n3.sonuc>=300 && n3.sonuc<500) {
			System.out.println("Yolculuk Tutarý:300 TL");
		}
		else if(n3.sonuc>=500 && n3.sonuc<700){
			System.out.println("Yolculuk Tutarý:400 TL");
			
		}
		
		else if(n3.sonuc>=700 && n3.sonuc<900){
			System.out.println("Yolculuk Tutarý:500 TL");
			
		}
		
		else if(n3.sonuc>=900 && n3.sonuc<1100){
			System.out.println("Yolculuk Tutarý:600 TL");
			
		}
		
		else if(n3.sonuc>=1100 && n3.sonuc<1300){
			System.out.println("Yolculuk Tutarý:700 TL");
			
		}
		else if(n3.sonuc>=1300 && n3.sonuc<1500){
			System.out.println("Yolculuk Tutarý:800 TL");
			
		}
		
		else {
			System.out.println("Yolculuk Tutarý:900 TL");
		}
		
		
	}
		
	public void tren() {
		int [] yasak= {n3.getAðrý(),n3.getAntalya(),n3.getArtvin(),n3.getBolu(),n3.getÇanakkale(),n3.getÇorum(),n3.getGiresun(),n3.getGümüþhane(),
		n3.getHakkari(),n3.getKastamonu(),n3.getMuðla(),n3.getOrdu(),n3.getRize(),n3.getSinop(),n3.getTrabzon(),n3.getAksaray(),n3.getBayburt(),n3.getÞýrnak(),
		n3.getBartýn(),n3.getArdahan(),n3.getIðdýr(),n3.getYalova(),n3.getDüzce(),n3.getBursa(),n3.getNevþehir()};
		boolean varMi=false;
		n3.KmHesapla(sehir1,sehir2);
		for(int bul:yasak) {
			if(bul==sehir1 || bul==sehir2) {
			System.out.println("Seçtiðiniz Þehirlerde Demiryolu Hattý Bulunmamaktadýr.");
		    if(bul==sehir1 || bul==sehir2) {
		    	varMi=true;
		    }
				break;
			}
		
		}  if(varMi==false) {
			
		
			
				
						
					
				
			
		
			
		
		
			if(n3.sonuc<100) {
					System.out.println("Seçtiðiniz Ýstikamete Tren Yolculuðu Yapamazsýnýz");
					
				}
				else if(n3.sonuc>=100 && n3.sonuc<300) {
					System.out.println("Yolculuk Tutarý:30 TL");
					
					
				}
				else if(n3.sonuc>=300 && n3.sonuc<500) {
					System.out.println("Yolculuk Tutarý:60 TL");
					
					
				}
				
				else if(n3.sonuc>=500 && n3.sonuc<700) {
					System.out.println("Yolculuk Tutarý:90 TL");
				
					
				}
				
				else if(n3.sonuc>=900 && n3.sonuc<1100) {
					System.out.println("Yolculuk Tutarý:120 TL");
					
					
				}
				
				else if(n3.sonuc>=1100 && n3.sonuc<1300) {
					System.out.println("Yolculuk Tutarý:150 TL");
				
					
				}
				
				else if(n3.sonuc>=1300 && n3.sonuc<1500) {
					System.out.println("Yolculuk Tutarý:180 TL");
					
					
				}
				else {
					System.out.println("Yolculuk Tutarý:210 TL");
				
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
