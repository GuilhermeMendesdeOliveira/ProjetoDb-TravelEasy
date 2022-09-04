package application;

import model.entities.Cliente;

public class Program {

	public static void main(String[] args) {
		
		Cliente obj = new Cliente(1, "Maria", 153694067, "maria@gmail.com", 22445566);
		System.out.println(obj);
	}
}
