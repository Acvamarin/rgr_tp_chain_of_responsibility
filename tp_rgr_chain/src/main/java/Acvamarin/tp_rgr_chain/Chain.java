package Acvamarin.tp_rgr_chain;

import java.util.Scanner;

public class Chain {

	private DispenseChain a1;

	public Chain() {

		this.a1 = new Dispense3();
		DispenseChain a2 = new Dispense2();
		DispenseChain a3 = new Dispense1();

		a1.setNextChain(a2);
		a2.setNextChain(a3);
	}

	public static void main(String[] args) {
		Chain atmDispense = new Chain();
		while (true) {
			int amount = 0;
			System.out.println("Введите сумму для выдачи:");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Сумма должна быть кратна 10-ки.");
				return;
			}

			atmDispense.a1.dispense(new Currency(amount));
		}

	}

}
