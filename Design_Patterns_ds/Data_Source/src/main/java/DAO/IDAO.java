package DAO;

import Entity.Entity;

public interface IDAO {
    public void create(Entity entity);
    public void read(Entity entity);
    public void update(Entity entity);
}
