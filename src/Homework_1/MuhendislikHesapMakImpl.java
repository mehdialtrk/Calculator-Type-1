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
		System.out.println("\n"+a+" say�s�n�n Karek�k�:  "+Math.sqrt(a)+" d�r.");
		return Math.sqrt(a);
	}

	@Override
	public double us_alma(double a,double b) {
		
		System.out.println("\n"+a+" say�s�n�n "+b+".dereceden �ss�:  "+Math.pow(a, b)+" d�r.");
				return Math.pow(a, b);
		
	}
	//implements(Toplama, ��karma, �arpma,B�lme)
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
			System.out.println("\nSonuc: Tan�ms�zd�r(O'a B�lme i�lemi ger�ekle�tiremezsiniz) ....");
		}
		return (a/b);
	}

}
