
public class Main {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Sevilay", 3000, 45, 1980);
		Employee employee2 = new Employee("Zeynep", 2000, 35, 1995);

		System.out.println(employee1);
		System.out.println(employee2);
	}
	
	/*Java'da "Employee" ad�nda fabrika �al��anlar�n� temsil eden ve metotlar� ile �al��anlar�n maa�lar�n� hesaplayan bir s�n�f yazmal�s�n�z. Bu s�n�f 4 nitelik ve 5 metoda sahip olacakt�r.

	S�n�f�n Nitelikleri

	name : �al��an�n ad� ve soyad�
	salary : �al��an�n maa��
	workHours : Haftal�k �al��ma saati
	hireYear : ��e ba�lang�� y�l�
	S�n�f�n Metotlar�

	Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacakt�r.
	tax() : Maa�a uygulanan vergiyi hesaplayacakt�r.
	�al��an�n maa�� 1000 TL'den az ise vergi uygulanmayacakt�r.
	�al��an�n maa�� 1000 TL'den fazla ise maa��n�n %3'� kadar vergi uygulanacakt�r.
	bonus() : E�er �al��an haftada 40 saatten fazla �al��m�� ise fazladan �al��t��� her saat ba��na 30 TL olacak �ekilde bonus �cretleri hesaplayacakt�r.
	raiseSalary() : �al��an�n i�e ba�lang�� y�l�na g�re maa� art���n� hesaplayacakt�r. �uan ki y�l� 2021 olarak al�n.
	E�er �al��an 10 y�ldan az bir s�redir �al���yorsa maa��na %5 zam yap�lacakt�r.
	E�er �al��an 9 y�ldan fazla ve 20 y�ldan az �al���yorsa maa��na %10 zam yap�lacakt�r.
	E�er �al��an 19 y�ldan fazla �al���yorsa %15 zam yap�lacakt�r.
	toString() : �al��ana ait bilgileri ekrana bast�racakt�r.*/

}
