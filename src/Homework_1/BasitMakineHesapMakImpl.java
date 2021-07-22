package Homework_1;

public class BasitMakineHesapMakImpl implements IBasitHesapMakine{
	private double a;
	private double b;
	
	
	
	
	public BasitMakineHesapMakImpl() { // constructor
		this.a=a;
		this.b=b;
	
	}
		//implements(Toplama, Çýkarma, Çarpma,Bölme)
	@Override
	public double Toplama(double a, double b) {
		
		double sonuc;
		
		sonuc= a+b;
		System.out.println("\nSonuc: "+sonuc);
		return sonuc;
	}

	@Override
	public double Cikarma(double a, double b) {
		double sonuc;
		
		sonuc= a-b;
		System.out.println("\nSonuc: "+sonuc);
		return sonuc;
	}

	@Override
	public double Carpma(double a, double b) {
		double sonuc;
		
		sonuc= a*b;
		System.out.println("\nSonuc: "+sonuc);
		return sonuc;
	}

	@Override
	public double Bolme(double a, double b) {
		double sonuc;
		if(!(b==0)) {
		sonuc= a/b;
		System.out.println("\nSonuc: "+sonuc);}
		
		else {
			System.out.println("\nSonuc: Tanýmsýzdýr(O'a Bölme iþlemi gerçekleþtiremezsiniz) ....");
		}
		return 0;
	}
	
	
}
