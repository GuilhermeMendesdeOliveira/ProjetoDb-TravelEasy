package application;

import model.dao.DaoFactory;
import model.dao.ViagemDao;
import model.entities.Viagem;

public class Program {

	public static void main(String[] args) {
		
		ViagemDao viagemDao = DaoFactory.createViagemDao();
		System.out.println("===== teste 1: viagem finByID =====");
		Viagem viagem = viagemDao.findById(4);
		System.out.println(viagem);
	}
}
