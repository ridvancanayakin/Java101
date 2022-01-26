
public class Employee {
	String name;
	int hireYear;
	double workHours, salary;
	
	public Employee(String name, double salary, double workHours, int hireyear) {
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireyear;	
	}
	
	public double tax() {
		if(salary<1000) 
			return 0;
		else 
			return salary*0.03;
		
	}
	
	public double bonus() {
		if(workHours>40)
			return (workHours-40)*30;
		else
			return 0;
	}
	
	public double raiseSalary() {
		int seniority=2021-hireYear;
		double result=0;
		if(seniority<10) 
			result=salary*0.05;
		else if(seniority>=10 && seniority<20) 
			result=salary*0.1;
		else 
			result=salary*0.15;
		
		return result;
	}
	public String toString() {
		System.out.println("Adi : " + this.name);
		System.out.println("Maasi : " + this.salary);
		System.out.println("Calisma Saati : " + this.workHours);
		System.out.println("Baslangic Yili : " + this.hireYear);
		System.out.println("Vergi : " + tax());
		System.out.println("Bonus : " + bonus());
		System.out.println("Maas Artisi : " + raiseSalary());
		System.out.println("Vergi ve Bonuslar ile Birlikte Maas : " + (this.salary-tax()+bonus()));
		System.out.println("Toplam Maas : " + (this.salary+raiseSalary()));
		return null;
	}
	

}
