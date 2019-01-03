package DAO.Factory;

import DAO.IDAOUser;
import DAO.Postgres.DAOUserPostgres;

public class PostgresFactory extends DAOAbstractFactory {

    public IDAOUser createDAOUser() {
        return new DAOUserPostgres();
    }
}
