package model.dao;

import db.DB;
import model.dao.impl.ViagemDaoJDBC;

public class DaoFactory {

	public static ViagemDao createViagemDao() {
		return new ViagemDaoJDBC(DB.getConnection());
	}
}
