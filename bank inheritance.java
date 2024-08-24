package inheritence;
class Bank {
	double getRate(){
		return 0;
	}
}
class SBI extends Bank{
	double getRate() {
		return 8.3;
	}
}
class ICICI extends Bank{
	double getRate() {
		return 7.4;
	}
}
class AXIS extends Bank{
	double getRate() {
		return 6.0;
	}
		public static void main(String[] args) {
		Bank sbi=new SBI();
		Bank icici=new ICICI();
		Bank axis=new AXIS();
		System.out.println("Sbi intrest "+sbi.getRate() );
		System.out.println("icici intrest "+icici.getRate() );
		System.out.println("axis intrest "+axis.getRate() );
    }
}
