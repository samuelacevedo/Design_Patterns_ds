package Service;

import DAO.Factory.DAOAbstractFactory;
import DAO.IDAOUser;
import Entity.User;
import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserService {
    @GET
    public Response getUsers(){
        DAOAbstractFactory factory = DAOAbstractFactory.getFactory();
        IDAOUser dao = factory.createDAOUser();
        ArrayList<User> users = dao.findUsers();
        return Response.ok(new Gson().toJson(users)).build();
    }
}
