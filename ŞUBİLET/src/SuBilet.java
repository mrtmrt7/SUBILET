import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.Label;
import java.awt.Font;
import java.awt.Choice;
import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;

public class SuBilet extends JFrame  {

	Araclar n6 = new Araclar();
	
	 String[] sehirler ={"ADANA","ADIYAMAN","AFYONKARAHÝSAR","AÐRI","AMASYA","ANKARA","ANTALYA",
				"ARTVÝN","AYDIN","BALIKESÝR","BÝLECÝK","BÝNGÖL","BÝTLÝS","BOLU","BURDUR","BURSA","ÇANAKKALE","ÇANKIRI","ÇORUM","DENÝZLÝ","DÝYARBAKIR","EDÝRNE","ELAZIÐ","ERZÝNCAN","ERZURUM",
				"ESKÝÞEHÝR","GAZÝANTEP","GÝRESUN","GÜMÜÞHANE","HAKKARÝ","HATAY","ISPARTA","MERSÝN","ÝSTANBUL","ÝZMÝR","KARS","KASTAMONU","KAYSERÝ","KIRIKLARELÝ","KIRÞEHÝR","KOCAELÝ","KONYA",
				"KÜTAHYA","MALATYA","MANÝSA","KAHRAMANMARAÞ","MARDÝN","MUÐLA","MUÞ","NEVÞEHÝR","NÝÐDE","ORDU","RÝZE","SAKARYA","SAMSUN","SÝÝRT","SÝNOP","SÝVAS","TEKÝRDAÐ","TOKAT","TRABZON","TUNCELÝ",
				"ÞANLIURFA","UÞAK","VAN","YOZGAT","ZONGULDAK","AKSARAY","BAYBURT","KARAMAN","KIRIKKALE","BATMAN","ÞIRNAK","BARTIN","ARDAHAN","IÐDIR","YALOVA","KARABÜK","KÝLÝS","OSMANÝYE","DÜZCE"};
	 private JTextField yaz;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuBilet frame = new SuBilet();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SuBilet() {
		setForeground(Color.BLACK);
		getContentPane().setForeground(Color.RED);
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("SUB\u0130LET");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 517);
		getContentPane().setLayout(null);
		
		JComboBox NeredenBox = new JComboBox();
		NeredenBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		NeredenBox.setForeground(Color.BLACK);
		NeredenBox.setModel(new DefaultComboBoxModel(sehirler));
		NeredenBox.setBounds(91, 58, 250, 50);
		getContentPane().add(NeredenBox);
		
		JComboBox NereyeBox = new JComboBox();
		NereyeBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		NereyeBox.setForeground(Color.BLACK);
		NereyeBox.setModel(new DefaultComboBoxModel(sehirler));	
		NereyeBox.setBounds(549, 58, 250, 50);
		getContentPane().add(NereyeBox);
		
		

		JButton btnNewButton = new JButton("SE\u00C7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Nereden =(String) NeredenBox.getSelectedItem();
				String Nereye =(String) NereyeBox.getSelectedItem();
				String text ="seçilen þehirler:"+Nereden+"---"+Nereye;	
			   System.out.println(text);
			   for(int i=0;i<sehirler.length;i++) {
				   
				   if(Nereden==sehirler[i]) {
					   
					   n6.sehir1=i;
				   }
			   } 
			   for(int j=0;j<sehirler.length;j++) {
				     if(Nereye==sehirler[j]) {
					   n6.sehir2=j;
				   }
			   }
			  
						
						
			}
			
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(402, 144, 92, 38);
		getContentPane().add(btnNewButton);
		
		Label label = new Label("NEREDEN");
		label.setForeground(new Color(153, 0, 0));
		label.setFont(new Font("Dialog", Font.BOLD, 19));
		label.setBounds(91, 10, 250, 27);
		getContentPane().add(label);
		
		Label label_1 = new Label("NEREYE");
		label_1.setForeground(new Color(153, 0, 0));
		label_1.setFont(new Font("Dialog", Font.BOLD, 20));
		label_1.setBounds(549, 10, 250, 27);
		getContentPane().add(label_1);
		String answer="Yolculuk Tutarý: ";
		String l=" TL";
		Button OtobüsButton = new Button("OTOB\u00DCS");
		OtobüsButton.setForeground(Color.DARK_GRAY);
		OtobüsButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//kmhesapla metodunun kodlarý
				String h=Double.toString(n6.sonuc);
			   if(n6.sehir1==n6.sehir2) {
					System.out.println("Ayný Þehirleri Seçtiniz...");
					yaz.setText("Ayný Þehirleri Seçtiniz");
				}else {
			    int a=(n6.getKuzeyKoordinatý()[n6.sehir1]-n6.getKuzeyKoordinatý()[n6.sehir2]);
				int b=(n6.getDoguKoordinatý()[n6.sehir1]- n6.getDoguKoordinatý()[n6.sehir2]);								
				n6.sonuc = Math.sqrt(a*a+b*b);
			    n6.sonuc = n6.sonuc*111;
			    System.out.println(n6.sonuc+" Km");
				
			    //otobüs metodunun kodlarý
				if(n6.sonuc<100) {
					System.out.println("Otobüs Yolculuðunu Seçemezsiniz,Dolmuþla Yolculuðu Tercih Edebilirsiniz.");
					yaz.setText("Otobüs Yolculuðunu Seçemezsiniz,Dolmuþla Yolculuðu Tercih Edebilirsiniz");
				}
				else if(n6.sonuc>=100 && n6.sonuc<300){
					System.out.println("Yolculuk Tutarý:200 TL");
					yaz.setText("Yolculuk Tutarý:200 TL");
				}
				else if(n6.sonuc>=300 && n6.sonuc<500) {
					System.out.println("Yolculuk Tutarý:300 TL");
					yaz.setText("Yolculuk Tutarý:300 TL");
				}
				else if(n6.sonuc>=500 && n6.sonuc<700){
					System.out.println("Yolculuk Tutarý:400 TL");
					yaz.setText("Yolculuk Tutarý:400 TL");
				}
				
				else if(n6.sonuc>=700 && n6.sonuc<900){
					System.out.println("Yolculuk Tutarý:500 TL");
					yaz.setText("Yolculuk Tutarý:500 TL");
				}
				
				else if(n6.sonuc>=900 && n6.sonuc<1100){
					System.out.println("Yolculuk Tutarý:600 TL");
					yaz.setText("Yolculuk Tutarý:600 TL");
				}
				
				else if(n6.sonuc>=1100 && n6.sonuc<1300){
					System.out.println("Yolculuk Tutarý:700 TL");
					yaz.setText("Yolculuk Tutarý:700 TL");
				}
				else if(n6.sonuc>=1300 && n6.sonuc<1500){
					System.out.println("Yolculuk Tutarý:800 TL");
					yaz.setText("Yolculuk Tutarý:800 TL");
				}
				
				
				else {
					System.out.println("Yolculuk Tutarý:900 TL");
					yaz.setText("Yolculuk Tutarý:900 TL");
				}
				
				}	
			}
			
			});
		OtobüsButton.setFont(new Font("Dialog", Font.BOLD, 15));
		OtobüsButton.setBounds(99, 274, 109, 64);
		getContentPane().add(OtobüsButton);
		
		Button TrenButton = new Button("TREN");
		TrenButton.setForeground(Color.DARK_GRAY);
	
		TrenButton.setFont(new Font("Dialog", Font.BOLD, 15));
		TrenButton.setBounds(408, 251, 109, 87);
		getContentPane().add(TrenButton);
        TrenButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		//kmhesapla metodunun kodlarý
        		String h=Double.toString(n6.sonuc);		
        		if(n6.sehir1==n6.sehir2) {
        						System.out.println("Ayný Þehirleri Seçtiniz...");
        						yaz.setText("Ayný Þehirleri Seçtiniz...");			
        		}else {
        				    int a=(n6.getKuzeyKoordinatý()[n6.sehir1]-n6.getKuzeyKoordinatý()[n6.sehir2]);
        					int b=(n6.getDoguKoordinatý()[n6.sehir1]- n6.getDoguKoordinatý()[n6.sehir2]);
        				    n6.sonuc = Math.sqrt(a*a+b*b);
        				    n6.sonuc = n6.sonuc*111;        				   
        				    System.out.println(n6.sonuc+" Km");
        				  
        				  //tren metodunun kodlarý 
        				
        					int [] yasak= {n6.getAðrý()-1,n6.getAntalya()-1,n6.getArtvin()-1,n6.getBolu()-1,n6.getÇanakkale()-1,n6.getÇorum()-1,n6.getGiresun()-1,n6.getGümüþhane()-1,
        	        				n6.getHakkari()-1,n6.getKastamonu()-1,n6.getMuðla()-1,n6.getOrdu()-1,n6.getRize()-1,n6.getSinop()-1,n6.getTrabzon()-1,n6.getAksaray()-1,n6.getBayburt()-1,n6.getÞýrnak()-1,
        	        				n6.getBartýn()-1,n6.getArdahan()-1,n6.getIðdýr()-1,n6.getYalova()-1,n6.getDüzce()-1,n6.getBursa()-1,n6.getNevþehir()-1};
        	        				boolean varMi=false;
        				    for(int bul:yasak) {
        					if(bul==n6.sehir1 || bul==n6.sehir2) {
        					System.out.println("Seçtiðiniz Þehirlerde Demiryolu Hattý Bulunmamaktadýr.");
							yaz.setText("Seçtiðiniz Þehirlerde Demiryolu Hattý Bulunmamaktadýr.");
        					if(bul==n6.sehir1 || bul==n6.sehir2) {
        				    	varMi=true;
        				    }
        						break;
        					}
        				
        				}  if(varMi==false) {
        					
        				      					
        				        		    				
        				
        					if(n6.sonuc<100) {
        							System.out.println("Seçtiðiniz Ýstikamete Tren Yolculuðu Yapamazsýnýz");
        							yaz.setText("Seçtiðiniz Ýstikamete Tren Yolculuðu Yapamazsýnýz");
        						}
        						else if(n6.sonuc>=100 && n6.sonuc<300) {
        							System.out.println("Yolculuk Tutarý:30 TL");
        							yaz.setText(answer+"30"+l);
        							
        						}
        						else if(n6.sonuc>=300 && n6.sonuc<500) {
        							System.out.println("Yolculuk Tutarý:60 TL");
        							yaz.setText(answer+"60"+l);
        							
        						}
        						
        						else if(n6.sonuc>=500 && n6.sonuc<700) {
        							System.out.println("Yolculuk Tutarý:90 TL");
        							yaz.setText(answer+"90"+l);
        							
        						}
        						
        						else if(n6.sonuc>=900 && n6.sonuc<1100) {
        							System.out.println("Yolculuk Tutarý:120 TL");
        							yaz.setText(answer+"120"+l);
        							
        						}
        						
        						else if(n6.sonuc>=1100 && n6.sonuc<1300) {
        							System.out.println("Yolculuk Tutarý:150 TL");
        							yaz.setText(answer+"150"+l);
        							
        						}
        						
        						else if(n6.sonuc>=1300 && n6.sonuc<1500) {
        							System.out.println("Yolculuk Tutarý:180 TL");
        							yaz.setText(answer+"180"+l);
        							
        						}
        						else {
        							System.out.println("Yolculuk Tutarý:210 TL");
        							yaz.setText(answer+"210"+l);
        						}
        						
        						
        						
        						
        					}
        					
        					}			
        	}
        }
        );
		
		Button UcakButton = new Button("UCAK");
		UcakButton.setForeground(Color.DARK_GRAY);
		UcakButton.setFont(new Font("Dialog", Font.BOLD, 15));
		UcakButton.setBounds(630, 274, 150, 56);
		getContentPane().add(UcakButton);
	UcakButton.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
		//kmhesapla metodunun kodlarý
			
			if(n6.sehir1==n6.sehir2) {
					System.out.println("Ayný Þehirleri Seçtiniz...");
					yaz.setText("Ayný Þehirleri Seçtiniz...");
				}else {
		    int a=(n6.getKuzeyKoordinatý()[n6.sehir1]-n6.getKuzeyKoordinatý()[n6.sehir2]);
			int b=(n6.getDoguKoordinatý()[n6.sehir1]- n6.getDoguKoordinatý()[n6.sehir2]);
		    n6.sonuc = Math.sqrt(a*a+b*b);
		    n6.sonuc = n6.sonuc*111;        				  
		    String h=Double.toString(n6.sonuc);
		    System.out.println(n6.sonuc+" Km");
		   
		    //ucak metodunun kodlarý
			if(n6.sonuc<250) {
				System.out.println("Uçak Yolculuðunu Seçemezsiniz.");
				yaz.setText("Uçak Yolculuðunu Seçemezsiniz.");
			}
			else {
				System.out.println("Yolculuk Tutarý: " + n6.sonuc*1.4 +" TL" );
				String fly=Double.toString(n6.sonuc*1.4);
				yaz.setText(answer+fly+l);
			}

		}
		
		}});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\unnamed.jpg"));
		lblNewLabel.setBounds(421, 58, 50, 50);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\Ads\u0131z_tasar\u0131m-removebg-preview.png"));
		lblNewLabel_1.setBounds(549, 21, 278, 247);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\IMG-1795-removebg-preview.png"));
		lblNewLabel_2.setBounds(431, 192, 63, 71);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\IMG-1799-removebg-preview.png"));
		lblNewLabel_3.setBounds(128, 192, 63, 71);
		getContentPane().add(lblNewLabel_3);
		
		yaz = new JTextField();
		yaz.setFont(new Font("Tahoma", Font.BOLD, 15));
		yaz.setBounds(10, 344, 898, 126);
		getContentPane().add(yaz);
		yaz.setColumns(10);
		
		
		
	}
}
