package service;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import dao.CoffeDAO;
import dao.TeaDAO;
import dto.Coffe;
import dto.Tea;

public class SelectDrink implements Kiosk{
	private HashMap<Integer, Coffe> coffe;
	private HashMap<Integer, Tea> tea;
	
	public SelectDrink() {
		
	}

	@Override
	public void action() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("1.Ŀ�� 2. Ƽ : ");
			int category = scan.nextInt();
			
			switch(category) {
				case 0: System.out.println("Ű����ũ ����"); return;
				case 1: selectCoffe(); break;
				case 2: selectTea(); break;
				default :
					System.out.println("�ٽ� �Է��ϼ���");
			}
		}
	}

	private void selectCoffe() {
		CoffeDAO dao = new CoffeDAO();
		coffe = dao.findAll();
		
		Set<Integer> ids = coffe.keySet();
		for(Integer id : ids) {
			System.out.println(id+". "+coffe.get(id));
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴����� : ");
		int menu = sc.nextInt();
		
		Kiosk order = new Order(coffe.get(menu));
		order.action();
	}
	
	private void selectTea() {
		TeaDAO dao = new TeaDAO();
		tea = dao.findAll();
		
		tea.forEach((k,v) -> System.out.println(k+". "+v));
		
//		Set<Integer> ids = tea.keySet();
//		for(Integer id : ids) {
//			System.out.println(id+". "+tea.get(id));
//		}
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴����� : ");
		int menu = sc.nextInt();
		
//		if(tea.get(menu)==null) return;
		if(!tea.containsKey(menu)) return;
		
		Kiosk order = new Order(tea.get(menu));
		order.action();
		
	}
}
