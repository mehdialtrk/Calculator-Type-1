package Homework_1;

public class BasitMakineHesapMakImpl implements IBasitHesapMakine{
	private double a;
	private double b;
	
	
	
	
	public BasitMakineHesapMakImpl() { // constructor
		this.a=a;
		this.b=b;
	
	}
		//implements(Toplama, ��karma, �arpma,B�lme)
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
			System.out.println("\nSonuc: Tan�ms�zd�r(O'a B�lme i�lemi ger�ekle�tiremezsiniz) ....");
		}
		return 0;
	}
	
	
}
