
public class Employee {
	String name;
	int workHours, hireYear;
	double salary;
	
	Employee(String name, double salary, int workHours, int hireYear){
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	
	public double tax() {
		if(salary<1000) {
			return 0;
		}
		else {
			return salary*0.03;
		}
	}
	
	public double bonus() {
		if(workHours>40) {
			return (workHours-40)*30;
		}
		else {
			return 0;
		}
	}
	
	public double raiseSalary() {
		if(2021-hireYear<10) {
			return salary= salary+ salary*0.05;
		}
		else if(2021-hireYear>9 && 2021-hireYear<20) {
			return salary= salary+ salary*0.10;
		}
		else {
			return salary= salary+ salary*0.15;
		}
		
	}
	
	 public String toString() {
	        System.out.println("Adý : " + name);
	        System.out.println("Maaþý : " + salary);
	        System.out.println("Çalýþma Saati : " + workHours);
	        System.out.println("Baþlangýç Yýlý : " + hireYear);
	        System.out.println("Vergi : " + tax());
	        System.out.println("Bonus : " + bonus());
	        System.out.println("Maaþ Artýþý : " + raiseSalary());
	        System.out.println("Vergi ve Bonuslar ile birlikte maaþ : " + (salary - tax() + bonus()));
	        System.out.println("Toplam Maaþ : " + (salary - tax() + bonus() + raiseSalary()));
	        return "";
	    }
}
	
