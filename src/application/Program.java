package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Employees;
import entities.OutsourceEmployee;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		
		System.out.print("Insira a quantidade de funcionários: ");
		Integer numEmployees = sc.nextInt();
		
		ArrayList <Employees> list = new ArrayList<>();
		
		for(int i=1; i <= numEmployees; i++) {
			System.out.println("\n===== Dados do(a) #" + i + " funcionário(a) =====");
			
			System.out.print("O funcionário é terceirizado? (s/n): ");
			char outsource = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Digite o nome do(a) funcionário(a): ");
			String name = sc.nextLine();			
			
			System.out.print("Digite a quantidade de horas trabalhadas: ");
			Integer hours = sc.nextInt();
			
			System.out.print("Digite o valor por hora: ");
			Double valuePerHour = sc.nextDouble();
			
			if(outsource == 's') {
				System.out.print("Digite a quantidade de despesas adicionais: ");
				Double additionalCharge = sc.nextDouble();
				Employees emp = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			}else {
				Employees emp = new Employees(name, hours, valuePerHour); 
				list.add(emp);
			}
		}
		System.out.println();
		System.out.println("====== Pagamentos: ======");
		
		for(Employees emp : list) {
			System.out.print(emp.getName() + " - " + emp.payment() + "\n");
		}
		sc.close();
	}

}
