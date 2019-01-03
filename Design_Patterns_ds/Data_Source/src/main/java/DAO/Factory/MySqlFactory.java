package DAO.Factory;

import DAO.IDAOUser;
import DAO.MySql.DAOUserMySql;

public class MySqlFactory extends DAOAbstractFactory {
    public IDAOUser createDAOUser() {
        return new DAOUserMySql();
    }
}
