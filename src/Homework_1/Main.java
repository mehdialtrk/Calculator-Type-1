
package Homework_1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {		//throws InterruptedExpection bekletme için kullanýlan bir yöntemdir
		
		Scanner scanner =new Scanner(System.in);
		
		BasitMakineHesapMakImpl basit=new BasitMakineHesapMakImpl();
		MuhendislikHesapMakImpl muhendislik= new MuhendislikHesapMakImpl();
		System.out.println("**************Hesap Makinesi**************");
		while(true) {
		
		String islem ="\n1-Basit Hesap Makinesi\n"+
				        "2-Muhendislik Hesap Makinesi\n"+
				        "3-Çýkýþ \n";
		System.out.println(islem);
		System.out.print("\nLütfen Bir Hesap Makinesi Seçiniz: ");
		int secenek=scanner.nextInt();
			
		
		
		if(secenek==3) {// Seçenek :Çýkýlþ ise....
			System.out.println("Programdan Çýkýlýyor...");
			Thread.sleep(2000);//bekletme fonksiyonu
			  
			 break;
		}
		else if (secenek==1) {// Seçenek :Basit Hesap Makinesi ise....
			
			System.out.println("**Basit Hesap Makinasýný Seçtiniz**\n");
			Thread.sleep(2000);//bekletme fonksiyonu
		
		
		
		
		while(true) {   Thread.sleep(2000); 
		
		String islem1="\n1-Toplama Ýslemi\n"+
				 	  "2-Çýkarma Ýþlemi\n"+
				      "3-Çarpma Ýslemi\n"+
				      "4-Bölme Ýslemi\n"+
				      "5-Çýkýþ\n ";
		System.out.println(islem1);
	

		System.out.print("\nLütfen Bir Ýþlem Seçiniz: ");
		 int secim=scanner.nextInt();
		 
		 if(secim==5) {
			 
			 System.out.println("Programdan Çýkýlýyor...");
			 Thread.sleep(2000);//bekletme fonksiyonu
			  
			 break;
			 
		 }
		 else if (secim==1) {
			  
			  System.out.println("**Toplama Ýþlemini Seçtiniz**\n");
			 
			  Thread.sleep(2000);//bekletme fonksiyonu
			  
			  System.out.print("1.Sayýyý Giriniz: ");
			  double a=scanner.nextDouble();
			  System.out.print("2.Sayýyý Giriniz: ");
			  double b=scanner.nextDouble();
			  
			  scanner.nextLine();
			 
			  
			  basit.Toplama(a, b);
		}
		  else if (secim==2) {
			  System.out.println("**Çýkarma Ýþlemini Seçtiniz**\n");
			 
			  Thread.sleep(2000);//bekletme fonksiyonu
			  
			  System.out.print("1.Sayýyý Giriniz: ");
			  double a=scanner.nextDouble();
			  System.out.print("2.Sayýyý Giriniz: ");
			  double b=scanner.nextDouble();
			  
			  scanner.nextLine();
			  
			  basit.Cikarma(a, b);
			  
		}
		  else if (secim==3) {
			  
			  System.out.println("**Çarpma Ýþlemini Seçtiniz**\n");
			  
			  Thread.sleep(2000);//bekletme fonksiyonu
			  
			  System.out.print("1.Sayýyý Giriniz: ");
			  double a=scanner.nextDouble();
			  System.out.print("2.Sayýyý Giriniz: ");
			  double b=scanner.nextDouble();
			  
			  scanner.nextLine();
			  
			  basit.Carpma(a, b);
			  
		}
		  else if (secim==4) {
			  System.out.println("**Bölme Ýþlemini Seçtiniz**\n");
			  
			  Thread.sleep(2000);//bekletme fonksiyonu
			  
			  System.out.print("1.Sayýyý Giriniz: ");
			  double a=scanner.nextDouble();
			  System.out.print("2.Sayýyý Giriniz: ");
			  double b=scanner.nextDouble();
			  
			  scanner.nextLine();
			 
			  basit.Bolme(a, b);
			 
		}
		  else {
			System.out.println("\n!!!Geçersiz Bir Ýþlem Seçtiniz.!!!\n"+"\tLütfen Bekleyiniz.");
			
			Thread.sleep(2000);// bekletme fonksiyonu
			
			System.out.println(islem);
		}
	
	}
}
		else if (secenek==2) { 			// secenek :Muhendislik hesap Makinesi  ise....
			
			System.out.println("**Muhendislik Hesap Makinasýný Seçtiniz**\n");
			Thread.sleep(2000);//bekletme fonksiyonu
			
			while(true) {               
				Thread.sleep(2000);
				String islem1="\n1-Toplama Ýslemi\n"+
						      "2-Çýkarma Ýþlemi\n"+
						      "3-Çarpma Ýslemi\n"+
						      "4-Bölme Ýslemi\n"+
						      "5-Karekök Alma Ýþlemi\n"+
						      "6-Üs Alma Ýþlemi\n"+
						      "7-Çýkýþ \n";
				
				System.out.println(islem1);
			
			
				System.out.print("\nLütfen Bir Ýþlem Seçiniz: ");
				int secim=scanner.nextInt();
				
			    if(secim==7) {
					 
					 System.out.println("Programdan Çýkýlýyor...");
					 break;
					 
				 }
				 else if (secim==1) {
					  
					  System.out.println("**Toplama Ýþlemini Seçtiniz**\n");
					 
					  Thread.sleep(2000);//bekletme fonksiyonu
					  
					  System.out.print("1.Sayýyý Giriniz: ");
					  double a=scanner.nextDouble();
					  System.out.print("2.Sayýyý Giriniz: ");
					  double b=scanner.nextDouble();
					  
					  scanner.nextLine();
					  
					  muhendislik.Toplama(a, b);

				}
				  else if (secim==2) {
					  System.out.println("**Çýkarma Ýþlemini Seçtiniz**\n");
					 
					  Thread.sleep(2000);//bekletme fonksiyonu
					  
					  System.out.print("1.Sayýyý Giriniz: ");
					  double a=scanner.nextDouble();
					  System.out.print("2.Sayýyý Giriniz: ");
					  double b=scanner.nextDouble();
					  
					  scanner.nextLine();
					  
					  muhendislik.Cikarma(a, b);
					  
				}
				  else if (secim==3) {
					  
					  System.out.println("**Çarpma Ýþlemini Seçtiniz**\n");
					  
					  Thread.sleep(2000);//bekletme fonksiyonu
					  
					  System.out.print("1.Sayýyý Giriniz: ");
					  double a=scanner.nextDouble();
					  System.out.print("2.Sayýyý Giriniz: ");
					  double b=scanner.nextDouble();
					  
					  scanner.nextLine();
					  
					  muhendislik.Carpma(a, b);
					  
				}
				  else if (secim==4) {
					  System.out.println("**Bölme Ýþlemini Seçtiniz**\n");
					  
					  Thread.sleep(2000);//bekletme fonksiyonu
					  
					  System.out.print("1.Sayýyý Giriniz: ");
					  double a=scanner.nextDouble();
					  System.out.print("2.Sayýyý Giriniz: ");
					  double b=scanner.nextDouble();
					  
					  scanner.nextLine();
					  
					  muhendislik.Bolme(a, b);
					 
				}
				  else if (secim==5) {
					  
					  System.out.println("**Karekök Alma Ýþlemini Seçtiniz**\n");
					  Thread.sleep(2000);//bekletme fonksiyonu
					  
					  System.out.print("Bi Sayý Giriniz: ");
					  double a=scanner.nextDouble();  
					  
					  scanner.nextLine();
					  
					  muhendislik.kok_alma(a);
					
				}
				  else if(secim==6) {
					  
					  System.out.println("**Üs Alma Ýþlemini Seçtiniz**\n");
					  Thread.sleep(2000);//bekletme fonksiyonu
					  
					  System.out.print("Bir Sayý Giriniz: ");
					  double a=scanner.nextDouble(); 
					  System.out.print("üs ifadesini yazýnýz: ");
					  double b=scanner.nextDouble(); 
					  
					  scanner.nextLine();
					  
					  muhendislik.us_alma(a,b);

					  
				  }
				  else {
					System.out.println("\n!!!Geçersiz Bir Ýþlem Seçtiniz.!!!\n"+"\tLütfen Bekleyiniz.");
					
					Thread.sleep(2000);// bekletme fonksiyonu
					
					System.out.println(islem);
				}
			
			}
			
		  }
		
	    }
		
	  }
		
	}


