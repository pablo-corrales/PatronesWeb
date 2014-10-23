package models.DAO;

import java.util.List;

import models.entities.User;

public interface UserDAO extends GenericDAO<User, Integer> {
	public void create(User entity);
    public  User read(Integer id);
    public  void update(User entity);
    public  void delete(User entity);
    public  void deleteByID(Integer id);
    public  List<User> findAll();

}
