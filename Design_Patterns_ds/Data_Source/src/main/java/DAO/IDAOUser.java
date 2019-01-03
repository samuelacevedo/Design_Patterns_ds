package DAO;

import Entity.User;
import java.util.ArrayList;


public interface IDAOUser extends IDAO{
    public ArrayList<User> findUsers();
}
