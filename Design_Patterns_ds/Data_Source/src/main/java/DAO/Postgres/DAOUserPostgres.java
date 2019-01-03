package DAO.Postgres;

import DAO.IDAOUser;
import Entity.Entity;
import Entity.User;

import java.sql.*;
import java.util.ArrayList;

public class DAOUserPostgres extends DAOPostgres implements IDAOUser {

    private static final String SQL_FIND_USERS =
            "SELECT * FROM PUBLIC.USER";

    public ArrayList<User> findUsers() {
        ArrayList<User> users = new ArrayList<>();
        Connection connection = DAOPostgres.getConnection();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_FIND_USERS);
            while(resultSet.next()){
                User user = new User();
                user.setBirthdate(resultSet.getDate("birthdate"));
                user.setEmail(resultSet.getString("email"));
                user.setFirstname(resultSet.getString("first_name"));
                user.setLastname(resultSet.getString("last_name"));
                user.setId(resultSet.getLong("user_id"));
                users.add(user);
            }
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

        return users;
    }

    public void create(Entity entity) {

    }

    public void read(Entity entity) {

    }

    public void update(Entity entity) {

    }


}
