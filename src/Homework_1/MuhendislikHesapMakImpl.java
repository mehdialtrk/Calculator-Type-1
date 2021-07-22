package	Homework_1;



public class MuhendislikHesapMakImpl implements IMuhendislikHesapMakine{ // us alma ve karekokalma
	
	private double a;
	private double b;
	
	public MuhendislikHesapMakImpl() {
		
		this.a=a;
		this.b=b;
	}
	@Override
	public double kok_alma(double a) {
		System.out.println("\n"+a+" sayýsýnýn Karekökü:  "+Math.sqrt(a)+" dýr.");
		return Math.sqrt(a);
	}

	@Override
	public double us_alma(double a,double b) {
		
		System.out.println("\n"+a+" sayýsýnýn "+b+".dereceden Üssü:  "+Math.pow(a, b)+" dýr.");
				return Math.pow(a, b);
		
	}
	//implements(Toplama, Çýkarma, Çarpma,Bölme)
	@Override
	public double Toplama(double a, double b) {
		
		
		
		
		System.out.println("\nSonuc: "+(a+b));
		return a+b;
	}

	@Override
	public double Cikarma(double a, double b) {
		
		System.out.println("\nSonuc: "+(a-b));
		return a-b;
	}

	@Override
	public double Carpma(double a, double b) {
		
		System.out.println("\nSonuc: "+(a*b));
		return a*b;
	}

	@Override
	public double Bolme(double a, double b) {
		
		if(!(b==0)) {
		
		System.out.println("\nSonuc: "+(a/b));}
		
		else {
			System.out.println("\nSonuc: Tanýmsýzdýr(O'a Bölme iþlemi gerçekleþtiremezsiniz) ....");
		}
		return (a/b);
	}

}
