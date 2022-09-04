package application;

import model.dao.DaoFactory;
import model.dao.ViagemDao;
import model.entities.Viagem;

public class Program {

	public static void main(String[] args) {
		
		ViagemDao viagemDao = DaoFactory.createViagemDao();
		Viagem viagem = viagemDao.findById(4);
		System.out.println(viagem);
	}
}
