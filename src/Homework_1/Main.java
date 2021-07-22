
package Homework_1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {		//throws InterruptedExpection bekletme i�in kullan�lan bir y�ntemdir
		
		Scanner scanner =new Scanner(System.in);
		
		BasitMakineHesapMakImpl basit=new BasitMakineHesapMakImpl();
		MuhendislikHesapMakImpl muhendislik= new MuhendislikHesapMakImpl();
		System.out.println("**************Hesap Makinesi**************");
		while(true) {
		
		String islem ="\n1-Basit Hesap Makinesi\n"+
				        "2-Muhendislik Hesap Makinesi\n"+
				        "3-��k�� \n";
		System.out.println(islem);
		System.out.print("\nL�tfen Bir Hesap Makinesi Se�iniz: ");
		int secenek=scanner.nextInt();
			
		
		
		if(secenek==3) {// Se�enek :��k�l� ise....
			System.out.println("Programdan ��k�l�yor...");
			Thread.sleep(2000);//bekletme fonksiyonu
			  
			 break;
		}
		else if (secenek==1) {// Se�enek :Basit Hesap Makinesi ise....
			
			System.out.println("**Basit Hesap Makinas�n� Se�tiniz**\n");
			Thread.sleep(2000);//bekletme fonksiyonu
		
		
		
		
		while(true) {   Thread.sleep(2000); 
		
		String islem1="\n1-Toplama �slemi\n"+
				 	  "2-��karma ��lemi\n"+
				      "3-�arpma �slemi\n"+
				      "4-B�lme �slemi\n"+
				      "5-��k��\n ";
		System.out.println(islem1);
	

		System.out.print("\nL�tfen Bir ��lem Se�iniz: ");
		 int secim=scanner.nextInt();
		 
		 if(secim==5) {
			 
			 System.out.println("Programdan ��k�l�yor...");
			 Thread.sleep(2000);//bekletme fonksiyonu
			  
			 break;
			 
		 }
		 else if (secim==1) {
			  
			  System.out.println("**Toplama ��lemini Se�tiniz**\n");
			 
			  Thread.sleep(2000);//bekletme fonksiyonu
			  
			  System.out.print("1.Say�y� Giriniz: ");
			  double a=scanner.nextDouble();
			  System.out.print("2.Say�y� Giriniz: ");
			  double b=scanner.nextDouble();
			  
			  scanner.nextLine();
			 
			  
			  basit.Toplama(a, b);
		}
		  else if (secim==2) {
			  System.out.println("**��karma ��lemini Se�tiniz**\n");
			 
			  Thread.sleep(2000);//bekletme fonksiyonu
			  
			  System.out.print("1.Say�y� Giriniz: ");
			  double a=scanner.nextDouble();
			  System.out.print("2.Say�y� Giriniz: ");
			  double b=scanner.nextDouble();
			  
			  scanner.nextLine();
			  
			  basit.Cikarma(a, b);
			  
		}
		  else if (secim==3) {
			  
			  System.out.println("**�arpma ��lemini Se�tiniz**\n");
			  
			  Thread.sleep(2000);//bekletme fonksiyonu
			  
			  System.out.print("1.Say�y� Giriniz: ");
			  double a=scanner.nextDouble();
			  System.out.print("2.Say�y� Giriniz: ");
			  double b=scanner.nextDouble();
			  
			  scanner.nextLine();
			  
			  basit.Carpma(a, b);
			  
		}
		  else if (secim==4) {
			  System.out.println("**B�lme ��lemini Se�tiniz**\n");
			  
			  Thread.sleep(2000);//bekletme fonksiyonu
			  
			  System.out.print("1.Say�y� Giriniz: ");
			  double a=scanner.nextDouble();
			  System.out.print("2.Say�y� Giriniz: ");
			  double b=scanner.nextDouble();
			  
			  scanner.nextLine();
			 
			  basit.Bolme(a, b);
			 
		}
		  else {
			System.out.println("\n!!!Ge�ersiz Bir ��lem Se�tiniz.!!!\n"+"\tL�tfen Bekleyiniz.");
			
			Thread.sleep(2000);// bekletme fonksiyonu
			
			System.out.println(islem);
		}
	
	}
}
		else if (secenek==2) { 			// secenek :Muhendislik hesap Makinesi  ise....
			
			System.out.println("**Muhendislik Hesap Makinas�n� Se�tiniz**\n");
			Thread.sleep(2000);//bekletme fonksiyonu
			
			while(true) {               
				Thread.sleep(2000);
				String islem1="\n1-Toplama �slemi\n"+
						      "2-��karma ��lemi\n"+
						      "3-�arpma �slemi\n"+
						      "4-B�lme �slemi\n"+
						      "5-Karek�k Alma ��lemi\n"+
						      "6-�s Alma ��lemi\n"+
						      "7-��k�� \n";
				
				System.out.println(islem1);
			
			
				System.out.print("\nL�tfen Bir ��lem Se�iniz: ");
				int secim=scanner.nextInt();
				
			    if(secim==7) {
					 
					 System.out.println("Programdan ��k�l�yor...");
					 break;
					 
				 }
				 else if (secim==1) {
					  
					  System.out.println("**Toplama ��lemini Se�tiniz**\n");
					 
					  Thread.sleep(2000);//bekletme fonksiyonu
					  
					  System.out.print("1.Say�y� Giriniz: ");
					  double a=scanner.nextDouble();
					  System.out.print("2.Say�y� Giriniz: ");
					  double b=scanner.nextDouble();
					  
					  scanner.nextLine();
					  
					  muhendislik.Toplama(a, b);

				}
				  else if (secim==2) {
					  System.out.println("**��karma ��lemini Se�tiniz**\n");
					 
					  Thread.sleep(2000);//bekletme fonksiyonu
					  
					  System.out.print("1.Say�y� Giriniz: ");
					  double a=scanner.nextDouble();
					  System.out.print("2.Say�y� Giriniz: ");
					  double b=scanner.nextDouble();
					  
					  scanner.nextLine();
					  
					  muhendislik.Cikarma(a, b);
					  
				}
				  else if (secim==3) {
					  
					  System.out.println("**�arpma ��lemini Se�tiniz**\n");
					  
					  Thread.sleep(2000);//bekletme fonksiyonu
					  
					  System.out.print("1.Say�y� Giriniz: ");
					  double a=scanner.nextDouble();
					  System.out.print("2.Say�y� Giriniz: ");
					  double b=scanner.nextDouble();
					  
					  scanner.nextLine();
					  
					  muhendislik.Carpma(a, b);
					  
				}
				  else if (secim==4) {
					  System.out.println("**B�lme ��lemini Se�tiniz**\n");
					  
					  Thread.sleep(2000);//bekletme fonksiyonu
					  
					  System.out.print("1.Say�y� Giriniz: ");
					  double a=scanner.nextDouble();
					  System.out.print("2.Say�y� Giriniz: ");
					  double b=scanner.nextDouble();
					  
					  scanner.nextLine();
					  
					  muhendislik.Bolme(a, b);
					 
				}
				  else if (secim==5) {
					  
					  System.out.println("**Karek�k Alma ��lemini Se�tiniz**\n");
					  Thread.sleep(2000);//bekletme fonksiyonu
					  
					  System.out.print("Bi Say� Giriniz: ");
					  double a=scanner.nextDouble();  
					  
					  scanner.nextLine();
					  
					  muhendislik.kok_alma(a);
					
				}
				  else if(secim==6) {
					  
					  System.out.println("**�s Alma ��lemini Se�tiniz**\n");
					  Thread.sleep(2000);//bekletme fonksiyonu
					  
					  System.out.print("Bir Say� Giriniz: ");
					  double a=scanner.nextDouble(); 
					  System.out.print("�s ifadesini yaz�n�z: ");
					  double b=scanner.nextDouble(); 
					  
					  scanner.nextLine();
					  
					  muhendislik.us_alma(a,b);

					  
				  }
				  else {
					System.out.println("\n!!!Ge�ersiz Bir ��lem Se�tiniz.!!!\n"+"\tL�tfen Bekleyiniz.");
					
					Thread.sleep(2000);// bekletme fonksiyonu
					
					System.out.println(islem);
				}
			
			}
			
		  }
		
	    }
		
	  }
		
	}


