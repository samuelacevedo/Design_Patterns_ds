package DAO.Factory;

import DAO.IDAOUser;
import Registry.Registry;
import java.sql.Connection;


public abstract class DAOAbstractFactory {

    public static DAOAbstractFactory getFactory(){
        String specificKey = Registry.getInstance().getSpecificKey();
        DAOAbstractFactory factory;
        if(specificKey.equals("postgres")){
            factory = new PostgresFactory();
        }else if(specificKey.equals("mysql")){
            factory = new MySqlFactory();
        }else{
            // Throw Exeption later
            // ...
            factory = null;
        }

        return factory;
    }

    public abstract IDAOUser createDAOUser();

}
