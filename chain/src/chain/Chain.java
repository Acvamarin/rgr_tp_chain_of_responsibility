/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain;

/**
 *
 * @author Кирилл
 */
import java.util.Scanner;

public class Chain {

	private DispenseChain c1;

	public Chain() {
		// initialize the chain
		this.c1 = new Dispenser50$();
		DispenseChain c2 = new Dispenser20$();
		DispenseChain c3 = new Dispenser10$();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		Chain atmDispenser = new Chain();
		while (true) {
			int amount = 0;
			System.out.println("Введите сумму для выдачи");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
                                    System.out.println("Сумма должна быть кратна 10-ки.");
                                    return;	
			}
			// process the request
			
		}

	}

}
